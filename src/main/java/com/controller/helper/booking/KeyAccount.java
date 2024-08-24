package com.controller.helper.booking;

public class KeyAccount {
String	code;
	String		email;
	String		name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "KeyAccount [code=" + code + ", email=" + email + ", name=" + name + "]";
	}
	
}
