package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.controller.helper.passesoffer.PassesOffersSearchRequest;
import com.util.Utility;

@RestController
@RequestMapping("rail/offers/passes")
public class PassesOffersContoller {
	Logger logger = LoggerFactory.getLogger(PointToPointOfferContoller.class);
	@Autowired
	Utility utility;
	@CrossOrigin
	@PostMapping("rail//searches")
	public Response search(@RequestBody PassesOffersSearchRequest passesOffersSearchRequest,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "offers/passes/searches";
		Response res = utility.postResponse(uri, passesOffersSearchRequest,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@GetMapping("rail/searches/{searchId}")
	public Response result(@PathVariable String searchId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "offers/passes/searches/"+searchId;
		Response res = utility.getResponse(uri,xCorrelationId);
		return res;
	}
	@CrossOrigin
	@GetMapping("rail/searches/{searchId}/offers/{offerId}")
	public Response offer(@PathVariable String searchId,@PathVariable String offerId,@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "offers/passes/searches/"+searchId+"/offers/"+offerId;
		Response res = utility.getResponse(uri,xCorrelationId);
		return res;
	}

}
