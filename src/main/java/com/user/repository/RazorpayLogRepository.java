package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.RazorpayLog;

public interface RazorpayLogRepository extends JpaRepository<RazorpayLog, Long> {
	//List<Payments> paymentDetailsByBookingIdOrderId(Long siteId, String bookingId, String orderId);

	//List<RazorpayLog> findByRazorpay_order_id(String bookingId);
}
