package com.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bb.service.HealthService;
import com.controller.helper.Response;
import com.user.entity.HealthStatus;
import com.user.entity.Razorpay;
import com.user.repository.HealthStatusRepository;
import com.util.Utility;

@RestController
@RequestMapping("rail/health")
public class HealthStatusController {
	@Autowired
	Utility utility;
	@Autowired
	HealthService healthService;
	@Autowired
	HealthStatusRepository healthStatusRepository;
	
	@CrossOrigin
	@GetMapping("/suppliers")
	public Response retrieveExchangeOperation(@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		Object data = null;
		data = healthService.getStatus();
		Response res = new Response();
		res.setPayload(data);
		res.setMessage("successfull");
//		String uri = "health/suppliers"  ;
//		System.out.println("uri: "+uri);
//		Response healthStatus = utility.getResponse(uri, xCorrelationId);
//		System.out.println("res: "+healthStatus);
//		 java.time.Duration d = java.time.Duration.parse("PT40M46S");
//		 System.out.println("Duration in seconds: " + d.get(java.time.temporal.ChronoUnit.SECONDS));
		return res;
	}

	@CrossOrigin
	@GetMapping("/suppliers/{supplierId}")
	public Response supplierHealth(@PathVariable String supplierId,
			@RequestHeader(value = "X-CorrelationId", required = false) String xCorrelationId) {
		
		String uri = "health/suppliers/"+ supplierId ;
		System.out.println("uri"+uri);
		System.out.println("uri: "+uri);
		Response healthStatus = utility.getResponse(uri, xCorrelationId);
		System.out.println("res: "+healthStatus);
		return healthStatus;
	}
	
	@CrossOrigin
	@GetMapping("/findDetails/{supplierId}")
	public Response findDetails(@RequestHeader(value = "siteId", required = false) Long siteId,
			@PathVariable String supplierId,
			@RequestParam(value="date1" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd")Date date1,
			@RequestParam(value="date2" , required= true)@DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {

		Response res = new Response();
		List<HealthStatus> HealthStatusList = healthStatusRepository.findByCreatedateGreaterThanEqualAndCreatedateLessThanEqualAndStatusid(date1,date2,supplierId);

		res.setPayload(HealthStatusList);
		res.setMessage("sucessful");

		return res;
	}

}
