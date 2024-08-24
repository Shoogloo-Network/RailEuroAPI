package com.controller;

import java.security.SecureRandom;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bb.service.AmountComparator;
import com.bb.service.CacheObject;
import com.controller.helper.MinFare;
import com.controller.helper.Response;
import com.controller.helper.booking.Amount;
import com.controller.helper.booking.Billing;
import com.controller.helper.booking.PointToPointOffer;
import com.controller.helper.booking.PointToPointOffersSearchResults;
import com.controller.helper.passesoffer.Traveler;
import com.controller.helper.pointoffer.LegRequest;
import com.controller.helper.pointoffer.Place;
import com.controller.helper.pointoffer.TravelerRequest;
import com.controller.helper.pointoffer.custom.SearchRequest;
import com.mongo.repository.MinFareRepository;
import com.mongo.repository.PlaceRepository;
import com.mongo.repository.SearchResultLegOffersRepository;
import com.util.DateFormatFunction;
import com.util.Utility;

@RestController
@RequestMapping("rail/offers/point-to-point")
public class PointToPointOfferContoller {
	Logger logger = LoggerFactory.getLogger(PointToPointOfferContoller.class);
	@Autowired
	Utility utility;
	@Autowired
	PlaceRepository placeRepository;
	@Autowired
	SearchResultLegOffersRepository searchResultLegOffersRepository;
	@Autowired
	MinFareRepository minFareRepository;

	@CrossOrigin
	@PostMapping("/searches")
	public Response search(@RequestBody SearchRequest searchRequest,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "offers/point-to-point/searches";
		System.out.println("searchRequest11=" + searchRequest);
		Response res = utility.searchResponse(uri, searchRequest, xCorrelationId, 1);

		return res;
	}

	@CrossOrigin
	@PostMapping("/minFareValue")
	public Response search5(@RequestBody SearchRequest searchRequest,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId,
			@RequestParam(required = true) Integer dateInt) {
		String uri = "offers/point-to-point/searches";
		System.out.println("\n\nminFareValue=" + searchRequest);
		SearchRequest searchRequest2 = new SearchRequest();
		searchRequest2.setTravelers(searchRequest.getTravelers());

		Response res = new Response();
		List<PointToPointOffersSearchResults> resList = new ArrayList<PointToPointOffersSearchResults>();
		List<String> dateList = null;
		String source = searchRequest.getLegs().get(0).getOrigin().getLabel();
		TravelerRequest t=new TravelerRequest();
		t.setAge(27);
		
		List<TravelerRequest>tl=new ArrayList<TravelerRequest>();
		searchRequest.setTravelers(tl);
		String destination = searchRequest.getLegs().get(0).getDestination().getLabel();
		try {
			dateList = DateFormatFunction.getGivenDateStr(searchRequest.getLegs().get(0).getDeparture(), dateInt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Integer dateIntunsign = Math.abs(dateInt);
			Map<String, Amount> resMap = new HashMap<String, Amount>();
			for (int i = 0; i < dateIntunsign; i++) {
				String dateStr = dateList.get(i).substring(0, 10);

				Amount am =CacheObject.minAmount.get(source + destination + dateStr);
				if (am != null) {
					resMap.put(dateStr, am);
					continue;
				}
				MinFare fare =null;// minFareRepository.findBySourceAndDestinationAndDate(source, destination,
						//dateList.get(i).substring(0, 10));
			//	System.out.println("fare1=" + fare);
				if (fare == null) {
					List<LegRequest> reqList = new ArrayList<LegRequest>();
					LegRequest leg = searchRequest.getLegs().get(0);
					leg.setDeparture(dateList.get(i));
					System.out.println("dateList.get(i)=" + dateList.get(i));
					reqList.add(leg);
					searchRequest2.setLegs(reqList);
					fare = new MinFare();

					PointToPointOffersSearchResults res2 = utility.searchResponse2(uri, searchRequest2, xCorrelationId,
							1);
					System.out.println("res2=" + res2.getId());
					List<PointToPointOffer> offers = res2.getOffers();
					List<Amount> amonuts = new ArrayList<Amount>();
					if (offers != null)
						for (PointToPointOffer offer : offers) {
							List<Billing> billings = offer.getPrices().getBillings();
							for (Billing billing : billings) {
								Amount billingPrice = billing.getBillingPrice().getAmount();
								 System.out.println("amount=" + billingPrice.getValue());
								amonuts.add(billingPrice);
							}

						}
					AmountComparator comp = new AmountComparator("sortingOrder");
					Collections.sort(amonuts, comp);

					resList.add(res2);
					fare.setDate(dateStr);
					fare.setSource(source); 
					fare.setDestination(destination);
					fare.setCreateDate(new Date());
					if (amonuts != null && amonuts.size() > 0) {
						fare.setFare(amonuts.get(0));
						CacheObject.minAmount.put(source + destination + dateStr, amonuts.get(0));
					}
					else
						CacheObject.minAmount.put(source + destination + dateStr, null);

					minFareRepository.save(fare);
					System.out.println("fare==" + fare);

					if (fare != null && fare.getDate() != null)
						resMap.put(fare.getDate(), fare.getFare());
				} else if (fare != null && fare.getDate() != null)
					resMap.put(fare.getDate(), fare.getFare());

			}
			System.out.println("resMap=" + resMap);
			res.setPayload(resMap);
			res.setCode(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@CrossOrigin
	@GetMapping("/searchByCity")
	public Response search(@RequestParam(value = "source", required = true) String sourceStr,
			@RequestParam(value = "destination", required = true) String destinationStr) {
		String uri = "offers/point-to-point/searches";

		List<Place> sourceList = placeRepository.findByTypeAndLabelStartsWith("city", sourceStr);
		List<Place> destinationList = placeRepository.findByTypeAndLabelStartsWith("city", destinationStr);

		SearchRequest searchRequest = new SearchRequest();
		TravelerRequest travelers = new TravelerRequest();
		travelers.setAge(30);
		System.out.println("searchByCity=" + sourceList);
		System.out.println("destinationList=" + destinationList);
		List<TravelerRequest> travelerList = new ArrayList<TravelerRequest>();
		travelerList.add(travelers);
		searchRequest.setTravelers(travelerList);

		List<LegRequest> legs = new ArrayList<LegRequest>();
		LegRequest leg = new LegRequest();

		String date = DateFormatFunction.getCurrentDateStr();
		leg.setDeparture(date);
		Response res = new Response();
		res.setCode(400);
		res.setMessage("not Found");
		res.setPayload(null);
		if (sourceList != null && sourceList.size() > 0 && destinationList != null && destinationList.size() > 0) {
			leg.setOrigin(sourceList.get(0));
			leg.setDestination(destinationList.get(0));
			leg.setDirectOnly(false);
			legs.add(leg);
			searchRequest.setLegs(legs);

			SecureRandom random = new SecureRandom();
			long id = random.nextLong();
			System.out.println("searchRequest11=" + searchRequest);
			res = utility.searchResponse(uri, searchRequest, "" + id, 1);
		}

		return res;
	}

	@CrossOrigin
	@GetMapping("/searches/{id}")
	public Response searchresults(@PathVariable String id,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "/offers/point-to-point/searches/" + id;
		Response res = utility.getResponse(uri, xCorrelationId);

		return res;
	}

	@CrossOrigin
	@GetMapping("searches/{searchId}/offers/{offerId}")
	public Response offer(@PathVariable String searchId, @PathVariable String offerId,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "/offers/point-to-point/searches/" + searchId + "/offers/" + offerId;
		Response res = utility.getResponse(uri, xCorrelationId);

		return res;
	}
}
