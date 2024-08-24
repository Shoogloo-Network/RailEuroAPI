package com.controller.helper.booking;

public class PointToPointProduct {
	String code;
	String label;
	String marketingCarrier;
	String supplier;
	Comfort comfortCategory;
	String type;
	PaxType paxType;
	CabinClass cabinClass;
	Fare fare;
	@Override
	public String toString() {
		return "PointToPointProduct [code=" + code + ", label=" + label + ", marketingCarrier=" + marketingCarrier
				+ ", supplier=" + supplier + ", comfortCategory=" + comfortCategory + ", type=" + type + ", paxType="
				+ paxType + ", cabinClass=" + cabinClass + ", fare=" + fare + "]";
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
	public Comfort getComfortCategory() {
		return comfortCategory;
	}
	public void setComfortCategory(Comfort comfortCategory) {
		this.comfortCategory = comfortCategory;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PaxType getPaxType() {
		return paxType;
	}
	public void setPaxType(PaxType paxType) {
		this.paxType = paxType;
	}
	public CabinClass getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(CabinClass cabinClass) {
		this.cabinClass = cabinClass;
	}
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}
	
	
	
	
}
