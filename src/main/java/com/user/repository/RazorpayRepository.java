package com.user.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Razorpay;


public interface RazorpayRepository extends JpaRepository<Razorpay, Long> {
	//List<Payments> paymentDetailsByBookingIdOrderId(Long siteId, String bookingId, String orderId);

	List<Razorpay> findByRazorpayOrderId(String bookingId);

	List<Razorpay> findByCurrDateGreaterThanEqualAndCurrDateLessThanEqual(Date date1, Date date2);

	Razorpay findByRailBookingId(String bookingId);

	Razorpay findByRazorpayPaymentId(String paymentId);
}