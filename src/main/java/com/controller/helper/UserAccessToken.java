package com.controller.helper;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public class UserAccessToken {
	@Id
	String id;
	Long userId;
	String accessToken;
	Date expireAfterSeconds;
	Date lastLoginAt;
	Long timeInMilli;
	String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Date getExpireAfterSeconds() {
		return expireAfterSeconds;
	}

	public void setExpireAfterSeconds(Date expireAfterSeconds) {
		this.expireAfterSeconds = expireAfterSeconds;
	}

	public Date getLastLoginAt() {
		return lastLoginAt;
	}

	public void setLastLoginAt(Date lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	public Long getTimeInMilli() {
		return timeInMilli;
	}

	public void setTimeInMilli(Long timeInMilli) {
		this.timeInMilli = timeInMilli;
	}

	@Override
	public String toString() {
		return "JwtToken [userId=" + userId + ", accessToken=" + accessToken + ", expireAfterSeconds="
				+ expireAfterSeconds + ", lastLoginAt=" + lastLoginAt + ", timeInMilli=" + timeInMilli + ", email="
				+ email + "]";
	}

}
