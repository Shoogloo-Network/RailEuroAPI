package com.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.user.entity.Payments;
import com.user.repository.PaymentRepository;

@RestController
@RequestMapping("rail/payments")
public class PaymentController {
	@Autowired
	PaymentRepository paymentRepository;
	Logger logger = LoggerFactory.getLogger(PaymentController.class);
	@CrossOrigin
	@PostMapping("/save")
	public Response saveEmployee(@RequestHeader(value = "siteId", required = false) Long siteId,
			@RequestBody Payments payments,@RequestHeader(value = "X-CorrelationId", required = false) String XCorrelationId) {
		Response res = new Response();
		
		try {if(payments.getCreateDate()==null)
			payments.setCreateDate(new Date());
			Payments paymentPayload = paymentRepository.save(payments);
			res.setPayload(paymentPayload);
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
	@GetMapping("/findByBookingId/{bookingId}")
	public Response getForm(@RequestHeader(value = "siteId", required = false) Long siteId,
			@PathVariable(value = "bookingId") String bookingId,@RequestHeader(value = "X-CorrelationId", required = false) String XCorrelationId) {

		Response res = new Response();
		List<Payments> country2 = paymentRepository.findByBookingId(bookingId);
		res.setPayload(country2);
		res.setMessage("sucessful");
		return res;

	}

}
