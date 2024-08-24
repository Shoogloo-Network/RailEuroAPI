package com.controller.helper.pointoffer;

import org.springframework.data.mongodb.core.mapping.Document;

import com.controller.helper.places.Location;

import jakarta.persistence.Id;
@Document
public class Place {
	@Id
	String id;
	String type;
	String code;
	String label;
	String localLabel;
	String timezone;
	Country country;
	Location location;
	
	@Override
	public String toString() {
		return "Place [id=" + id + ", type=" + type + ", code=" + code + ", label=" + label + ", localLabel="
				+ localLabel + ", timezone=" + timezone + ", country=" + country + ", location=" + location + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLocalLabel() {
		return localLabel;
	}

	public void setLocalLabel(String localLabel) {
		this.localLabel = localLabel;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
