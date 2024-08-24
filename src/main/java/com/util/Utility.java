package com.util;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.controller.helper.HealthStatusHelper;
import com.controller.helper.Response;
import com.controller.helper.authentication.TokenResponse;
import com.controller.helper.booking.Booking;
import com.controller.helper.booking.ConfirmRefundResponse;
import com.controller.helper.booking.PointToPointOffersSearchResults;
import com.controller.helper.pointoffer.Place;
import com.controller.helper.pointoffer.custom.SearchRequest;
import com.user.entity.HealthStatus;
import com.user.entity.RailProerties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongo.repository.PlaceRepository;
import com.mongo.repository.SearchResultLegOffersRepository;
import com.mongo.repository.SearchResultsRepository;
import com.user.entity.TokenMaster;
import com.user.repository.RailEuroPropertyRepository;
import com.user.repository.RailEuroTokenResponseRepository;
import com.user.repository.RailProertiesRepository;

import jakarta.annotation.PostConstruct;

@Service
public class Utility {
	@Autowired
	RailEuroPropertyRepository propertyRepository;
	@Autowired
	PlaceRepository placeRepository;

	Logger logger = LoggerFactory.getLogger(Utility.class);

	@Autowired
	RailProertiesRepository railProertiesRepository;
	@Autowired
	RailEuroTokenResponseRepository railEuroTokenResponseRepository;
	@Autowired
	SearchResultsRepository searchResultsRepository;
	@Autowired
	SearchResultLegOffersRepository searchResultLegOffersRepository;

	private static TokenMaster tokenMaster = null;
	static Map<String, String> railEuroProprty = new HashMap<String, String>();

	@PostConstruct
	public void init() {
		readProperty();
	}

	public Response getResponse(String uri, String xCorrelationId) {
		RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
		Response response = new Response();

		String url = railEuroProprty.get("url") + uri; // or any other uri

		try {
			TokenMaster token = getAccessToken();

			logger.info("access Token:" + token.getAccess_token());
			logger.info("urlOfRailEuro:" + url + ", xCorrelationId=" + xCorrelationId);

			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);

			HttpEntity<String> entity = new HttpEntity<>(headers);

			ResponseEntity<Object> result = restTemplate.exchange(url, HttpMethod.GET, entity, Object.class);
			logger.info("urlOfRailEuro:" + url + ", xCorrelationId=" + xCorrelationId + ", result:" + result);
			response.setCode(result.getStatusCode().value());

			response.setPayload(result.getBody());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error:getResponse", e);
			response.setCode(403);
			response.setMessage("Application Error" + e.getLocalizedMessage());
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map;
			try {
				String a = e.getLocalizedMessage();
				String a1 = a.substring(a.indexOf("\"") + 1);

				map = mapper.readValue(a1, Map.class);
				response.setMessage("Application Error" + a.substring(0, a.indexOf(":")));
				response.setPayload(map);
			} catch (JsonMappingException e1) {
				logger.error("Error:getResponse2", e1);

			} catch (JsonProcessingException e1) {
				logger.error("Error:getResponse3", e1);

			}
		}
		return response;
	}

	public Place[] getPlace(String uri) {
		RestTemplate restTemplate = new RestTemplate();

		String url = railEuroProprty.get("url") + uri; // or any other uri

		try {
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			logger.info("access Token:" + token.getAccess_token());

			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			HttpEntity<String> entity = new HttpEntity<>(headers);
			ResponseEntity<Place[]> result = restTemplate.exchange(url, HttpMethod.GET, entity, Place[].class);

			return result.getBody();
		} catch (Exception e) {
			logger.error("Error:getPlace", e);
			e.printStackTrace();

		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public Response postResponse(String uri, Object body, String xCorrelationId) {
		Response response = new Response();
		try {

			String url = railEuroProprty.get("url") + uri;
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);

			HttpEntity<Object> entity = new HttpEntity<>(body, headers);
			RestTemplate restTemplate = new RestTemplate();

			logger.info("postResponse:url:" + url + ", body:[" + body + "],  xCorrelationId:" + xCorrelationId
					+ " ,entity:" + entity);
			System.out.println("postResponse:url:" + url + ", body:[" + body + ",]  xCorrelationId:" + xCorrelationId
					+ " ,entity:" + entity);
			ResponseEntity<Object> result = restTemplate.postForEntity(url, entity, Object.class);
			response.setCode(result.getStatusCode().value());
			response.setPayload(result.getBody());

		} catch (Exception e) {
			logger.info("postResponse:url:" + uri + ", body:[" + body + ",]  xCorrelationId:" + xCorrelationId, e);

			response.setCode(403);
			response.setMessage("Application Error" + e.getLocalizedMessage());
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map;
			try {
				String a = e.getLocalizedMessage();
				String a1 = a.substring(a.indexOf("\"") + 1);

				map = mapper.readValue(a1, Map.class);
				response.setMessage("Application Error" + a.substring(0, a.indexOf(":")));
				response.setPayload(map);
			} catch (JsonMappingException e1) {

			} catch (JsonProcessingException e1) {

			}
		}
		return response;
	}

	public Response searchResponse(String uri, SearchRequest body, String xCorrelationId, Integer days) {
		Response response = new Response();
		try {

			String url = railEuroProprty.get("url") + uri;
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);
			HttpEntity<Object> entity = new HttpEntity<>(body, headers);
			RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());

			System.out.println("xCorrelationId=" + xCorrelationId + ", searchBody=" + body);
			ResponseEntity<PointToPointOffersSearchResults> result = restTemplate.postForEntity(url, entity,
					PointToPointOffersSearchResults.class);
			try {
				SearchIdThread thread = new SearchIdThread(searchResultLegOffersRepository, result.getBody());
				thread.start();

				response.setCode(result.getStatusCode().value());
				response.setPayload(result.getBody());
				SearchLogThread threadLof = new SearchLogThread(searchResultsRepository, body, result.getBody());
				threadLof.start();
			} catch (Exception ee) {
			}
		} catch (Exception e) {
			e.printStackTrace();

			response.setCode(403);
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map;
			try {
				String a = e.getLocalizedMessage();
				String a1 = a.substring(a.indexOf("\"") + 1);
				System.out.println("QQQ==" + a);
				map = mapper.readValue(a1, Map.class);
				response.setMessage("Application Error" + a.substring(0, a.indexOf(":")));
				response.setPayload(map);
			} catch (JsonMappingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JsonProcessingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return response;
	}

	public PointToPointOffersSearchResults searchResponse2(String uri, SearchRequest body, String xCorrelationId,
			Integer days) {
		ResponseEntity<PointToPointOffersSearchResults> result = null;
		try {

			String url = railEuroProprty.get("url") + uri;
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);
			HttpEntity<Object> entity = new HttpEntity<>(body, headers);
			RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());

			result = restTemplate.postForEntity(url, entity, PointToPointOffersSearchResults.class);

			try {
				SearchIdThread thread = new SearchIdThread(searchResultLegOffersRepository, result.getBody());
				thread.start();

				SearchLogThread threadLof = new SearchLogThread(searchResultsRepository, body, result.getBody());
				threadLof.start();
			} catch (Exception ee) {
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	//	System.out.println("result=" + result);
		if(result!=null)
		return result.getBody();
		else
			return null;
	}

	private ClientHttpRequestFactory getClientHttpRequestFactory() {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(200000);
		clientHttpRequestFactory.setReadTimeout(200000);
		return clientHttpRequestFactory;
	}

	public Response searchById(String uri, String xCorrelationId) {

		RestTemplate restTemplate = new RestTemplate();
		Response response = new Response();

		String url = railEuroProprty.get("url") + uri; // or any other uri

		try {
			TokenMaster token = getAccessToken();

			System.out.println("url=" + url);
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);
			System.out.println("=generateUniqueCorrelationId=getResponse=" + xCorrelationId);
			HttpEntity<String> entity = new HttpEntity<>(headers);
			ResponseEntity<PointToPointOffersSearchResults> result = restTemplate.exchange(url, HttpMethod.GET, entity,
					PointToPointOffersSearchResults.class);

			response.setCode(result.getStatusCode().value());

			response.setPayload(result.getBody());

		} catch (Exception e) {
			e.printStackTrace();
			response.setCode(403);
			response.setMessage(e.getMessage());
		}
		return response;

	}

	public Response putResponse(String uri, Object body, String xCorrelationId) {
		Response response = new Response();
		try {
			System.out.println("body=" + body);
		
			String url = railEuroProprty.get("url") + uri;
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);
			System.out.println("=generateUniqueCorrelationId=putResponse=" + xCorrelationId);
			HttpEntity<Object> entity = new HttpEntity<>(body, headers);
			RestTemplate restTemplate = new RestTemplate();
			// ResponseEntity<Object> result = restTemplate.putForEntity(url, entity,
			// Object.class );
			ResponseEntity<Object> result = restTemplate.exchange(url, HttpMethod.PUT, entity, Object.class);

			response.setCode(result.getStatusCode().value());
			response.setPayload(result.getBody());

		} catch (Exception e) {
			e.printStackTrace();
			response.setCode(403);
			response.setMessage("Application Error" + e.getLocalizedMessage());
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map;
			try {
				String a = e.getLocalizedMessage();
				String a1 = a.substring(a.indexOf("\"") + 1);
				System.out.println("QQQ==" + a1);
				map = mapper.readValue(a1, Map.class);
				response.setMessage("Application Error" + a.substring(0, a.indexOf(":")));
				response.setPayload(map);
			} catch (JsonMappingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JsonProcessingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return response;
	}

	public TokenMaster getAccessToken() {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		long date1 = calendar.getTimeInMillis();
		long diff = 3600000;

		if (tokenMaster == null) {
			tokenMaster = railEuroTokenResponseRepository.findTop1ByOrderByIdDesc();
		}
		System.out.println("date===" + new Date());
		if (tokenMaster != null)
			diff = date1 - tokenMaster.getCreateTime().getTime();
		else
			tokenMaster = new TokenMaster();
		System.out.println("Diff in tomken time=" + diff);
		if (diff >= (3600 * 1000)) {
			tokenMaster.setTimeMili(date1);
			String url = railEuroProprty.get("authurl");
			System.out.println("url=" + url);
			MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
			map.add("grant_type", "client_credentials");
			map.add("client_id", railEuroProprty.get("clientId"));
			map.add("client_secret", railEuroProprty.get("client_secret"));
			System.out.println("railEuroProprty="+railEuroProprty);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<MultiValueMap<String, String>> requestBodyFormUrlEncoded = new HttpEntity<>(map, headers);
			ResponseEntity<TokenResponse> responseEntity = null;
			try {
				responseEntity = restTemplate.postForEntity(url, requestBodyFormUrlEncoded, TokenResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
			}

			tokenMaster.setAccess_token(responseEntity.getBody().getAccess_token());
			tokenMaster.setToken_type(responseEntity.getBody().getToken_type());
			tokenMaster.setExpires_in(responseEntity.getBody().getExpires_in());
			tokenMaster.setCreateTime(calendar.getTime());
			railEuroTokenResponseRepository.save(tokenMaster);

		}
		return tokenMaster;
	}

	void readProperty() {

		List<RailProerties> list = railProertiesRepository.findAll();
		for (RailProerties railP : list) {
			railEuroProprty.put(railP.getKey(), railP.getValue());
		}
		System.out.println("railEuroProprtyDB=" + railEuroProprty);
	}

	String parseException(String exception) {
		System.out.println("excetopn=" + exception);
		exception = exception.replace("\"", "");
		String message = exception.substring(0, exception.indexOf(":"));
		System.out.println("message=" + message);
		exception = exception.substring(exception.indexOf(":"));
		System.out.println("excetopn=" + exception);
		return exception;
	}

	public static void main(String a[]) {
		Utility u = new Utility();
		u.parseException(
				"Application Error422 Unprocessable Entity: \"{\"name\":\"https://stoplight.io/prism/errors#UNPROCESSABLE_ENTITY\",\"status\":422,\"detail\":\"Route not resolved, no path matched\",\"additional\":{\"workspaceSlug\":\"rail-europe\",\"projectSlug\":\"era-api-doc\",\"url\":\"/offers/point-to-point/searches\",\"dynamic\":false}}\"");

	}

	public Response deleteResponse(String uri, String xCorrelationId) {
		Response response = new Response();
		try {
			String url = railEuroProprty.get("url") + uri;
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);
			System.out.println("=generateUniqueCorrelationId=deleteResponse=" + xCorrelationId);
			HttpEntity<Object> entity = new HttpEntity<>(headers);
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<Object> result = restTemplate.exchange(url, HttpMethod.DELETE, entity, Object.class);

			response.setCode(result.getStatusCode().value());
			response.setPayload(result.getBody());
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode(403);
			response.setMessage("Application Error" + e.getLocalizedMessage());
		}
		return response;
	}

	@SuppressWarnings("unchecked")
	public Response postRefundConfirm(String uri, Object body, String xCorrelationId) {
		Response response = new Response();
		try {

			String url = railEuroProprty.get("url") + uri;
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);

			HttpEntity<Object> entity = new HttpEntity<>(body, headers);
			RestTemplate restTemplate = new RestTemplate();

			logger.info("postResponse:url:" + url + ", body:[" + body + "],  xCorrelationId:" + xCorrelationId
					+ " ,entity:" + entity);
			System.out.println("postResponse:url:" + url + ", body:[" + body + ",]  xCorrelationId:" + xCorrelationId
					+ " ,entity:" + entity);
			ResponseEntity<ConfirmRefundResponse> result = restTemplate.postForEntity(url, entity,
					ConfirmRefundResponse.class);
			;
			System.out.println("resonse confirm :"+result.hasBody());
			response.setCode(result.getStatusCode().value());
			if (result.hasBody())
				response.setPayload(result.getBody());

			return response;
		} catch (Exception e) {
			logger.info("postResponse:url:" + uri + ", body:[" + body + ",]  xCorrelationId:" + xCorrelationId, e);

			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map;
			try {
				String a = e.getLocalizedMessage();
				String a1 = a.substring(a.indexOf("\"") + 1);
System.out.println("refund error:"+a1);
				map = mapper.readValue(a1, Map.class);
				response.setMessage(a1);
			} catch (JsonMappingException e1) {

			} catch (JsonProcessingException e1) {

			}
		}
		response.setCode(400);

		response.setPayload("");

		return response;
	}
	public Booking getBookingById(String uri, String xCorrelationId) {
		RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
		

		String url = railEuroProprty.get("url") + uri; // or any other uri

		try {
			TokenMaster token = getAccessToken();

			logger.info("access Token:" + token.getAccess_token());
			logger.info("urlOfRailEuro:" + url + ", xCorrelationId=" + xCorrelationId);

			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			headers.add("X-CorrelationId", xCorrelationId);

			HttpEntity<String> entity = new HttpEntity<>(headers);

			ResponseEntity<Booking> result = restTemplate.exchange(url, HttpMethod.GET, entity, Booking.class);
			logger.info("urlOfRailEuro:" + url + ", xCorrelationId=" + xCorrelationId + ", result:" + result);
			return result.getBody();
		} catch (Exception e) {
			
		}
		return null;
	}
	
	public HealthStatusHelper[] status(String uri) {
		RestTemplate restTemplate = new RestTemplate();

		String url = railEuroProprty.get("url") + uri; // or any other uri

		try {
			TokenMaster token = getAccessToken();
			HttpHeaders headers = new HttpHeaders();
			logger.info("access Token:" + token.getAccess_token());

			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token.getAccess_token());
			headers.add("Content-Type", "application/json");
			headers.add("X-Point-Of-Sale", railEuroProprty.get("X-Point-Of-Sale"));

			HttpEntity<String> entity = new HttpEntity<>(headers);
			ResponseEntity<HealthStatusHelper[]> result = restTemplate.exchange(url, HttpMethod.GET, entity, HealthStatusHelper[].class);
			System.out.println("result"+result.getBody());
			return result.getBody();
		} catch (Exception e) {
			logger.error("Error:getPlace", e);
			e.printStackTrace();

		}
		return null;
	}

}
