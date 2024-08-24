package com.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bb.service.AuthJwtToken;
import com.bb.service.BookingDetails;
import com.bb.service.EmailSendService;
import com.controller.helper.MailHelper;
import com.controller.helper.Response;
import com.controller.helper.UserAccessToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongo.repository.JwtTokenRepository;
import com.user.entity.MailsData;
import com.user.entity.MailsDataAttachment;
import com.user.entity.User;
import com.user.entity.UserLog;
import com.user.repository.UserLogRepository;
import com.user.repository.UserRepository;
import com.util.MailTicket;

@RestController
@RequestMapping("rail/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserLogRepository userLogRepository;
	@Autowired
	JwtTokenRepository jwtTokenRepository;
	@Autowired
	BookingDetails bookingDetails;
	@Autowired
	EmailSendService emailSendService;
	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	AuthJwtToken jwtAuthToken;

	

	@CrossOrigin
	@PostMapping("/registration")
	public Response userRegister(@RequestHeader(value = "siteId", required = false) Integer siteId,
			@RequestBody User user) {

		User userDb = userRepository.findByEmail(user.getEmail());
		Response res = new Response();

		if (userDb == null) {
			userDb = new User();
			userDb.setEmail(user.getEmail());
			userDb.setIsVerified(user.getIsVerified());
			userDb.setName(user.getName());
			userDb.setPassword(user.getPassword());
			userDb.setProvider(user.getProvider());
			userDb.setRole(user.getRole());
			userDb.setUpdatedAt(new Date());
			userDb.setPhone(user.getPhone());
			userDb.setAddress(user.getAddress());
			userDb.setDob(user.getDob());

			User userCreated = userRepository.save(userDb);
			UserLog userLog = new UserLog(userCreated);
			userLogRepository.save(userLog);

			String token = jwtAuthToken.createAccessToken(user.getEmail(), userCreated.getId(), false);
			userCreated.setToken(token);
			res.setPayload(userCreated);
			res.setMessage("sucessful");
		} else {
			res.setPayload(userDb);
			res.setMessage("User already exit");
			res.setCode(200);
		}
		return res;
	}

	@CrossOrigin
	@GetMapping("/userLogin")
	public Response userLogin(@RequestHeader(value = "siteId", required = false) Long siteId,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println("email:" + email + ", password:" + password);
		User userSql = null;
		Response res = new Response();
		try {
			userSql = userRepository.findByEmailAndPassword(email, password);
			if (userSql != null) {
				String token = jwtAuthToken.createAccessToken(userSql.getEmail(), userSql.getId(), false);
				userSql.setToken(token);
				res.setPayload(userSql);
				res.setMessage("ok");
				res.setCode(200);

			} else {
				userSql.setPassword(null);
				res.setPayload(userSql);
				res.setMessage("User does not exit");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return res;

	}

	@CrossOrigin
	@GetMapping("/resetAccessToken")
	public Response resetAccessToken(@RequestHeader(value = "siteId", required = true) Long siteId,
			@RequestHeader(value = "email") String email) {

		Response res = new Response();
		User user = null;
		try {
			user = userRepository.findByEmail(email);

		} catch (Exception e) {
			res.setMessage("not found");
		}

		jwtAuthToken.createAccessToken(user.getEmail(), user.getId(), true);
		UserAccessToken accessToken = jwtTokenRepository.findByEmail(email);
		accessToken.setUserId(null);
		res.setPayload(accessToken);
		res.setMessage("sucessful");
		res.setCode(200);
		return res;
	}

	//	@CrossOrigin
	// @GetMapping("/getUserAccessToken")
	public Response getUserAccessToken(@RequestHeader(value = "siteId", required = true) Long siteId,
		@RequestHeader(value = "accessToken", required = false) String accessToken,
		@RequestHeader HttpHeaders headers) {
	
		String authorizationHeader = headers.getFirst("Authorization");
		if (authorizationHeader != null) {
			accessToken = authorizationHeader.substring("Bearer ".length());
		}
		Response res = new Response();
		UserAccessToken userAccessToken = jwtTokenRepository.findByAccessToken(accessToken);
		userAccessToken.setUserId(null);
		res.setPayload(userAccessToken);
		res.setMessage("sucessful");
		res.setCode(200);
		return res;
	}

	@CrossOrigin
	@PostMapping("/save")
	public Response saveEmployee(@RequestHeader(value = "siteId", required = false) Integer siteId,
			@RequestBody User user) {

		User userDb = userRepository.findByEmail(user.getEmail());

		if (userDb == null)
			userDb = new User();
		userDb.setEmail(user.getEmail());
		userDb.setIsVerified(user.getIsVerified());
		userDb.setName(user.getName());
		userDb.setPassword(user.getPassword());
		userDb.setProvider(user.getProvider());
		userDb.setRole(user.getRole());
		userDb.setUpdatedAt(new Date());
		userDb.setPhone(user.getPhone());
		userDb.setAddress(user.getAddress());
		userDb.setDob(user.getDob());

		User userDb2 = userRepository.save(userDb);
		UserLog userLog = new UserLog(userDb2);
		userLogRepository.save(userLog);
		Response res = new Response();
		String token = jwtAuthToken.createAccessToken(userDb2.getEmail(), userDb2.getId(), false);
		userDb2.setPassword(token);
		res.setPayload(userDb2);
		res.setMessage("sucessful");
		res.setCode(200);
		return res;
	}

	@CrossOrigin
	@PostMapping("/updatePasswordLink")
	public Response updatePasswordLink(@RequestHeader(value = "siteId", required = false) Integer siteId,
			@RequestParam(value = "email", required = true) String email) {
	
			Response res = new Response();
			User userDb = userRepository.findByEmail(email);
			if (userDb != null) {
					String token = jwtAuthToken.createAccessToken(email, userDb.getId(), true);
					res.setCode(200);
					res.setMessage("success");
					res.setPayload(token);
					return res;
			} else {
					res.setCode(404);
					res.setMessage("Email not found");
					res.setPayload(null);
					return res;
			}
	}

	@CrossOrigin
	@PostMapping("/updatePassword")
	public Response updatePassword(@RequestHeader(value = "siteId", required = false) Integer siteId,
			@RequestHeader(value = "passToken", required = true) String passToken,
			@RequestHeader(value = "email", required = true) String email,
			@RequestHeader(value = "password", required = true) String password) {

		Response res = new Response();
		UserAccessToken userAccessToken = jwtTokenRepository.findByAccessToken(passToken);
		if (userAccessToken != null && userAccessToken.getEmail().equals(email)) {
		
				User userDb = userRepository.findByEmail(email);
				if (userDb!=null) {
						userDb.setPassword(password);
						User userDb2 = userRepository.save(userDb);
						UserLog userLog = new UserLog(userDb2);
						userLogRepository.save(userLog);
						String token = jwtAuthToken.createAccessToken(userDb2.getEmail(), userDb2.getId(), false);
						 userDb2.setPassword("");
						 userDb2.setToken(token);
						res.setPayload(userDb2);
						res.setMessage("sucessful");
						res.setCode(200);
						return res;
				} else {
						res.setMessage("User not found");
						res.setCode(404);
						return res;
				}
		} else {
				res.setMessage("Unauthorized");
				res.setCode(401);
				return res;
		}
	}

	@CrossOrigin
	@GetMapping("/findByUserId/{userId}")
	public Response updateForm(@RequestHeader(value = "siteId", required = true) Long siteId,
			@PathVariable(value = "userId") Long userId) {
		ObjectMapper mapper = new ObjectMapper();
		Response res = new Response();
		User user = null;
		try {
				Optional<User> checkUser = userRepository.findById(userId);
				if (checkUser != null) {
					user = checkUser.get();
					user.setPassword("");
				}
		} catch (Exception e) {
				res.setMessage("not found");
		}
		// UserAccessToken checkToken=jwtTokenRepository.findByUserId(userId);
		// jwtAuthToken.jwtTokenBYaccessToken(""+checkToken.getAccessToken() , userId);
		res.setPayload(user);
		res.setMessage("sucessful");
		return res;
	}

	@CrossOrigin
	@GetMapping("/findByEmail/{email}")
	public Response bookingReference(@RequestHeader(value = "siteId", required = false) Long siteId,
			@PathVariable(value = "email") String email) {
		User user = null;
		Response res = new Response();
		try {
			user = userRepository.findByEmail(email);
			if (user != null) {

				// String token = jwtAuthToken.createAccessToken(email, user.getId());
				// user.setPassword(token);
				res.setPayload(user);
				res.setCode(200);
				res.setMessage("sucessful");
			} else {
				res.setPayload(null);
				res.setCode(404);
				res.setMessage("fail");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return res;
	}

	@CrossOrigin
	@PostMapping("/sendMail")
	public Response sendMail(@RequestHeader(value = "siteId", required = false) Long siteId,
			@RequestBody MailsData mailsData) {
		Response res = new Response();
	
		try {
			mailsData.setFrom("info@cheaptraintickets.in");
			MailTicket mailticket = new MailTicket(mailsData);
			for (MailsDataAttachment attach : mailsData.getAttachmentUrl()) {
				String fileName = mailticket.downLadFile(attach.getPublicUrl());
			}

		
			mailticket.start();
			res.setPayload("");
			res.setMessage("sucessful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res.setPayload("");
			res.setMessage("Fail");
		}

		return res;
	}
	@CrossOrigin
	@PostMapping("/sendReundMail/{booking}")
	public Response sendReundMail(@PathVariable String booking ,@RequestHeader(value = "siteId", required = false) Long siteId,
			@RequestHeader(value = "bookingId", required = false) String bookingId) {
		Response res = new Response();
		MailHelper mailHelper = new MailHelper();
		mailHelper = bookingDetails.RefundMail(bookingId);
//		String uri = "https://report.cheaptraintickets.co.uk/mailtemplate/refund-email.php?bref="+mailHelper.getBookingReference()+
//				"&frm="+mailHelper.getOrigin()+"&to="+mailHelper.getDestination()+"&name="+mailHelper.getName()+"&dep="+mailHelper.getDeparture()+
//				"&arr="+mailHelper.getArrival()+"&pnr="+mailHelper.getPnr()+"&amt="+mailHelper.getTotalamount()+"&fee="+mailHelper.getPartnerComission()+
//				"&ref="+mailHelper.getRefund();
		try {
			emailSendService.mailsend(mailHelper,booking);
			res.setPayload("");
			res.setMessage("mail send successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res.setPayload("");
			res.setMessage("sucessful in catch ");
		}			
		return res;
	}

}
