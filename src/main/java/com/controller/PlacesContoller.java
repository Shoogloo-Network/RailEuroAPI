package com.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.controller.helper.places.req.SearchType;
import com.controller.helper.pointoffer.Place;
import com.scheduler.Scheduler;
import com.user.repository.RailProertiesRepository;
import com.util.Utility;

@RestController
@RequestMapping("rail/places")
public class PlacesContoller {
	Logger logger = LoggerFactory.getLogger(PlacesContoller.class);
	@Autowired
	Utility utility;
	@Autowired
	RailProertiesRepository railProertiesRepository;

	@CrossOrigin
	@GetMapping("/autoCompletion")
	public Response autoCompletion(@RequestParam(value = "query", required = true) String query,
			@RequestParam(value = "type", required = false) SearchType type,
			@RequestParam(value = "boost", required = false) SearchType boost,
			@RequestParam(value = "size", defaultValue = "10") Integer size,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		// utility.getAccessToken();
		String uri = "places/autocomplete?query=" + query + "&size=" + size;
		if (type != null)
			uri = uri + "&type=" + type;
		if (boost != null)
			uri = uri + "&boost=" + boost;
		Response res = utility.getResponse(uri,xCorrelationId);

		return res;
	}

	@CrossOrigin
	@GetMapping("/places")
	public Response places() {
	String	query = "lo";
	List<LinkedHashMap<String, String>> placeList = new ArrayList<LinkedHashMap<String, String>>();
	
		for (String finder : Scheduler.placeNameList) {
			if (finder.startsWith(query)) {
				placeList.add(Scheduler.placeMap.get(finder));
			}
		}
		Response res = new Response();
		res.setCode(200);
		res.setMessage("sucess");
		if (placeList != null && placeList.size() > 20)
			res.setPayload(placeList.subList(0, 20));
		else
			res.setPayload(placeList);
		return res;
	}

	@CrossOrigin
	@GetMapping("/placeSearch")
	public Response places(@RequestParam(value = "query", required = true) String query) {
		/*
		 * String uri = "places";
		 * 
		 * Response res = utility.getResponse(uri); RailProerties railProerties = new
		 * RailProerties(); railProerties.setDomain("railEuro");
		 * railProerties.setKey("places"); railProerties.setValue(res.toString());
		 * 
		 * // railProertiesRepository.save(railProerties);
		 */
		List<LinkedHashMap<String, String>> placeList = new ArrayList<LinkedHashMap<String, String>>();
		query = query.toLowerCase();
		for (String finder : Scheduler.placeNameList) {
			if (finder.startsWith(query)) {
				placeList.add(Scheduler.placeMap.get(finder));
			}
		}
		Response res = new Response();
		res.setCode(200);
		res.setMessage("sucess");
		if (placeList != null && placeList.size() > 6)
			res.setPayload(placeList.subList(0, 6));
		else
			res.setPayload(placeList);
		return res;
	}

}
