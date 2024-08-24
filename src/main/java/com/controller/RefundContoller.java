package com.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

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
import com.controller.helper.booking.Amount;
import com.controller.helper.booking.ConfirmRefundResponse;
import com.controller.helper.booking.CreateRefundRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.entity.BookingDetail;
import com.user.entity.RefundLogs;
import com.user.repository.BookingDetailRepository;
import com.user.repository.RefundLogsRepository;
import com.util.Utility;

@RestController
@RequestMapping("rail/bookings")
public class RefundContoller {
	@Autowired
	Utility utility;
	Logger logger = LoggerFactory.getLogger(RefundContoller.class);
	@Autowired
	RefundLogsRepository refundLogsRepository;
	@Autowired
	BookingDetailRepository bookingDetailRepository;

	@CrossOrigin
	@PostMapping("/{bookingId}/refunds")
	public Response CreateRefundOperation(@PathVariable String bookingId,
			@RequestBody CreateRefundRequest createRefundRequest,
			@RequestHeader(value = "X-CorrelationId", required = false) String XCorrelationId) {
		String uri = "bookings/" + bookingId + "/refunds";

		Response res = utility.postResponse(uri, createRefundRequest, XCorrelationId);
		return res;
	}

	@CrossOrigin
	@PostMapping("/{bookingId}/refunds/{refundOperationId}/confirm")
	public Response confirmRefundOperation(@PathVariable String bookingId, @PathVariable String refundOperationId,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/refunds/" + refundOperationId + "/confirm";

		Response response = utility.postRefundConfirm(uri, "{}", xCorrelationId);
		Response res = new Response();
		res.setCode(200);
		res.setMessage("confirm");
		setRefund(bookingId, refundOperationId, response.getPayload());
		res.setPayload(response);
		return res;
	}

	private void setRefund(String bookingId, String refundOperationId, Object res) {
		try {
			ConfirmRefundResponse response = (ConfirmRefundResponse) res;

			RefundLogs refundLogs = new RefundLogs();
			// refundLogs.setBalanceCurrency(response.get);
			// refundLogs.setBalancePrice(null);
			refundLogs.setBookingId(bookingId);
			refundLogs.setCreateDate(new Date());
			refundLogs.setExpirationDate(response.getExpirationDate());
			ObjectMapper mapper = new ObjectMapper();
			try {

				refundLogs.setJson(mapper.writeValueAsString(response));
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			refundLogs.setOperationDateTime(response.getOperationDateTime());
			refundLogs.setPgstatus("pending");
			refundLogs.setRefundOperationId(refundOperationId);

			refundLogs.setRefundType(refundOperationId);
			Double reversedTotal = 0d;
			String currency = null;
			for (Amount t : response.getBalancePrices().getReversedTotal().getBillingsGross()) {
				try {
					reversedTotal = reversedTotal + t.getValue().doubleValue();
					currency = t.getCurrency();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			refundLogs.setReversedPrices(reversedTotal);
			refundLogs.setReversedCurrency(currency);

			refundLogs.setStatus(response.getStatus());
			refundLogs.setType(response.getType());
			refundLogsRepository.save(refundLogs);

			BookingDetail bookingDetail = bookingDetailRepository.findByBookingId(bookingId);
			if (response.getType().equals("REFUND") && response.getStatus().equals("CONFIRMED")) {
				bookingDetail.setBookingStatus("REFUNDED");
				System.out.println("bookingDetail after refund:" + bookingDetail);
				bookingDetailRepository.save(bookingDetail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * private void setFefund(String bookingId, String refundOperationId, Response
	 * res) { System.out.println("confirm:response=" + res); try {
	 * java.util.LinkedHashMap response = (LinkedHashMap) res.getPayload();
	 * System.out.println("LinkedHashMap===" + response); RefundLogs refundLogs =
	 * new RefundLogs(); // refundLogs.setBalanceCurrency(response.get); //
	 * refundLogs.setBalancePrice(null); refundLogs.setBookingId(bookingId);
	 * refundLogs.setCreateDate(new Date()); //
	 * refundLogs.setExpirationDate(response.get(refundLogs)); ObjectMapper mapper =
	 * new ObjectMapper(); try {
	 * 
	 * refundLogs.setJson(mapper.writeValueAsString(response)); } catch
	 * (JsonProcessingException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * refundLogs.setOperationDateTime(response.get("operationDateTime") + "");
	 * refundLogs.setPgstatus("pending");
	 * refundLogs.setRefundOperationId(refundOperationId);
	 * 
	 * refundLogs.setRefundType(refundOperationId); Double reversedTotal = 0d;
	 * String currency = null; // for (Amount t : //
	 * response.getBalancePrices().getReversedTotal().getBillingsGross()) { // try {
	 * // reversedTotal = reversedTotal + t.getValue().doubleValue(); // currency =
	 * t.getCurrency(); // } catch (Exception e) { // e.printStackTrace(); // } // }
	 * LinkedHashMap l1 = ((LinkedHashMap) ((LinkedHashMap)
	 * response.get("balancePrices")).get("reversedPrices")); ArrayList l2 =
	 * (ArrayList) ((LinkedHashMap) l1).get("billings"); for (int i = 0; i <
	 * l2.size(); i++) { LinkedHashMap l3 = (LinkedHashMap) l2.get(i); reversedTotal
	 * = reversedTotal + (Double)((LinkedHashMap)
	 * l3.get("billingPrice")).get("value"); currency = (String) ((LinkedHashMap)
	 * l3.get("billingPrice")).get("currency"); }
	 * refundLogs.setReversedPrices(reversedTotal);
	 * refundLogs.setReversedCurrency(currency);
	 * refundLogs.setStatus(response.get("status") + "");
	 * refundLogs.setType(response.get("type") + "");
	 * refundLogsRepository.save(refundLogs);
	 * 
	 * // BookingDetail bookingDetail =
	 * bookingDetailRepository.findByBookingId(bookingId); //
	 * bookingDetail.setBookingStatus(response.getStatus()); //
	 * bookingDetailRepository.save(bookingDetail); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */
	@CrossOrigin
	@GetMapping("/{bookingId}/refunds/{refundOperationId}")
	public Response retrieveRefundOperation(@PathVariable String bookingId, @PathVariable String refundOperationId,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "bookings/" + bookingId + "/refunds/" + refundOperationId;

		Response res = utility.getResponse(uri, xCorrelationId);

		return res;
	}
}
