package com.controller.helper.authentication;

public class TokenRequest {
	String grant_type;
	String client_id;
	String client_secret;
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	@Override
	public String toString() {
		return "TokenRequest [grant_type=" + grant_type + ", client_id=" + client_id + ", client_secret="
				+ client_secret + "]";
	}
	
}
