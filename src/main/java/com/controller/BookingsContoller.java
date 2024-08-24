package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Contact;
import com.controller.helper.Response;
import com.controller.helper.booking.AgencyBookingNumber;
import com.controller.helper.booking.AgencyBookingReference;
import com.controller.helper.booking.Amount;
import com.controller.helper.booking.Billing;
import com.controller.helper.booking.BookingTraveler;
import com.controller.helper.booking.CreateBookingRequest;
import com.controller.helper.booking.CreateServiceOffer;
import com.util.Utility;

@RestController
@RequestMapping("rail")
public class BookingsContoller {
	@Autowired
	Utility utility;
	private static final Logger LOGGER = LoggerFactory.getLogger(BookingsContoller.class);
	
	@CrossOrigin
	@PostMapping("/bookings")
	public Response search(@RequestBody String booking,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		System.out.println("booking="+booking);
		String uri = "bookings";
		Response res = utility.postResponse(uri, booking,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PostMapping("/bookings/{bookingId}/print")
	public Response print(@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId,@PathVariable(value = "bookingId") String bookingId) {
		
		String uri = "bookings/"+bookingId+"/print";
		Response res = utility.postResponse(uri, "",xCorrelationId);
		return res;
	}
	@CrossOrigin
	@GetMapping("/bookings/{bookingId}")
	public Response result(@PathVariable String bookingId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		System.out.println("ffffffffff="+bookingId);
		String uri = "bookings/"+ bookingId;
		Response res = utility.getResponse(uri,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/bookings/{bookingId}/billing")
	public Response updateBilling(@PathVariable String bookingId, @RequestBody Billing billing,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {

		String uri = "bookings/" + bookingId+"/billing";
		Response res = utility.putResponse(uri, billing,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/bookings/{bookingId}/contact")
	public Response updateBookingContact(@PathVariable String bookingId, @RequestBody Contact contact,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/contact";
		Response res = utility.putResponse(uri, contact,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/bookings/{bookingId}/items/{itemId}/travelers")
	public Response updateTravelersDetails(@PathVariable String bookingId, @PathVariable String itemId,
			@RequestBody List<BookingTraveler> bookingTraveler,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "/bookings/" + bookingId + "/items/" + itemId + "/travelers";
		Response res = utility.putResponse(uri, bookingTraveler,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@DeleteMapping("/bookings/{bookingId}/items/{itemId}")
	public Response deleteBookingItem(@PathVariable String bookingId, @PathVariable String itemId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/items/" + itemId;
		Response res = utility.deleteResponse(uri,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/bookings/{bookingId}/agency-booking-number")
	public Response updateAgencyBookingNumber(@PathVariable String bookingId,
			@RequestBody AgencyBookingNumber agencyBookingNumber,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/agency-booking-number";
		Response res = utility.putResponse(uri, agencyBookingNumber,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/bookings/{bookingId}/agency-booking-reference")
	public Response updateAgencyBookingReference(@PathVariable String bookingId,
			@RequestBody AgencyBookingReference agencyBookingReference,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/agency-booking-reference";
		Response res = utility.putResponse(uri, agencyBookingReference,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/bookings/{bookingId}/agency-fees")
	public Response updateAgencyFees(@PathVariable String bookingId, @RequestBody Amount amount,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/agency-fees";
		Response res = utility.putResponse(uri, amount,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PostMapping( "/bookings/{bookingId}/items/{itemId}/service-offers")
	public Response createServiceOffer(@PathVariable String bookingId, @PathVariable String itemId, @RequestBody CreateServiceOffer createServiceOffer,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "/bookings/"+bookingId+"/items/"+itemId+"/service-offers";
		Response res = utility.postResponse(uri, createServiceOffer,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@PutMapping("/bookings/{bookingId}/items/{itemId}/service-offers/{serviceOfferId}")
	public Response updateServiceOffer(@PathVariable String bookingId, @PathVariable String itemId, @PathVariable String serviceOfferId, @RequestBody CreateServiceOffer createServiceOffer,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId +"/items/"+itemId+"/service-offers/"+serviceOfferId;
		Response res = utility.putResponse(uri, createServiceOffer,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@DeleteMapping("/bookings/{bookingId}/items/{itemId}/service-offers/{serviceOfferId}")
	public Response deleteServiceOffer(@PathVariable String bookingId, @PathVariable String itemId, @PathVariable String serviceOfferId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri ="bookings/" + bookingId +"/items/"+itemId+"/service-offers/"+serviceOfferId;
		Response res = utility.deleteResponse(uri,xCorrelationId);
		return res;
	}

}
