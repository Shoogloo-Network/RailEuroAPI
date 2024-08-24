package com.controller;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.controller.helper.SearchResults;
import com.controller.helper.pointoffer.Place;
import com.mongo.repository.PlaceRepository;

import com.mongo.repository.SearchResultsRepository;

@RestController
@RequestMapping("rail/web")
public class WebContoller {

	@Autowired
	SearchResultsRepository searchResultsRepository;
	@Autowired
	PlaceRepository placeRepository;
	Logger logger = LoggerFactory.getLogger(WebContoller.class);

	@GetMapping("/page/list/")
	public Response pageList(@PathVariable String page,
			@RequestParam(value = "vatNumber", required = true) String vatNumber) {

		Response res = null;
		return res;
	}

	@GetMapping("/review/list/{page}")
	public Response reviewList(@PathVariable String page,
			@RequestParam(value = "vatNumber", required = true) String vatNumber) {

		Response res = null;
		return res;
	}

	@GetMapping("/review/add")
	public Response reviewAction(@PathVariable String page,
			@RequestParam(value = "vatNumber", required = true) String vatNumber) {

		Response res = null;
		return res;
	}

	@CrossOrigin
	@GetMapping("/list")
	public Response list(@RequestParam(value = "sourceCity", required = true) String sourceCity,
			@RequestParam(value = "destiCity", required = false) String destiCity) {

		Response res = new Response();
		List<SearchResults> list = null;

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		long currentDate = calendar.getTimeInMillis();
		long diff10Hour = currentDate - (3600000 * 10);

		if (destiCity == null) {
			list = searchResultsRepository.findBySourceCityAndTimeGreaterThan(sourceCity + " (All stations)",
					diff10Hour);
		} else {
			list = searchResultsRepository.findBySourceCityAndDestiCityAndTimeGreaterThan(
					sourceCity + " (All stations)", destiCity + " (All stations)", diff10Hour);
		}

		if (list != null && list.size() > 0) {
			res.setPayload(sourceCity);
			res.setPayload(destiCity);
			res.setPayload(list.get(0).getPointToPointOffersSearchResults());
		}

		return res;
	}

	@CrossOrigin
	@GetMapping("/allList")
	public Response allList(@RequestParam(value = "sourceCity", required = true) String sourceCity) {
		Response res = new Response();
		List<SearchResults> list = searchResultsRepository.findBySourceCity(sourceCity);

		// System.out.println("city to many
		// city==="+list.get(0).getPointToPointOffersSearchResults().getLegs());

		res.setPayload(list);
		res.setMessage("successfull");
		return res;
	}

	@CrossOrigin
	@GetMapping("/findPlace")
	public Response findCity(@RequestParam(value = "city", required = true) String sourceCity) {
		Response res = new Response();
		List<Place> list = placeRepository.findByLabelStartsWith(sourceCity);

		// System.out.println("city to many
		// city==="+list.get(0).getPointToPointOffersSearchResults().getLegs());

		res.setPayload(list);
		res.setMessage("successfull");
		return res;
	}

}
