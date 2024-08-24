package com.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewDeal;
public interface NewDealRepository  extends JpaRepository<NewDeal, Integer> {

	List<NewDeal> findByDealStatusAndDealExpiryGreaterThan(String string, Date date);

	List<NewDeal> findByDealStatusAndDealExpiryGreaterThanAndPageUrl(String string, Date date, String pageurl);

}
