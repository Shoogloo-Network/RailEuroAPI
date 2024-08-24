package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.helper.Response;
import com.user.entity.FeedBack;
import com.user.repository.FeedBackRepository;

@RestController
@RequestMapping("rail/feedback")
public class FeedBackController {
	@Autowired
	FeedBackRepository feedBackRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(FeedBackController.class);
	@CrossOrigin
	@GetMapping("/list")
	public Response viewHomePage(
			@RequestHeader(value = "siteId", required = true) Long siteId, 
			@RequestHeader(value = "seoUrl", required = true) String seoUrl) {
		Response res = new Response();
		res.setPayload(feedBackRepository.findFeedBackBySeoUrl(siteId,seoUrl));
		res.setMessage("sucessful");
		return res;
	}
	@CrossOrigin
	@PostMapping("/save")
	public Response saveEmployee(@RequestBody FeedBack country) {
		// public Response search(@ModelAttribute("country") MCountry country ) {
		System.out.println("country=" + country);
		FeedBack country2 = feedBackRepository.save(country);
		Response res = new Response();
		res.setPayload(country2);
		res.setMessage("sucessful");
		return res;
	}

}
