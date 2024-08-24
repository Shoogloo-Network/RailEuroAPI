package com.bb.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.helper.CustomBookingTraveler;
import com.controller.helper.CustomBookingTravelerHead;
import com.controller.helper.MailHelper;
import com.controller.helper.Response;
import com.controller.helper.booking.Amount;
import com.controller.helper.booking.Booking;
import com.controller.helper.booking.BookingTraveler;
import com.controller.helper.booking.PointToPointBookingItem;
import com.controller.helper.booking.Ticket;
import com.controller.helper.booking.Traveler;
import com.controller.helper.booking.ValueDocument;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.entity.BookingDetail;
import com.user.repository.BookingDetailRepository;
import com.util.DateFormatFunction;
import com.util.Utility;

@Service
public class BookingDetails {
	@Autowired
	BookingDetailRepository bookingDetailRepository;
	@Autowired
	Utility utility;
	static String xCorrelationId = "xxsswy1@5454fdfdki830stem";

	public Booking updateBookingDB(String bookingId, Long userId) {
		ObjectMapper mapper = new ObjectMapper();
		BookingDetail booking = bookingDetailRepository.findByBookingId(bookingId);
		String uri = "bookings/" + bookingId;
		Booking bookingRail = utility.getBookingById(bookingId, xCorrelationId);

		Map<Integer, List<BookingTraveler>> map = new HashMap<Integer, List<BookingTraveler>>();
		if (booking == null)
			booking = new BookingDetail();

		booking.setAppProvider("RailEuro");
		try {
			booking.setBookingDetails(mapper.writeValueAsString(bookingRail));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("country.getBookingDetails()="+country.getBookingDetails());
		booking.setBookingId(bookingRail.getId());
		booking.setBookingReference(bookingRail.getBookingReference());
		try {
			booking.setCreateDate(DateFormatFunction.getDateLongPattern(bookingRail.getCreationDate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		booking.setUserId(userId);
		booking.setBookingStatus(bookingRail.getBookingStatus());
		try {
			booking.setExpirationDate(DateFormatFunction.getDateLongPattern(bookingRail.getExpirationDate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	booking.setFirstDateOfTravel(bookingRail.get);
		// booking.setPnr(country.getp);
		booking.setTicketPrice(
				Double.parseDouble("" + bookingRail.getBillings().get(0).getBillingPrice().getAmount().getValue()));

		try {
			int count = 0;
			CustomBookingTravelerHead head = new CustomBookingTravelerHead();
			List<CustomBookingTraveler> list = new ArrayList<CustomBookingTraveler>();
			for (PointToPointBookingItem li : bookingRail.getBookingItems()) {
				CustomBookingTraveler h = new CustomBookingTraveler();
				h.setBookingItemId(li.getId());
				List<BookingTraveler> map2 = new ArrayList<BookingTraveler>();
				map2.addAll(li.getTravelers());
				h.setTravelers(map2);
				list.add(h);
				count = count + 1;

			}
			head.setBooking(list);
			booking.setTotalTravelersDetails(mapper.writeValueAsString(head));
			booking.setTotalTravelers(count);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BookingDetail country2 = bookingDetailRepository.save(booking);
		return bookingRail;
	}

	public MailHelper RefundMail(String bookingId) {
		MailHelper mailHelper = new MailHelper();

		String uri = "bookings/" + bookingId;
		Booking bookingRail = utility.getBookingById(uri, xCorrelationId);
		mailHelper.setBookingReference(bookingRail.getBookingReference());
		mailHelper.setOrigin(bookingRail.getBookingItems().get(0).getLegs().get(0).getOrigin().getLabel());
		mailHelper.setDestination(bookingRail.getBookingItems().get(0).getLegs().get(0).getDestination().getLabel());
		mailHelper.setName(bookingRail.getBookingItems().get(0).getTravelers().get(0).getFirstName());
		mailHelper.setDeparture(bookingRail.getBookingItems().get(0).getLegs().get(0).getDeparture());
		mailHelper.setArrival(bookingRail.getBookingItems().get(0).getLegs().get(0).getArrival());
		mailHelper.setPnr(bookingRail.getBookingItems().get(0).getSupplierOrder().getSupplierReferences().get(0).getPnr());
		Double total = (Double) bookingRail.getInvoicedPrices().getBillings().get(0).getBillingPrice().getAmount().getValue();
		Double partnerComission = (Double) bookingRail.getInvoicedPrices().getBillings().get(0).getPartnerCommission()
				.getAmount().getValue();
		mailHelper.setAmount(bookingRail.getInvoicedPrices().getTotal().getBillingsGross().get(0).getValue());
		mailHelper.setTotalamount(
				bookingRail.getInvoicedPrices().getBillings().get(0).getBillingPrice().getAmount().getValue());
		mailHelper.setPartnerComission(
				bookingRail.getInvoicedPrices().getBillings().get(0).getPartnerCommission().getAmount().getValue());
//		mailHelper.setRefund(bookingRail.getAfterSalesOperations().get(0).getBalancePrices().getReversedTotal().getBillingsGross().get(0).getValue());
		Double reversedTotal = total - partnerComission;
		mailHelper.setRefund(reversedTotal);
		mailHelper.setToSendMail(bookingRail.getBookingItems().get(0).getTravelers().get(0).getEmailAddress());
		mailHelper.setAttachmentUrl(bookingRail.getBookingItems().get(0).getValueDocuments());
//		for(Ticket travel :bookingRail.getBookingItems().get(0).getTickets()) {
//			mailHelper.setTicketumber(travel.getTicketNumber());
//		}
		mailHelper.setTicketumber(bookingRail.getBookingItems().get(0).getTickets().get(0).getTicketNumber());
		try {
			List<String> ctr = bookingRail.getBookingItems().get(0).getTicketsCollectionReferences();
			if (ctr != null) {
				mailHelper.setCtr(ctr);
			}
		} catch (Exception e) {
			System.out.println("in ctach of helper");
			e.printStackTrace();
		}
		return mailHelper;
	}
}
