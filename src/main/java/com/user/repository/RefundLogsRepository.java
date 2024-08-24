package com.user.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.RefundLogs;
public interface RefundLogsRepository  extends JpaRepository<RefundLogs, Long> {

	List<RefundLogs> findByBookingId(String bookingId);

	List<RefundLogs> findByCreateDateGreaterThanEqualAndCreateDateLessThanEqual(Date date1, Date date2);
	

}
