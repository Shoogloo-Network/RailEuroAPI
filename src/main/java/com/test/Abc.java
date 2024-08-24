package com.test;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Abc {

	public static void main(String[] args) {
		Map<String, Object> map;
		ObjectMapper mapper = new ObjectMapper();
	String a="400 Bad Request: \"{\"code\":\"era-offers-incompatible-origin-destination\",\"label\":"
			+ "\"Unable to search offers for given origin and destination which are incompatible in our system\",\"type\":\"functional\"}\"";
	String a1=a.substring(a.indexOf("\"")+1);
	System.out.println("QQQ=="+a1);
	try {
		map = mapper.readValue(a1, Map.class);
		System.out.println("map="+map);
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

}
