package com.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bb.service.BackGroundTask;
import com.controller.helper.MinMax;
import com.controller.helper.Response;
import com.controller.helper.SearchResultLegOffers;
import com.entity.NewTab;
import com.mongo.repository.SearchResultLegOffersRepository;
import com.repository.CttFaqTblRepository;
import com.repository.CttReviewRepository;
import com.repository.LogDBRepository;
import com.repository.NewCitymasterRepository;
import com.repository.NewCityrailopertorelRepository;
import com.repository.NewContactusRepository;
import com.repository.NewDealRepository;
import com.repository.NewPageRepository;
import com.repository.NewStationRepository;
import com.repository.NewTabRepository;
import com.repository.NewTrainoperatorRepository;
import com.repository.NewTrainrouteRepository;
import com.repository.NewWebsitemasterRepository;
import com.repository.NewWizardRepository;
import com.repository.NewWizarditemRepository;
import com.user.repository.RailEuroPropertyRepository;
import com.user.repository.RailEuroTokenResponseRepository;
import com.user.repository.RailProertiesRepository;
import com.util.DateFormatFunction;

@RestController
@RequestMapping("rail/admin")
public class AdminContoller {

	private static final Logger LOGGER = LoggerFactory.getLogger(AdminContoller.class);
	CttReviewRepository cttReviewRepository;

	CttFaqTblRepository cttFaqTblRepository;

	NewCitymasterRepository citymasterRepository;
	NewCityrailopertorelRepository cityrailopertorelRepository;
	NewContactusRepository contactusRepository;
	NewDealRepository dealRepository;
	NewPageRepository pageRepository;
	RailEuroPropertyRepository propertyRepository;
	NewStationRepository stationRepository;
	NewTabRepository tabRepository;
	NewTrainoperatorRepository trainoperatorRepository;
	NewTrainrouteRepository trainrouteRepository;
	LogDBRepository logDBRepository;
	RailEuroTokenResponseRepository railEuroTokenResponseRepository;
	RailProertiesRepository railProertiesRepository;
	NewWebsitemasterRepository websitemasterRepository;
	NewWizarditemRepository wNewWizarditemRepository;
	NewWizardRepository wizardRepository;
	NewTab newTab;
	@Autowired
	SearchResultLegOffersRepository searchResultLegOffersRepository;

	@Autowired
	BackGroundTask backGroundTask;

	@CrossOrigin
	@GetMapping("/cal/update")
	public Response calUpdate(@RequestParam(value = "orign", required = true) String origin,
			@RequestParam(value = "desti", required = true) String desti,
			@RequestParam(value = "date", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
			@RequestParam(value = "days", required = true) Integer days) {
		backGroundTask.getSearch(origin, desti);
		Response res = new Response();
		res.setPayload("ok");
		res.setCode(200);
		return res;
	}

	@CrossOrigin
	@GetMapping("/cal/search")
	public Response calSearch(@RequestParam(value = "orign", required = true) String origin,
			@RequestParam(value = "desti", required = true) String desti,
			@RequestParam(value = "date", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
			@RequestParam(value = "days", required = true) Integer days) {

		List<SearchResultLegOffers> searchResultList = searchResultLegOffersRepository
				.findByQueryOriginAndQueryDestinationAndSolutionDepartureGreaterThan(origin + " (All stations)",
						desti + " (All stations)", date);
		Map<String, SearchResultLegOffers> mapOfday = new HashMap<String, SearchResultLegOffers>();
		System.out.println("searchResultList=" + searchResultList.size());
		for (SearchResultLegOffers row : searchResultList) {
			System.out.println("row=" + row);
			Date dateDep = row.getSolutionDeparture();
			String dateStr = DateFormatFunction.getCurrentDateStr(dateDep);

			SearchResultLegOffers ress = mapOfday.get(dateStr);
			if (ress == null)
				mapOfday.put(dateStr, row);
			else {
				if (ress.getOfferBilling() > row.getOfferBilling()) {
					mapOfday.put(dateStr, row);
				}
			}

		}
		Response res = new Response();
		res.setPayload(mapOfday);
		res.setCode(200);
		return res;
	}

	@CrossOrigin
	@GetMapping("/cal/minMax")
	public Response createData(@RequestParam(value = "orign", required = true) String origin,
			@RequestParam(value = "desti", required = false) String desti,
			@RequestParam(value = "date", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
			@RequestParam(value = "days", required = true) Integer days) {

		List<SearchResultLegOffers> searchResultList = null;
		if (desti != null)
			searchResultList = searchResultLegOffersRepository
					.findByQueryOriginAndQueryDestinationAndSolutionDepartureGreaterThan(origin + " (All stations)",
							desti + " (All stations)", date);
		else
			searchResultList = searchResultLegOffersRepository
					.findByQueryOriginAndSolutionDepartureGreaterThan(origin + " (All stations)", date);

		System.out.println("searchResultList=" + searchResultList);
		Map<String, List<MinMax>> mapOfday = getMinMaxData2(origin, desti, searchResultList);
		Response res = new Response();
		res.setPayload(mapOfday);
		res.setCode(200);
		return res;
	}

	private Map<String, Map<String, Object>> getMinMaxData(String origin, String desti,
			List<SearchResultLegOffers> searchResultList) {

		Map<String, Object> firstTrainMap = new HashMap<String, Object>();
		Map<String, Object> lastTrainMap = new HashMap<String, Object>();
		Map<String, Object> minPriceMap = new HashMap<String, Object>();
		Map<String, Object> maxPriceMap = new HashMap<String, Object>();
		for (SearchResultLegOffers row : searchResultList) {
			Date dateDep = row.getSolutionDeparture();
			String dateStr = DateFormatFunction.getCurrentDateStr(dateDep);
			String key = dateStr + "#" + row.getOfferComfortCategoryCode() + "#" + row.getOfferFlexibilityCode();

			System.out.println("key=" + key);

			Date firstTrain = (Date) firstTrainMap.get(key);
			System.out.println("firstTrain=" + firstTrain);
			if (firstTrain == null)
				firstTrainMap.put(key, row.getSolutionDeparture());
			else if (firstTrain.after(row.getSolutionDeparture()))
				firstTrainMap.put(key, row.getSolutionDeparture());

			Date lastTrain = (Date) lastTrainMap.get(key);
			if (lastTrain == null)
				lastTrainMap.put(key, row.getSolutionDeparture());
			else if (lastTrain.before(row.getSolutionDeparture()))
				lastTrainMap.put(key, row.getSolutionDeparture());

			Double minPrice = (Double) minPriceMap.get(key);
			if (minPrice == null)
				minPriceMap.put(key, row.getOfferBilling());
			else if (minPrice > row.getOfferBilling())
				minPriceMap.put(key, row.getOfferBilling());

			Double maxPrice = (Double) maxPriceMap.get(key);
			if (maxPrice == null)
				maxPriceMap.put(key, row.getOfferBilling());
			else if (maxPrice < row.getOfferBilling())
				maxPriceMap.put(key, row.getOfferBilling());

		}
		Map<String, Map<String, Object>> res = new HashMap<String, Map<String, Object>>();

		res.put("max", maxPriceMap);
		res.put("min", minPriceMap);
		res.put("first", firstTrainMap);
		res.put("last", lastTrainMap);
		return res;
	}

	private Map<String,List<MinMax>> getMinMaxData2(String origin,String desti,List<SearchResultLegOffers> searchResultList) {
		
		Map<String,Map<String,MinMax>>result=new HashMap<String,Map<String,MinMax>>();
		
		for(SearchResultLegOffers row:searchResultList)
		{	
			Date dateDep = row.getSolutionDeparture();
			String dateStr=DateFormatFunction.getCurrentDateStr(dateDep);
			String key=row.getOfferComfortCategoryCode()+"-"+row.getOfferFlexibilityCode();
			
		
			MinMax minMax=null;
			Map<String, MinMax> map = result.get(dateStr);
			if(map==null)
				map=new HashMap<String, MinMax>();
			minMax= map.get(key);
		if(minMax==null)
				minMax=new MinMax(dateStr,row.getOfferComfortCategoryCode(),row.getOfferFlexibilityCode(),row.getSolutionDeparture(),row.getOfferBilling());
		 if(minMax.getFirstTrain().after(row.getSolutionDeparture()))
			 minMax.setFirstTrain(row.getSolutionDeparture());
			
			 if(minMax.getFirstTrain().before(row.getSolutionDeparture()))
				 minMax.setLastTrain(row.getSolutionDeparture());
			
			 row.getSegmentOperatingCarrier();
			 if(minMax.getMinPrice()>row.getOfferBilling())
				 minMax.setMinPrice(row.getOfferBilling());
			
			 if(minMax.getMaxPrice()<row.getOfferBilling())
				 minMax.setMaxPrice(row.getOfferBilling());
			
			map.put(dateStr, minMax);
			result.put(key, map);
			
		}
		Map<String,List<MinMax>>response=new HashMap<String,List<MinMax>>();
		Set<String> keySet = result.keySet();
		for(String key:keySet)
		{
			List<MinMax>list=new ArrayList<MinMax>();
			Map<String, MinMax> map = result.get(key);
			Set<String> set = map.keySet();
			int i=0;
			String key4=null;
			for(String  key2:set)
			{
				list.add(map.get(key2));
				i=i+1;
				key4=key2;
			}
			List<String> dateList = DateFormatFunction.getGivenDateStr(3);
			int p=30-i;
			for(int j=0;j<p;j++)
				list.add(map.get(key4));
			response.put(key,list);
			
		}
		return response;
	}

}
