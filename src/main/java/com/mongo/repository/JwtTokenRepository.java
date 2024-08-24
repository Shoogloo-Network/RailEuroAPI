package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.controller.helper.UserAccessToken;

public interface JwtTokenRepository extends MongoRepository<UserAccessToken, Long> {

	UserAccessToken findByUserId(Long userId);

	void deleteByEmail(String useremail);

	void deleteByUserId(Long userId);

	UserAccessToken findByAccessToken(String accessToken);

	UserAccessToken findByEmail(String email);

}
