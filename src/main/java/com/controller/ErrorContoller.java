package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.controller.filter.SecurityFilter;
import com.controller.helper.Response;
import com.util.Utility;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("rail/error")
public class ErrorContoller {
	@Autowired
	Utility utility;
	
	@CrossOrigin
	@GetMapping("/e")
	public Response calUpdate() {

		Response res = new Response();
		res.setCode(401);
		res.setMessage("not authorized");
		res.setPayload("");
		return res;
	}

	@CrossOrigin
	@GetMapping("/e/{param}")
	public Response calParam(@PathVariable(value = "param") Integer param) {
		SecurityFilter.tokenEnable = param;
		Response res = new Response();
		res.setCode(200);
		res.setMessage("done");
		res.setPayload("");
		return res;
	}
	@CrossOrigin
	@GetMapping("/carriersLogo/{marketingInformation}")
	public Response retrieveExchangeOperation(@PathVariable String marketingInformation,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		String uri = "https://era.raileurope.com/assets/images/operating-carriers/"+marketingInformation+".svg"  ;
		System.out.println("uri: "+uri);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForObject(uri, Object.class);
		Response res = (Response) restTemplate.getForObject(uri, Object.class);
		System.out.println("res: "+res);
		return res;
	}

}
