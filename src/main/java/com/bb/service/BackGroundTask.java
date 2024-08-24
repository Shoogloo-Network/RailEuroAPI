package com.bb.service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.helper.Response;
import com.controller.helper.pointoffer.LegRequest;
import com.controller.helper.pointoffer.Place;
import com.controller.helper.pointoffer.TravelerRequest;
import com.controller.helper.pointoffer.custom.SearchRequest;
import com.mongo.repository.PlaceRepository;
import com.util.DateFormatFunction;
import com.util.Utility;

@Service
public class BackGroundTask {
	@Autowired
	PlaceRepository placeRepository;
	@Autowired
	Utility utility ;

	public void getSearch(String sourceStr, String destinationStr) {

		String uri = "offers/point-to-point/searches";

		List<Place> sourceList = placeRepository.findByTypeAndLabelStartsWith("city", sourceStr);
		List<Place> destinationList = placeRepository.findByTypeAndLabelStartsWith("city", destinationStr);
		List<String> dateList = DateFormatFunction.getGivenDateStr(3);
		System.out.println("dateList="+dateList.size());
		for (String date : dateList) {
		SearchRequest searchRequest = new SearchRequest();
		TravelerRequest travelers = new TravelerRequest();
		travelers.setAge(30);

		List<TravelerRequest> travelerList = new ArrayList<TravelerRequest>();
		travelerList.add(travelers);
		searchRequest.setTravelers(travelerList);

		List<LegRequest> legs = new ArrayList<LegRequest>();
		LegRequest leg = new LegRequest();
		leg.setDeparture(date);
		
			if (sourceList != null && sourceList.size() > 0 && destinationList != null && destinationList.size() > 0) {
				leg.setOrigin(sourceList.get(0));
				leg.setDestination(destinationList.get(0));
				leg.setDirectOnly(false);
				legs.add(leg);
				searchRequest.setLegs(legs);

				SecureRandom random = new SecureRandom();
				long id = random.nextLong();
				
				Response res = utility.searchResponse(uri, searchRequest, "" + id, 1);
				
			}
		}

	}
}
