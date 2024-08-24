package com.bb.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.helper.UserAccessToken;
import com.mongo.repository.JwtTokenRepository;
import com.user.entity.User;
import com.user.repository.UserRepository;
import com.util.JwtService;

@Service
public class AuthJwtToken {
	@Autowired
	JwtTokenRepository jwtTokenRepository;
	@Autowired
	UserRepository userRepository;
	
	final long EXPIRATION_TIME = 3600; // 10 days in milliseconds
	
	public String createAccessToken(String userEmail, Long userId,boolean forgetPass) {
		
		User user = new User();
		JwtService jwtService = new JwtService();
		UserAccessToken jwtHelper = new UserAccessToken();
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		long date1 = calendar.getTimeInMillis();
		Long time= (long) (1000 * 60 * 60*4);
		if(forgetPass)
			 time= (long) (1000 * 60 * 10);
		Date expireTime = new Date(System.currentTimeMillis() +time);

		//simple generate user access token
		String accessToken = jwtService.generateToken(user.getEmail(), expireTime);
		//check existing user from sql db 
		user = userRepository.findByEmail(userEmail);
		if (user != null) {
			jwtTokenRepository.deleteByUserId(userId);
			// jwtTokenRepository.deleteByEmail(useremail);
		}

		jwtHelper.setUserId(userId);
		jwtHelper.setEmail(userEmail);
		jwtHelper.setAccessToken(accessToken);
		jwtHelper.setExpireAfterSeconds(expireTime);
		jwtHelper.setLastLoginAt(new Date());
		jwtHelper.setTimeInMilli(date1);
		jwtTokenRepository.save(jwtHelper);
		System.out.println("accessToken="+accessToken);
		return accessToken;
	}

	
	public Void jwtTokenBYaccessToken(String accessToken, Long userId) {
		Optional<User> user = null;
		JwtService jwtService = new JwtService();
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		long date1 = calendar.getTimeInMillis();

		UserAccessToken jwtHelper = new UserAccessToken();

		user = userRepository.findById(userId);
		System.out.println("=============" + user);
		System.out.println("userId+" + userId);
		UserAccessToken checkToken = jwtTokenRepository.findByUserId(userId);
		System.out.println("checkToken=" + checkToken);
		System.out.println("accessToken=" + accessToken);
		checkToken = jwtTokenRepository.findByAccessToken(accessToken);
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkk" + checkToken);
		return null;
	}

	public Void jwtTokenByEmailAndAccessToken(String useremail, String accessToken) {

		User user = new User();
		JwtService jwtService = new JwtService();
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		long date1 = calendar.getTimeInMillis();
		
		Date dateObj = new Date();
        Date expireTime = new Date(dateObj.getTime() + EXPIRATION_TIME);
        
		String accesstoken = jwtService.generateToken(user.getEmail(), expireTime);
		UserAccessToken jwttoken = new UserAccessToken();

		user = userRepository.findByEmail(useremail);
		UserAccessToken checkToken = jwtTokenRepository.findByUserId(user.getId());
		System.out.println("checkToken=" + checkToken);
		checkToken = jwtTokenRepository.findByAccessToken(accessToken);
//		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkk"+checkToken);
//		jwttoken.setUserId(user.getId());
//		jwttoken.setAccessToken(accesstoken);
//		jwttoken.setExpireAfterSeconds((long) 3600);
//		jwttoken.setLastLoginAt(new Date());
//		jwttoken.setTimeInMilli(date1);
////		jwttoken.setEmail(useremail);
//		jwtTokenRepository.save(jwttoken);

		return null;
	}
}
