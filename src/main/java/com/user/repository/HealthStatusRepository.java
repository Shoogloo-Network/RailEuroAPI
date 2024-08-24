package com.user.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controller.helper.Response;
import com.user.entity.HealthStatus;
import com.user.entity.Razorpay;

public interface HealthStatusRepository extends JpaRepository<HealthStatus, String> {

	List<HealthStatus> findByCreatedateGreaterThanEqualAndCreatedateLessThanEqual(Date date1, Date date2);

	List<HealthStatus> findByCreatedateGreaterThanEqualAndCreatedateLessThanEqualAndStatusid(Date date1, Date date2,
			String supplierId);


}
