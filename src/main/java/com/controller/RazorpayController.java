package com.controller;

import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bb.service.RazorPayService;
import com.controller.helper.Response;
import com.user.entity.Razorpay;
import com.user.entity.RazorpayLog;
import com.user.entity.RefundLogs;
import com.user.repository.BookingDetailRepository;
import com.user.repository.RazorpayLogRepository;
import com.user.repository.RazorpayRepository;
import com.user.repository.RefundLogsRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("rail/razorpay")
public class RazorpayController {
	@Autowired
	RazorpayRepository razorpayRepository;
	@Autowired
	RazorpayLogRepository razorpayLogRepository;
	@Autowired
	RefundLogsRepository refundLogsRepository;
	@Autowired
	BookingDetailRepository bookingDetailRepository;
	@Autowired
	RazorPayService razorPayService;
	Logger logger = LoggerFactory.getLogger(RazorpayController.class);
	@CrossOrigin
	@PostMapping("/save")
	public Response saveEmployee(@RequestHeader(value = "siteId", required = false) Long siteId,
			@RequestBody Razorpay razorpay,@RequestHeader(value = "X-CorrelationId", required = false) String XCorrelationId) {
		Response res = new Response();
		
		try {
			Razorpay razorpayRes = razorpayRepository.save(razorpay);
			RazorpayLog razorpayLog=new RazorpayLog();
			razorpayLog.setCurrDate(new Date());
			razorpayLog.setRazorpayId(razorpayRes.getId());
			razorpayLog.setRazorpay_order_id(razorpayRes.getRazorpayOrderId());
			razorpayLog.setRazorpay_payment_id(razorpayRes.getRazorpayPaymentId());
			razorpayLog.setRazorpay_signature(razorpayRes.getRazorpaySignature());
			razorpayLog.setSiteId(siteId);
			razorpayLog.setStatus(razorpayRes.getStatus());
			razorpayLog.setUserId(siteId);
			res.setPayload(razorpayRes);
			razorpayLogRepository.save(razorpayLog);
			res.setMessage("sucessful");
			res.setCode(200);

		} catch (Exception e) {
			res.setMessage("false");
			res.setCode(404);
			
		}

		//Payments paymentPayload = paymentRepository.save(payments);
		//res.setPayload(paymentPayload);
		//res.setMessage("sucessful");
		return res;
	}

	@CrossOrigin
	@GetMapping("/findByOrderId/{bookingId}")
	public Response getForm(@RequestHeader(value = "siteId", required = false) Long siteId,
			@PathVariable(value = "bookingId") String bookingId,@RequestHeader(value = "X-CorrelationId", required = false) String XCorrelationId) {

		Response res = new Response();
		List<Razorpay> country2 = razorpayRepository.findByRazorpayOrderId(bookingId);
		res.setPayload(country2);
		res.setMessage("sucessful");
		return res;

	}
	@CrossOrigin
	@GetMapping("/findRefundList")
	public Response findRefundList(@RequestHeader(value = "siteId", required = true) Long siteId,
			@RequestParam(value="date1" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd")Date date1,
			@RequestParam(value="date2" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {

		Response res = new Response();
		List<RefundLogs> bookingDetailList = refundLogsRepository.findByCreateDateGreaterThanEqualAndCreateDateLessThanEqual(date1,date2);

		res.setPayload(bookingDetailList);
		res.setMessage("sucessful");

		return res;
	}
	@CrossOrigin
	@PostMapping("/refundRazorPay/{bookingId}")
	public Response refundRazorPay(@RequestHeader(value = "siteId", required = false) Long siteId,
			@PathVariable(value = "bookingId") String bookingId,@RequestHeader(value = "X-CorrelationId", required = false) String XCorrelationId) {

		Response res = new Response();
		
	String ss = ""+razorPayService.Refund(bookingId,null);
		 System.out.println("========================"+ss );
		try {
	//	if(razorPayService.Refund(bookingId).toString()!=null) {
		 res.setPayload(ss);
		 res.setMessage("successfull");
	//	}
	//	else { 
//			res.setPayload("");
//			 res.setMessage("successfull");
//		}
//		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;

	}
	@CrossOrigin
	@GetMapping("/findPG")
	public Response findPG(@RequestHeader(value = "siteId", required = true) Long siteId,
			@RequestParam(value="date1" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd")Date date1,
			@RequestParam(value="date2" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {

		Response res = new Response();
		List<Razorpay> bookingDetailList = razorpayRepository.findByCurrDateGreaterThanEqualAndCurrDateLessThanEqual(date1,date2);

		res.setPayload(bookingDetailList);
		res.setMessage("sucessful");

		return res;
	}
	@CrossOrigin
	@PostMapping("/razorPayHook")
	public Response razorPayHook(HttpServletRequest request,HttpServletResponse response) {
/*
	Enumeration<String> en = request.getHeaderNames();
	while(en.hasMoreElements())
	{
		String header=""+en.nextElement();
		System.out.println("header="+header+"==="+request.getHeader(header));
	}
	Enumeration<String> en2 = request.getParameterNames();
	while(en2.hasMoreElements())
	{
		String header=""+en2.nextElement();
		System.out.println("Request="+header+"==="+request.getParameter(header));
	}
	Enumeration<String> en3 =request.getAttributeNames();
	while(en3.hasMoreElements())
	{
		String header=""+en3.nextElement();
		System.out.println("Attribute="+header+"==="+request.getAttribute(header));
	}
*/		Response res = new Response();
		
		res.setPayload("");
		res.setMessage("sucessful");

		return res;
	}

}
