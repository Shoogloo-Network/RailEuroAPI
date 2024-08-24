package com.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.BookingDetailHelper;
import com.controller.helper.CustomBookingTraveler;
import com.controller.helper.CustomBookingTravelerHead;
import com.controller.helper.Response;
import com.controller.helper.booking.Booking;
import com.controller.helper.booking.BookingTraveler;
import com.controller.helper.booking.PointToPointBookingItem;
import com.controller.helper.booking.PointToPointOffersSearchResults;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.entity.BookingDetail;
import com.user.entity.TravelerDetail;
import com.user.repository.BookingDetailRepository;
import com.user.repository.TravelerDetailRepository;
import com.util.Utility;

@RestController
@RequestMapping("rail/userDetail")
public class BookingDetailController {
	@Autowired
	BookingDetailRepository bookingDetailRepository;
	@Autowired
	TravelerDetailRepository travelerDetailRepository;
	@Autowired
	Utility utility;
	private static final Logger LOGGER = LoggerFactory.getLogger(BookingDetailController.class);

	@CrossOrigin
	@PostMapping("/save")
	public Response saveEmployee(@RequestHeader(value = "siteId", required = true) Integer siteId,
			@RequestBody BookingDetailHelper country) {

		Response res = new Response();
		BookingDetail booking = new BookingDetail();
		booking.setId(country.getId());
		booking.setAppProvider(country.getAppProvider());
		booking.setBookingDetails("" + country.getBookingDetails());
		// System.out.println("country.getBookingDetails()="+country.getBookingDetails());
		booking.setBookingId(country.getBookingId());
		booking.setBookingReference(country.getBookingReference());
		booking.setCreateDate(country.getCreateDate());
		booking.setSiteId(country.getSiteId());
		booking.setUserId(country.getUserId());
		booking.setBookingStatus(country.getBookingStatus());
		BookingDetail country2 = bookingDetailRepository.save(booking);
		res.setPayload(country2);
		res.setMessage("sucessful");

		return res;
	}

	@CrossOrigin
	@PutMapping("/update")
	public Response update(@RequestHeader(value = "siteId", required = true) Integer siteId,
			@RequestBody BookingDetailHelper country) {
		ObjectMapper mapper = new ObjectMapper();
		Response res = new Response();
		BookingDetail bookingList = bookingDetailRepository.findBySiteIdAndBookingReference(country.getSiteId(),
				country.getBookingReference());
		BookingDetail booking = null;
		Map<Integer, List<BookingTraveler>> map = new HashMap<Integer, List<BookingTraveler>>();
		if (bookingList != null)
			booking = bookingList;
		else
			booking = new BookingDetail();

		booking.setAppProvider(country.getAppProvider());
		try {
			booking.setBookingDetails(mapper.writeValueAsString(country.getBookingDetails()));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("country.getBookingDetails()="+country.getBookingDetails());
		booking.setBookingId(country.getBookingId());
		booking.setBookingReference(country.getBookingReference());
		booking.setCreateDate(country.getCreateDate());
		booking.setSiteId(country.getSiteId());
		booking.setUserId(country.getUserId());
		booking.setBookingStatus(country.getBookingStatus());
		booking.setExpirationDate(country.getExpirationDate());
		booking.setFirstDateOfTravel(country.getFirstDateOfTravel());
		// booking.setPnr(country.getp);
		booking.setTicketPrice(country.getTicketPrice());
		booking.setTotalTravelers(country.getTotalTravelers());

		try {
			int i = 0;
			CustomBookingTravelerHead head = new CustomBookingTravelerHead();
			List<CustomBookingTraveler> list = new ArrayList<CustomBookingTraveler>();
			for (PointToPointBookingItem li : country.getBookingDetails().getBookingItems()) {
				CustomBookingTraveler h = new CustomBookingTraveler();
				h.setBookingItemId(li.getId());
				List<BookingTraveler> map2 = new ArrayList<BookingTraveler>();
				map2.addAll(li.getTravelers());
				h.setTravelers(map2);
				list.add(h);

			}
			head.setBooking(list);
			booking.setTotalTravelersDetails(mapper.writeValueAsString(head));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BookingDetail country2 = bookingDetailRepository.save(booking);

		Booking emp2 = null;
		try {
			emp2 = mapper.readValue(country2.getBookingDetails(), Booking.class);

		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		BookingDetailHelper con = new BookingDetailHelper();
		con.setAppProvider(country2.getAppProvider());
		con.setBookingDetails(emp2);
		con.setBookingId(country2.getBookingId());
		con.setBookingReference(country2.getBookingReference());
		con.setBookingStatus(country2.getBookingStatus());
		con.setCreateDate(country2.getCreateDate());
		con.setId(country2.getId());
		con.setSiteId(country2.getSiteId());
		con.setUserId(country2.getUserId());
		con.setBookingStatus(country2.getBookingStatus());
		con.setExpirationDate(country2.getExpirationDate());
		con.setFirstDateOfTravel(country2.getFirstDateOfTravel());
		// booking.setPnr(country.getp);
		con.setTicketPrice(country2.getTicketPrice());
		con.setTotalTravelers(country2.getTotalTravelers());
		updateTravlerDetails(country.getUserId(), country.getBookingDetails());
		try {

			con.setTravelers(mapper.readValue(country2.getTotalTravelersDetails(), CustomBookingTravelerHead.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		res.setPayload(con);
		res.setMessage("sucessful");
		res.setCode(200);
		return res;
	}

	private void updateTravlerDetails(Long userId, Booking booking) {
		// List<TravelerDetail>travelerList=travelerDetailRepository.findByUserId(userId);
		// Map<String,TravelerDetail>travelerMap=new HashMap<String,TravelerDetail>();

		for (PointToPointBookingItem item : booking.getBookingItems()) {

			for (BookingTraveler traveler : item.getTravelers()) {
				String alias = traveler.getFirstName() + traveler.getLastName();
				if (alias.length() > 200)
					alias = alias.substring(0, 200);
				TravelerDetail trevelerDetai = travelerDetailRepository.findByUserIdAndAlias(userId, alias);
				if (trevelerDetai == null)
					trevelerDetai = new TravelerDetail();
				trevelerDetai.setCountryOfResidence(traveler.getCountryOfResidence());
				trevelerDetai.setCurDate(new Date());
				trevelerDetai.setDob(traveler.getDateOfBirth());
				trevelerDetai.setEmailAddress(traveler.getEmailAddress());

				trevelerDetai.setfName(traveler.getFirstName());
				if (traveler.getLeadTraveler())
					trevelerDetai.setLeadTravler(1);
				else
					trevelerDetai.setLeadTravler(0);
				trevelerDetai.setLname(traveler.getLastName());
				trevelerDetai.setPhoneNumber(traveler.getPhoneNumber());
				trevelerDetai.setPlaceOfBirth(traveler.getPlaceOfBirth());

				trevelerDetai.setAlias(alias);
				travelerDetailRepository.save(trevelerDetai);
			}
		}

	}

	@CrossOrigin
	@GetMapping("/findByUserId2/{userId}")
	public Response updateForm(@RequestHeader(value = "siteId", required = true) Long siteId,
			@PathVariable(value = "userId") Long userId) {
		ObjectMapper mapper = new ObjectMapper();
		Response res = new Response();
		List<BookingDetail> country2 = bookingDetailRepository.findBySiteIdAndUserIdOrderByCreateDateDesc(siteId,
				userId);
		List<BookingDetailHelper> BookingDetailHelperList = new ArrayList<BookingDetailHelper>();
		for (BookingDetail bookingDetail : country2) {
			Booking emp2 = null;
			try {
				emp2 = mapper.readValue(bookingDetail.getBookingDetails(), Booking.class);

			} catch (JsonMappingException e) {

				e.printStackTrace();
			} catch (JsonProcessingException e) {

				e.printStackTrace();
			}
			BookingDetailHelper con = new BookingDetailHelper();
			con.setAppProvider(bookingDetail.getAppProvider());
			con.setBookingDetails(emp2);
			con.setBookingId(bookingDetail.getBookingId());
			con.setBookingReference(bookingDetail.getBookingReference());
			con.setBookingStatus(bookingDetail.getBookingStatus());
			if (bookingDetail.getBookingStatus().equals("PREBOOKED")) {
				Date date1 = Calendar.getInstance().getTime();
				if (bookingDetail.getExpirationDate().before(date1))
					con.setExpired(true);
				else
					con.setExpired(false);
			}

			con.setCreateDate(bookingDetail.getCreateDate());
			con.setId(bookingDetail.getId());
			con.setSiteId(bookingDetail.getSiteId());
			con.setUserId(bookingDetail.getUserId());
			BookingDetailHelperList.add(con);
			con.setBookingStatus(bookingDetail.getBookingStatus());
			con.setExpirationDate(bookingDetail.getExpirationDate());
			con.setFirstDateOfTravel(bookingDetail.getFirstDateOfTravel());
			// booking.setPnr(country.getp);
			con.setTicketPrice(bookingDetail.getTicketPrice());
			con.setTotalTravelers(bookingDetail.getTotalTravelers());
			try {
				Map<Integer, List<BookingTraveler>> map = new HashMap<Integer, List<BookingTraveler>>();
				con.setTravelers(
						mapper.readValue(bookingDetail.getTotalTravelersDetails(), CustomBookingTravelerHead.class));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		res.setPayload(BookingDetailHelperList);
		res.setMessage("sucessful");

		return res;
	}
	@CrossOrigin
	@GetMapping("/findByUserId/{userId}")
	public Response updateForm(@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId,@RequestHeader(value = "siteId", required = true) Long siteId,
			@PathVariable(value = "userId") Long userId) {
		ObjectMapper mapper = new ObjectMapper();
		Response res = new Response();
		List<BookingDetail> country2 = bookingDetailRepository.findBySiteIdAndUserIdOrderByCreateDateDesc(siteId,
				userId);
		List<BookingDetailHelper> BookingDetailHelperList = new ArrayList<BookingDetailHelper>();
		for (BookingDetail bookingDetail : country2) {
			String uri = "bookings/"+ bookingDetail.getBookingId();
			Booking res1 = utility.getBookingById(uri,xCorrelationId);
			Booking emp2 = null;
			try {
				emp2 = mapper.readValue(bookingDetail.getBookingDetails(), Booking.class);

			} catch (JsonMappingException e) {

				e.printStackTrace();
			} catch (JsonProcessingException e) {

				e.printStackTrace();
			}
			BookingDetailHelper con = new BookingDetailHelper();
			con.setAppProvider(bookingDetail.getAppProvider());
			if(res1==null)
			{
				con.setBookingDetails(emp2);
				if (bookingDetail.getBookingStatus().equals("PREBOOKED")) {
					Date date1 = Calendar.getInstance().getTime();
					if (bookingDetail.getExpirationDate().before(date1))
						con.setExpired(true);
					else
						con.setExpired(false);
				}
				con.setBookingStatus(bookingDetail.getBookingStatus());
			}
			else
			{
			con.setBookingDetails(res1);
		
			if (res1.getBookingStatus().equals("PREBOOKED")) {
				Date date1 = Calendar.getInstance().getTime();
				if (bookingDetail.getExpirationDate().before(date1))
					con.setExpired(true);
				else
					con.setExpired(false);
			}
			con.setBookingStatus(res1.getBookingStatus());
			}
			con.setBookingId(bookingDetail.getBookingId());
			con.setBookingReference(bookingDetail.getBookingReference());
		
		

			con.setCreateDate(bookingDetail.getCreateDate());
			con.setId(bookingDetail.getId());
			con.setSiteId(bookingDetail.getSiteId());
			con.setUserId(bookingDetail.getUserId());
			BookingDetailHelperList.add(con);
		
			con.setExpirationDate(bookingDetail.getExpirationDate());
			con.setFirstDateOfTravel(bookingDetail.getFirstDateOfTravel());
			// booking.setPnr(country.getp);
			con.setTicketPrice(bookingDetail.getTicketPrice());
			con.setTotalTravelers(bookingDetail.getTotalTravelers());
			try {
				Map<Integer, List<BookingTraveler>> map = new HashMap<Integer, List<BookingTraveler>>();
				con.setTravelers(
						mapper.readValue(bookingDetail.getTotalTravelersDetails(), CustomBookingTravelerHead.class));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		res.setPayload(BookingDetailHelperList);
		res.setMessage("sucessful");

		return res;
	}

	@CrossOrigin
	@GetMapping("/findByBookingReference/{referenceId}")
	public Response bookingReference(@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId,@RequestHeader(value = "siteId", required = false) Long siteId,
			@PathVariable(value = "referenceId") String referenceId) {
		ObjectMapper mapper = new ObjectMapper();
		Response res = new Response();
		BookingDetail bookingDetail = null;
		if (siteId == null)
			bookingDetail = bookingDetailRepository.findByBookingReference(referenceId);
		else
			bookingDetail = bookingDetailRepository.findBySiteIdAndBookingReference(siteId, referenceId);
		String uri = "bookings/"+ bookingDetail.getBookingId();
		Booking res1 = utility.getBookingById(uri,xCorrelationId);
		Booking emp2 = null;
		try {
			emp2 = mapper.readValue(bookingDetail.getBookingDetails(), Booking.class);

		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		BookingDetailHelper con = new BookingDetailHelper();
		con.setAppProvider(bookingDetail.getAppProvider());
		if(res1==null)
		{
			con.setBookingDetails(emp2);
			if (bookingDetail.getBookingStatus().equals("PREBOOKED")) {
				Date date1 = Calendar.getInstance().getTime();
				if (bookingDetail.getExpirationDate().before(date1))
					con.setExpired(true);
				else
					con.setExpired(false);
			}
			con.setBookingStatus(bookingDetail.getBookingStatus());
		}
		else
		{
		con.setBookingDetails(res1);
	
		if (res1.getBookingStatus().equals("PREBOOKED")) {
			Date date1 = Calendar.getInstance().getTime();
			if (bookingDetail.getExpirationDate().before(date1))
				con.setExpired(true);
			else
				con.setExpired(false);
		}
		con.setBookingStatus(res1.getBookingStatus());
		}
		con.setBookingId(bookingDetail.getBookingId());
		con.setBookingReference(bookingDetail.getBookingReference());
	
	

		con.setCreateDate(bookingDetail.getCreateDate());
		con.setId(bookingDetail.getId());
		con.setSiteId(bookingDetail.getSiteId());
		con.setUserId(bookingDetail.getUserId());
		
	
		con.setExpirationDate(bookingDetail.getExpirationDate());
		con.setFirstDateOfTravel(bookingDetail.getFirstDateOfTravel());
		// booking.setPnr(country.getp);
		con.setTicketPrice(bookingDetail.getTicketPrice());
		con.setTotalTravelers(bookingDetail.getTotalTravelers());
		try {
			Map<Integer, List<BookingTraveler>> map = new HashMap<Integer, List<BookingTraveler>>();
			con.setTravelers(
					mapper.readValue(bookingDetail.getTotalTravelersDetails(), CustomBookingTravelerHead.class));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("country2=" + con);
		res.setPayload(con);
		res.setMessage("sucessful");
		return res;
	}

	@CrossOrigin
	@GetMapping("/findByBookingId/{bookingId}")
	public Response bookingId(@RequestHeader(value = "siteId", required = false) Long siteId,
			@PathVariable(value = "bookingId") String bookingId) {

		ObjectMapper mapper = new ObjectMapper();
		Response res = new Response();
		BookingDetail bookingDetail = null;

		if (siteId == null)
			bookingDetail = bookingDetailRepository.findByBookingId(bookingId);
		else
			bookingDetail = bookingDetailRepository.findBySiteIdAndBookingId(siteId, bookingId);
		Booking emp2 = null;
		try {
			emp2 = mapper.readValue(bookingDetail.getBookingDetails(), Booking.class);

		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		BookingDetailHelper con = new BookingDetailHelper();
		con.setAppProvider(bookingDetail.getAppProvider());
		con.setBookingDetails(emp2);
		con.setBookingId(bookingDetail.getBookingId());
		con.setBookingReference(bookingDetail.getBookingReference());
		con.setBookingStatus(bookingDetail.getBookingStatus());
		con.setCreateDate(bookingDetail.getCreateDate());
		con.setId(bookingDetail.getId());
		con.setSiteId(bookingDetail.getSiteId());
		con.setUserId(bookingDetail.getUserId());
		if (bookingDetail.getBookingStatus().equals("PREBOOKED")) {
			Date date1 = Calendar.getInstance().getTime();
			if (bookingDetail.getExpirationDate().before(date1))
				con.setExpired(true);
			else
				con.setExpired(false);
		}

		con.setBookingStatus(bookingDetail.getBookingStatus());
		con.setExpirationDate(bookingDetail.getExpirationDate());
		con.setFirstDateOfTravel(bookingDetail.getFirstDateOfTravel());
		// booking.setPnr(country.getp);
		con.setTicketPrice(bookingDetail.getTicketPrice());
		con.setTotalTravelers(bookingDetail.getTotalTravelers());
		try {
			Map<Integer, List<BookingTraveler>> map = new HashMap<Integer, List<BookingTraveler>>();
			con.setTravelers(
					mapper.readValue(bookingDetail.getTotalTravelersDetails(), CustomBookingTravelerHead.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		res.setCode(200);
		res.setPayload(con);
		res.setMessage("sucessful");
		return res;
	}

	@CrossOrigin
	@GetMapping("/findTravelerByUserId/{userId}")
	public Response findTravelerByUserId(@RequestHeader(value = "siteId", required = true) Long siteId,
			@PathVariable(value = "userId") Long userId) {

		Response res = new Response();
		List<TravelerDetail> country2 = travelerDetailRepository.findByUserId(userId);

		res.setPayload(country2);
		res.setMessage("sucessful");

		return res;
	}
	@CrossOrigin
	@GetMapping("/findTravelerByUserIdAndAlias/{userId}/{alias}")
	public Response findTravelerByUserIdAndAlias(@RequestHeader(value = "siteId", required = true) Long siteId,
			@PathVariable(value = "userId") Long userId,@PathVariable(value = "alias") Long alias) {

		Response res = new Response();
		List<TravelerDetail> country2 = travelerDetailRepository.findByUserIdAndAlias(userId,alias);

		res.setPayload(country2);
		res.setMessage("sucessful");

		return res;
	}
	@CrossOrigin
	@GetMapping("/findBooking")
	public Response findBooking(@RequestHeader(value = "siteId", required = true) Long siteId,
			@RequestParam(value="date1" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd")Date date1, @RequestParam(value="date2" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {

		Response res = new Response();
		List<BookingDetail> bookingDetailList = bookingDetailRepository.findByCreateDateGreaterThanEqualAndCreateDateLessThanEqual(date1,date2);

		res.setPayload(bookingDetailList);
		res.setMessage("sucessful");

		return res;
	}
	
}
