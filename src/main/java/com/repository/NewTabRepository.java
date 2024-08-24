package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controller.helper.booking.CreateBookingRequest;
import com.entity.NewTab;
public interface NewTabRepository  extends JpaRepository<NewTab, Integer> {

	

	List<NewTab> findByTabTypeAndTabStatusOrderByTabOrder(String tabType, String string);

	List<NewTab> findByTabStatusOrderByTabOrder(String string);

}
