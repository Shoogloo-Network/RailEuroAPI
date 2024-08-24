package com.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.entity.CttFaqTbl;
import com.entity.CttReview;
import com.entity.NewCitymaster;
import com.entity.NewContactus;
import com.entity.NewCountry;
import com.entity.NewDeal;
import com.entity.NewTab;
import com.entity.NewTrainoperator;
import com.entity.NewTrainroute;
import com.repository.CttFaqTblRepository;
import com.repository.CttReviewRepository;
import com.repository.LogDBRepository;
import com.repository.NewCitymasterRepository;
import com.repository.NewCityrailopertorelRepository;
import com.repository.NewContactusRepository;
import com.repository.NewCountryRepository;
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

@RestController
public class MasterContoller {
@Autowired
	CttReviewRepository cttReviewRepository;
@Autowired
	CttFaqTblRepository cttFaqTblRepository;
@Autowired
	NewCitymasterRepository citymasterRepository;
@Autowired
	NewContactusRepository contactusRepository;
@Autowired	NewCountryRepository countryRepository;
@Autowired	NewDealRepository dealRepository;
@Autowired	NewPageRepository pageRepository;
@Autowired	RailEuroPropertyRepository propertyRepository;
@Autowired	NewStationRepository stationRepository;
@Autowired	NewTabRepository tabRepository;
@Autowired	NewTrainoperatorRepository trainoperatorRepository;
@Autowired	NewTrainrouteRepository trainrouteRepository;
@Autowired	LogDBRepository logDBRepository;
@Autowired	RailEuroTokenResponseRepository railEuroTokenResponseRepository;
@Autowired	RailProertiesRepository railProertiesRepository;
@Autowired	NewWebsitemasterRepository websitemasterRepository;
@Autowired	NewWizarditemRepository newWizarditemRepository;
@Autowired	NewWizardRepository wizardRepository;
@Autowired	NewCityrailopertorelRepository cityrailopertorelRepository;
private static final Logger LOGGER = LoggerFactory.getLogger(MasterContoller.class);

	@GetMapping("/getPage")
	public Response getPage(@RequestParam(required = false ,name ="tabType" ) String tabType) {
		List<NewTab> NewTabList = null;
		if (tabType == null)
			NewTabList = tabRepository.findByTabStatusOrderByTabOrder("Yes");

		else
			NewTabList = tabRepository.findByTabTypeAndTabStatusOrderByTabOrder(tabType, "Yes");

		Response res = new Response();

		res.setPayload(NewTabList);
		res.setMessage("sucessful");
		return res;
	}

	@GetMapping("/getReview")
	public Response getReview(@RequestParam(required = false, defaultValue = "all")  String pageUrl ,
			@RequestParam(required = false, defaultValue = "-1") Integer rating,
			@RequestParam(required = false, defaultValue = "10") Integer pageSize) {
		List<CttReview> cttReviewList = null;

		if (pageSize == null)
			pageSize = 10;
		if (pageUrl.equals("all") && rating != -1)
			cttReviewList = cttReviewRepository.findTopByPageUrlAndRating(pageUrl, rating, pageSize);
		else if (pageUrl.equals("all") && rating != -1)
			cttReviewList = cttReviewRepository.findTopByPageUrl(pageUrl, pageSize);
		else if (pageUrl.equals("all") && rating != -1)
			cttReviewList = cttReviewRepository.findTop(pageSize);
		Response res = new Response();

		res.setPayload(cttReviewList);
		res.setMessage("sucessful");
		return res;
	}

	@GetMapping("/getFaq")
	public Response getFaq(@RequestParam(required = false) String pageUrl) {
		List<CttFaqTbl> cttFaqTblList = cttFaqTblRepository.findByFaqPageUrlOrderByFaqOrder(pageUrl);
		Response res = new Response();

		res.setPayload(cttFaqTblList);
		res.setMessage("sucessful");
		return res;
	}



	@GetMapping("/getCity")
	public Response getcity(@RequestParam(required = false) String name) {
		List<NewCitymaster> cityList = null;
		if (name == null)
			cityList = citymasterRepository.findByStatusCode("Yes");
		else
			cityList = citymasterRepository.findByCode(name);
		Response res = new Response();

		res.setPayload(cityList);
		res.setMessage("sucessful");
		return res;
	}

	@PostMapping("contactUs/add")
	public Response contactUsAdd(@RequestBody NewContactus contactus) {
		NewContactus cityList = contactusRepository.save(contactus);
		Response res = new Response();

		res.setPayload(cityList);
		res.setMessage("Save sucessful");
		return res;
	}

	@GetMapping("/getCountry")
	public Response getCountry() {
		List<NewCountry> cityList = countryRepository.findAll();
		Response res = new Response();

		res.setPayload(cityList);
		res.setMessage("sucessful");
		return res;
	}

	@GetMapping("/getdeal")
	public Response getCoungetDeal(@RequestParam(required = false) String pageurl) {
		Date date = new Date();
		List<NewDeal> cityList = null;
		if (pageurl == null)
			cityList = dealRepository.findByDealStatusAndDealExpiryGreaterThan("Yes", date);
		else
			cityList = dealRepository.findByDealStatusAndDealExpiryGreaterThanAndPageUrl("Yes", date, pageurl);
		Response res = new Response();

		res.setPayload(cityList);
		res.setMessage("sucessful");
		return res;
	}

	@GetMapping("/getTrainOperator")
	public Response getTrainOperator(@PathVariable(required = false) String pageurl) {
		List<NewTrainoperator> cityList = null;
		if (pageurl == null)
			cityList = trainoperatorRepository.findByTrainOperatorStatusOrderByTrainOperatorPopularorder("Yes");
		else
			cityList = trainoperatorRepository
					.findByTrainOperatorStatusAndTrainOperatorUrlOrderByTrainOperatorPopularorder("Yes", pageurl);
		Response res = new Response();

		res.setPayload(cityList);
		res.setMessage("sucessful");
		return res;
	}

	@GetMapping("/getTrainRoute/{routeUrl}")
	public Response getTrainRoute(@PathVariable(required = false) String pageurl) {

		List<NewTrainroute> cityList = null;
		if (pageurl == null)
			cityList = trainrouteRepository.findByTrainrouteStatusOrderByTrainroutePopularorder("Yes");

		else
			trainrouteRepository.findByTrainrouteStatusAndTrainrouteUrlOrderByTrainroutePopularorder("Yes", pageurl);
		Response res = new Response();

		res.setPayload(cityList);
		res.setMessage("sucessful");
		return res;
	}

	@GetMapping("/getwizard/{routeUrl}")
	public Response getWizaeditem(@PathVariable(required = false) String pageurl) {
		// newWizarditemRepository;
		// wizardRepository;
		List<NewTrainroute> cityList = trainrouteRepository
				.findByTrainrouteStatusAndTrainrouteUrlOrderByTrainroutePopularorder("Yes", pageurl);
		Response res = new Response();

		res.setPayload(cityList);
		res.setMessage("sucessful");
		return res;
	}

}
