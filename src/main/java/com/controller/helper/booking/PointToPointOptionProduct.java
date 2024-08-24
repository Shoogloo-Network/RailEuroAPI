package com.controller.helper.booking;

public class PointToPointOptionProduct {
	String code;
	String label;
	String marketingCarrier;
	String supplier;
	String type;
	String serviceType;
	String title;
	String summary;
	String description;
	@Override
	public String toString() {
		return "PointToPointOptionProduct [code=" + code + ", label=" + label + ", marketingCarrier=" + marketingCarrier
				+ ", supplier=" + supplier + ", type=" + type + ", serviceType=" + serviceType + ", title=" + title
				+ ", summary=" + summary + ", description=" + description + "]";
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
	public String getMarketingCarrier() {
		return marketingCarrier;
	}
	public void setMarketingCarrier(String marketingCarrier) {
		this.marketingCarrier = marketingCarrier;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
