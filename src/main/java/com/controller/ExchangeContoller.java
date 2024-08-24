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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.controller.helper.booking.ExchangeOfferSearchInput;
import com.controller.helper.booking.ExchangeQuotationItem;
import com.util.Utility;

@RestController
@RequestMapping("rail/bookings")
public class ExchangeContoller {
	@Autowired
	Utility utility;
	private static final Logger LOGGER = LoggerFactory.getLogger(ExchangeContoller.class);
	@CrossOrigin
	@PostMapping("/{bookingId}/exchanges/searches")
	public Response exchangeOffers(@PathVariable String bookingId,
			@RequestBody ExchangeOfferSearchInput exchangeOfferSearchInput,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/exchanges/searches";

		Response res = utility.postResponse(uri, exchangeOfferSearchInput,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@GetMapping("{bookingId}/exchanges/searches/{offersSearchId}")
	public Response retrieveExchangeOffer(@PathVariable String bookingId, @PathVariable String offersSearchId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/exchanges/searches/" + offersSearchId;

		Response res = utility.getResponse(uri,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PostMapping("{bookingId}/exchanges")
	public Response exchangeQuotation(@PathVariable String bookingId, List<ExchangeQuotationItem> items,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/exchanges";
		Response res = utility.postResponse(uri, items,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/{bookingId}/exchanges/{exchangeOperationId}/confirm")
	public Response exchangeConfirmation(@PathVariable String bookingId, @PathVariable String exchangeOperationId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/exchanges" + exchangeOperationId + "/confirm";
		Response res = utility.putResponse(uri, new Object(),xCorrelationId);
		return res;
	}
	@CrossOrigin
	@GetMapping("/{bookingId}/exchanges/{exchangeOperationId}")
	public Response retrieveExchangeOperation(@PathVariable String bookingId,
			@PathVariable String exchangeOperationId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/exchanges" + exchangeOperationId;
		Response res = utility.getResponse(uri,xCorrelationId);
		return res;
	}
}
