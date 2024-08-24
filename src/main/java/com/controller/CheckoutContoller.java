package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.util.Utility;

@RestController
@RequestMapping("rail/bookings")
public class CheckoutContoller {
	@Autowired
	Utility utility;
	private static final Logger LOGGER = LoggerFactory.getLogger(CheckoutContoller.class);
	@CrossOrigin
	@PostMapping("/{bookingId}/checkout/confirm")
	public Response confirmBooking(@PathVariable String bookingId,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId+"/checkout/confirm";
		Object object =null;
		Response res = utility.postResponse(uri,object,xCorrelationId);
		System.out.println("res="+res);
		return res;
	}
	@CrossOrigin
	@PostMapping( "/{bookingId}/checkout/hold")
	public Response holdBooking(@PathVariable String bookingId
			,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId+"/checkout/hold";
	//	String object =new String();
		Response res = utility.postResponse(uri,"",xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PostMapping( "/{bookingId}/checkout/pay")
	public Response processPaymentInformation(@PathVariable String bookingId
			,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId+"/checkout/pay";
		Object object =new Object();
		Response res = utility.postResponse(uri,"",xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PostMapping("/{bookingId}/checkout/prebook")
	public Response prebookBookingItems(@PathVariable String bookingId,@RequestBody List<String> bookingitem,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId+"/checkout/prebook";
		System.out.println("bookingitem="+bookingitem);
		Response res = utility.postResponse(uri,bookingitem,xCorrelationId);
		return res;
	}
	
}
