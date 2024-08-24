package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="rail_TokenResponse")
public class TokenMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String access_token;
	String token_type;
	String expires_in;
	Date createTime;
	Long TimeMili;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Long getTimeMili() {
		return TimeMili;
	}
	public void setTimeMili(Long timeMili) {
		TimeMili = timeMili;
	}
	@Override
	public String toString() {
		return "TokenMaster [id=" + id + ", access_token=" + access_token + ", token_type=" + token_type
				+ ", expires_in=" + expires_in + ", createTime=" + createTime + "]";
	}
	
	
}
