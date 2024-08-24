package com.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.controller.helper.pointoffer.Place;

public interface PlaceRepository extends MongoRepository<Place, String> {
	List<Place> findByLabelStartsWith(String labal);

	List<Place> findByTypeAndLabelStartsWith(String string, String destinationStr);
	List<Place> findByLabelStartsWith(String string, String destinationStr);
}
