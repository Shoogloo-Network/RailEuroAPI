package com.controller.helper;

import java.util.Date;

public class MinMax {

	String date;
	Double minPrice;
	Double maxPrice;
	Date firstTrain;
	Date lastTrain;
	String provider;
	
	String comfortCategoryCode;
	String flexibilityCode;

	public MinMax(String date, String offerComfortCategoryCode, String offerFlexibilityCode, Date solutionDeparture,
			Double offerBilling) {
		this.date = date;
		this.comfortCategoryCode = offerComfortCategoryCode;
		this.flexibilityCode = offerFlexibilityCode;
		this.minPrice = offerBilling;
		this.maxPrice = offerBilling;
		this.firstTrain = solutionDeparture;
		this.lastTrain = solutionDeparture;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getFirstTrain() {
		return firstTrain;
	}

	public void setFirstTrain(Date firstTrain) {
		this.firstTrain = firstTrain;
	}

	public Date getLastTrain() {
		return lastTrain;
	}

	public void setLastTrain(Date lastTrain) {
		this.lastTrain = lastTrain;
	}

	@Override
	public String toString() {
		return "MinMax [date=" + date + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice + ", firstTrain="
				+ firstTrain + ", lastTrain=" + lastTrain + "]";
	}

	public String getComfortCategoryCode() {
		return comfortCategoryCode;
	}

	public void setComfortCategoryCode(String comfortCategoryCode) {
		this.comfortCategoryCode = comfortCategoryCode;
	}

	public String getFlexibilityCode() {
		return flexibilityCode;
	}

	public void setFlexibilityCode(String flexibilityCode) {
		this.flexibilityCode = flexibilityCode;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

}
