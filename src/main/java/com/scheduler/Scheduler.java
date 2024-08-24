package com.scheduler;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.controller.helper.MinFare;
import com.controller.helper.pointoffer.Place;
import com.mongo.repository.JwtTokenRepository;
import com.mongo.repository.MinFareRepository;
import com.mongo.repository.PlaceRepository;
import com.util.Utility;

@Component
public class Scheduler {
	public static Map<String, LinkedHashMap<String, String>> placeMap = null;
	public static List<String> placeNameList = null;
	@Autowired
	Utility utility;
	@Autowired
	PlaceRepository placeRepository;
	@Autowired
	JwtTokenRepository jwtTokenRepository;
	@Autowired
	MinFareRepository minFareRepository;

	/*
	 * @Scheduled(cron = "0 * 9 * * ?") public void cronJobSch() { SimpleDateFormat
	 * sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); Date now = new Date();
	 * String strDate = sdf.format(now);
	 * System.out.println("Java cron job expression:: " + strDate); }
	 */
	// 12 hour
	@Scheduled(fixedRate = 43200 * 1000)
	public void fixedRateSch() {
		try {
			System.out.println("scheduler colled" + new Date());
			String uri = "places";
			Place[] res = utility.getPlace(uri);
			placeRepository.deleteAll();
			placeRepository.saveAll(Arrays.asList(res));
			Calendar rightNow = Calendar.getInstance();
			rightNow.add(Calendar.DAY_OF_MONTH, -1);
			List<MinFare> minFareList = minFareRepository.findByCreateDateLessThan(rightNow.getTime());
			for (MinFare min : minFareList) {
				System.out.println("min="+min);
				minFareRepository.delete(min);
			}

		} catch (Exception ss) {
		}
	}
}