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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.controller.helper.booking.ClaimBillingDocumentsRequest;
import com.util.Utility;

@RestController
@RequestMapping("rail/booking")
public class BillingDocumentContoller {
	@Autowired
	Utility utility;
	private static final Logger LOGGER = LoggerFactory.getLogger(BillingDocumentContoller.class);

	@CrossOrigin
	@PostMapping("{bookingId}/billing/documents/search-profile")
	public Response searchProfile(@PathVariable String bookingId,
			@RequestParam(value = "vatNumber", required = true) String vatNumber,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/billing/documents/search-profile";

		Response res = utility.postResponse(uri, vatNumber, xCorrelationId);
		return res;
	}

	@CrossOrigin
	@PostMapping("/{bookingId}/billing/documents/claim")
	public Response claimBillingDocuments(@PathVariable String bookingId,
			@RequestBody ClaimBillingDocumentsRequest claimBillingDocumentsRequest,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/billing/documents/claim";

		Response res = utility.postResponse(uri, claimBillingDocumentsRequest, xCorrelationId);
		return res;
	}

}
