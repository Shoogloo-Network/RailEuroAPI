package com.bb.service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.helper.HealthStatusHelper;
import com.controller.helper.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.user.entity.HealthStatus;
import com.user.entity.Razorpay;
import com.user.repository.HealthStatusRepository;
import com.util.Utility;

@Service
public class HealthService {
	@Autowired
	HealthStatusRepository healthStatusRepository;
	@Autowired
	Utility utility ;
	
	public HealthStatusHelper[] getStatus() {
	
		String uri = "health/suppliers";
		HealthStatusHelper[] healthStatus = utility.status(uri);	
		for(HealthStatusHelper obj :  healthStatus) {
			HealthStatus hsStatus = new HealthStatus();
			hsStatus.setStatusid(obj.getId());
			hsStatus.setStatus(obj.getStatus());
			hsStatus.setDowntime(obj.getDowntime());
			if(obj.getDowntime()!=null) {
				long cuurentTime = Calendar.getInstance().get(Calendar.MILLISECOND);
				java.time.Duration d = java.time.Duration.parse(obj.getDowntime());
				long isoTime= d.get(java.time.temporal.ChronoUnit.SECONDS);
				long inMilli = isoTime *1000;
				long addTime = cuurentTime + inMilli; 
				hsStatus.setConverttime(inMilli);
				hsStatus.setAddontime(addTime);
			}
			Instant now = Instant.now(); /* UTC time */
			ZonedDateTime local = now.atZone(ZoneId.of("Europe/London"));
			String currentUktime = ""+local;
			hsStatus.setUktime(currentUktime);
			hsStatus.setCreatedate(new Date());
			healthStatusRepository.save(hsStatus);
		}
		return healthStatus;
		
	}

}
