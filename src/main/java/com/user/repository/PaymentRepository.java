package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import com.user.entity.Payments;

public interface PaymentRepository extends JpaRepository<Payments, Long> {
	//List<Payments> paymentDetailsByBookingIdOrderId(Long siteId, String bookingId, String orderId);

	List<Payments> findByBookingId(String bookingId);
}
