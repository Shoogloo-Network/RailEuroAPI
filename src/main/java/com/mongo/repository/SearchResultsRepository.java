package com.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.controller.helper.SearchResults;

public interface SearchResultsRepository extends MongoRepository<SearchResults, String> {

	List<SearchResults> findBySourceCity();

	List<SearchResults> findBySourceCityAndTimeGreaterThan(String string, long diff10Hour);

	List<SearchResults> findBySourceCityAndDestiCityAndTimeGreaterThan(String string, String string2,long diff10Hour);

	List<SearchResults> findBySourceCity(String sourceCity);

}
