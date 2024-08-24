package com.controller.helper;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.controller.helper.booking.PointToPointOffersSearchResults;

import jakarta.persistence.Id;

@Document
public class SearchResults {
	@Id
	String id;
	PointToPointOffersSearchResults pointToPointOffersSearchResults;
	String sourceCity;
	Date travelDate;
	String destiCity;
	Long time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PointToPointOffersSearchResults getPointToPointOffersSearchResults() {
		return pointToPointOffersSearchResults;
	}

	public void setPointToPointOffersSearchResults(PointToPointOffersSearchResults pointToPointOffersSearchResults) {
		this.pointToPointOffersSearchResults = pointToPointOffersSearchResults;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestiCity() {
		return destiCity;
	}

	public void setDestiCity(String destiCity) {
		this.destiCity = destiCity;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "SearchResults[id=" + id + ", pointToPointOffersSearchResults=" + pointToPointOffersSearchResults + ", sourceCity=" + sourceCity + ", destiCity=" + destiCity + "]";
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

}
