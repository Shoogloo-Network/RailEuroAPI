package com.mongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.controller.helper.SearchResultLegOffers;

public interface SearchResultLegOffersRepository extends MongoRepository<SearchResultLegOffers, String> {


	List<SearchResultLegOffers> findByQueryOriginAndQueryDestinationAndSolutionDepartureGreaterThan(String origin,
			String desti, Date date);

	List<SearchResultLegOffers> findByQueryOriginAndSolutionDepartureGreaterThan(String string, Date date);

	List<SearchResultLegOffers> findByQueryOriginAndQueryDestinationAndSolutionDepartureLessThan(String queryOrigin,
			String queryDestination, Date queryDepartTime);

	List<SearchResultLegOffers> findByQueryOriginAndQueryDestinationAndDepDateStr(String string,
			String queryDestination, String depDateStr);


}
