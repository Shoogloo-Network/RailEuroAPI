package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.controller.helper.booking.EditTravelersInput;
import com.util.Utility;

@RestController
@RequestMapping("rail/bookings")
public class EditTravellerContoller {
	@Autowired
	Utility utility;
	private static final Logger LOGGER = LoggerFactory.getLogger(EditTravellerContoller.class);
	@CrossOrigin
	@PostMapping("{bookingId}/items/{itemId}/travelers-editions")
	public Response edit(@PathVariable String bookingId, @PathVariable String itemId ,@RequestBody EditTravelersInput editTravelersInput,@RequestHeader(value = "X-CorrelationId", required = false) String XCorrelationId) {
		String uri = "bookings/" + bookingId + "/exchanges" + itemId + "/travelers-editions";
		Response res = utility.postResponse(uri, editTravelersInput,XCorrelationId);
		return res;
	}
	
}
