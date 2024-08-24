package com.bb.service;


import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.service.entity.RazorPayRefund;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.user.entity.Razorpay;
import com.user.entity.RazorpayRefundLog;
import com.user.entity.RefundLogs;
import com.user.repository.RazorpayRefundLogRepository;
import com.user.repository.RazorpayRepository;
import com.user.repository.RefundLogsRepository;

@Service
public class RazorPayService {

	@Autowired
	RazorpayRepository razorpayRepository;
	@Autowired
	RefundLogsRepository refundLogsRepository;
	@Autowired
	RazorpayRefundLogRepository razorpayRefundLogRepository; 

	public Object Refund(String bookingId,String userId) {
		System.out.println("bookingId:" + bookingId);
		RazorPayRefund razorPayRefund = new RazorPayRefund();
		Object data = null;
		List<RefundLogs> refundLogList = refundLogsRepository.findByBookingId(bookingId);
		Razorpay payDetails = razorpayRepository.findByRailBookingId(bookingId);
		if (refundLogList != null)
			// RazorPayRefund razorPayRefund = new RazorPayRefund();
			for (RefundLogs refundLogs : refundLogList) {
				if (refundLogs.getPgstatus().equals("pending")) {
					Double reversedPrice = refundLogs.getReversedPrices();
					System.out.println("reversedPrice=" + reversedPrice);
					try {
					 data =	refundRazorPay(razorPayRefund, payDetails.getRazorpayPaymentId(), reversedPrice, bookingId,userId);
					 System.out.println("data="+data);
					 if(data!=null) {
						 refundLogs.setPgstatus("confirmed");
						 refundLogsRepository.save(refundLogs);
					 }
					} catch (RazorpayException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		return data;
	}

	private Object refundRazorPay(RazorPayRefund razorPayRefund, String paymentId, Double reversedPrice , String bookingId,String userId)
			throws RazorpayException {
		RazorpayClient razorpay = new RazorpayClient("rzp_test_zWm7zh980vqBl6", "KrgePxTnPyIgZFZspFrauPSi");
		System.out.println("paymentId" + paymentId);
		Razorpay payDetails = razorpayRepository.findByRazorpayPaymentId(paymentId);
		List<RefundLogs> refundLogList = refundLogsRepository.findByBookingId(bookingId);
		String str1 = Long.toString(payDetails.getId());
		JSONObject refundRequest = new JSONObject();
		refundRequest.put("amount", reversedPrice);
		refundRequest.put("speed", "optimum");
		refundRequest.put("receipt", str1);
		refundRequest.put("currency", "GBP");
		System.out.println("refundRequest" + refundRequest);
		com.razorpay.Refund payment = razorpay.payments.refund(paymentId, refundRequest);
		if(payment!= null) {
			for (RefundLogs res : refundLogList) {
			RazorpayRefundLog razorpayRefundLog = new RazorpayRefundLog();
			razorpayRefundLog.setRefundLogId(res.getId());
			razorpayRefundLog.setBookingId(res.getBookingId());
			razorpayRefundLog.setRefundOperationId(res.getRefundOperationId());
			razorpayRefundLog.setType(res.getType());
			razorpayRefundLog.setStatus(res.getStatus());
			razorpayRefundLog.setBalancePrice(res.getBalancePrice());
			razorpayRefundLog.setBalanceCurrency(res.getBalanceCurrency());
			razorpayRefundLog.setReversedPrices(res.getReversedPrices());
			razorpayRefundLog.setReversedCurrency(res.getReversedCurrency());
			razorpayRefundLog.setOperationDateTime(res.getOperationDateTime());
			razorpayRefundLog.setExpirationDate(res.getExpirationDate());
			razorpayRefundLog.setRefundType(res.getRefundType());
			razorpayRefundLog.setPgstatus("confirmed");
			razorpayRefundLog.setCreateDate(new Date());
			razorpayRefundLog.setJson(res.getJson());
			razorpayRefundLog.setRefundData(""+payment);
			razorpayRefundLog.setUserId(userId);	
			razorpayRefundLogRepository.save(razorpayRefundLog);
		//	repository.save(payment);
			}
		}
		System.out.println("mJSONArray" + payment);
		return payment;
	}

	
}
