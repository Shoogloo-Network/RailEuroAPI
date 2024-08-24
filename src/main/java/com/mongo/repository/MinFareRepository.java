package com.mongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.controller.helper.MinFare;

public interface MinFareRepository extends MongoRepository<MinFare, String> {

	MinFare findByDate(String substring);

	MinFare findBySourceAndDestinationAndDate(String substring, String destination, String string);

	

	List<MinFare> findByCreateDateLessThan(Date time);


	


}
