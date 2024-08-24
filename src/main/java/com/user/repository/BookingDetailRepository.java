package com.user.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.BookingDetail;



public interface BookingDetailRepository extends JpaRepository<BookingDetail, Long>{

	List<BookingDetail> findBySiteIdAndUserId(Long siteId, Long userId);

	

	BookingDetail findBySiteIdAndBookingReference(Long siteId, String referenceId);



	List<BookingDetail> findBySiteIdAndUserIdOrderByCreateDate(Long siteId, Long userId);



	List<BookingDetail> findBySiteIdAndUserIdOrderByCreateDateDesc(Long siteId, Long userId);



	BookingDetail findByBookingReference(String referenceId);



	BookingDetail findBySiteIdAndBookingId(Long siteId, String bookingId);



	BookingDetail findByBookingId(String bookingId);

	List<BookingDetail> findByCreateDateGreaterThanEqualAndCreateDateLessThanEqual(Date date1, Date date2);

}
