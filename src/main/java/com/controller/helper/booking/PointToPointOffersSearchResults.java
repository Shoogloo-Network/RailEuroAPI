package com.controller.helper.booking;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.controller.helper.ResourceError;

import jakarta.persistence.Id;
@Document
public class PointToPointOffersSearchResults {
	@Id
	String id;
	String pointOfSale;
	List<PointToPointOffersLeg>legs;
	List<Traveler>travelers;
	List<PointToPointOffer>offers;
	List<PointToPointProduct>products;
	List<Service>services;
	List<LegSolutionHighlight>highlights;
	List<ResourceError>errors;

	List<ResourceError>warnings;



	@Override
	public String toString() {
		return "PointToPointOffersSearchResults [id=" + id + ", pointOfSale=" + pointOfSale + ", \n\n*****\nlegs=" + legs
				+ "\n, travelers=" + travelers + ",\n*****\n offers=" + offers + "\n, products=" + products + "\n\n***\n, services="
				+ services + ", highlights=" + highlights + ", errors=" + errors + ", warnings=" + warnings + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPointOfSale() {
		return pointOfSale;
	}

	public void setPointOfSale(String pointOfSale) {
		this.pointOfSale = pointOfSale;
	}

	public List<PointToPointOffersLeg> getLegs() {
		return legs;
	}

	public void setLegs(List<PointToPointOffersLeg> legs) {
		this.legs = legs;
	}

	public List<Traveler> getTravelers() {
		return travelers;
	}

	public void setTravelers(List<Traveler> travelers) {
		this.travelers = travelers;
	}

	public List<PointToPointOffer> getOffers() {
		return offers;
	}

	public void setOffers(List<PointToPointOffer> offers) {
		this.offers = offers;
	}

	public List<PointToPointProduct> getProducts() {
		return products;
	}

	public void setProducts(List<PointToPointProduct> products) {
		this.products = products;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<LegSolutionHighlight> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<LegSolutionHighlight> highlights) {
		this.highlights = highlights;
	}

	public List<ResourceError> getErrors() {
		return errors;
	}

	public void setErrors(List<ResourceError> errors) {
		this.errors = errors;
	}

	public List<ResourceError> getWarnings() {
		return warnings;
	}

	public void setWarnings(List<ResourceError> warnings) {
		this.warnings = warnings;
	}
	
}
