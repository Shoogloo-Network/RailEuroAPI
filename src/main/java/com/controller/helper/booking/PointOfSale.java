package com.controller.helper.booking;

public class PointOfSale {
String	code;
	
String	entity;
Profile profile;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getEntity() {
	return entity;
}
public void setEntity(String entity) {
	this.entity = entity;
}
public Profile getProfile() {
	return profile;
}
public void setProfile(Profile profile) {
	this.profile = profile;
}
@Override
public String toString() {
	return "PointOfSale [code=" + code + ", entity=" + entity + "]";
}


}
