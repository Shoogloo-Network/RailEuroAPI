package com.util;

import java.util.Date;

import com.controller.helper.SearchResults;
import com.controller.helper.booking.PointToPointOffersSearchResults;
import com.controller.helper.pointoffer.custom.SearchRequest;
import com.mongo.repository.SearchResultsRepository;

public class SearchLogThread extends Thread {

	
	SearchRequest body = null;
	PointToPointOffersSearchResults result = null;
	SearchResultsRepository searchResultsRepository=null;
	public SearchLogThread(SearchResultsRepository searchResultsRepository, SearchRequest body,
			PointToPointOffersSearchResults pointToPointOffersSearchResults) {
		this.body = body;
		
		this.result = pointToPointOffersSearchResults;
		this.searchResultsRepository=searchResultsRepository;
	}

	public void run() {
		
		SearchResults res = new SearchResults();
		res.setSourceCity(body.getLegs().get(0).getOrigin().getLabel());
		res.setDestiCity(body.getLegs().get(0).getDestination().getLabel());
		res.setTime(new Date().getTime());
		res.setPointToPointOffersSearchResults(result);
	
		try {
			res.setTravelDate(DateFormatFunction.getDate(result.getLegs().get(0).getDeparture()));
			searchResultsRepository.save(res);
		} catch (Exception e) {
		System.err.println("error:"+e.getMessage());
		}
		
	}

}
