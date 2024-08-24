package com.controller.helper.pointoffer;

public class PointToPointReservationProduct {
	String code;
	String label;
	String marketingCarrier;
	String supplier;
	Comfort comfortCategory;
	String type;
	CabinClass cabinClass;
	String conditions;
	Boolean externalReservation;
	@Override
	public String toString() {
		return "PointToPointReservationProduct [code=" + code + ", label=" + label + ", marketingCarrier="
				+ marketingCarrier + ", supplier=" + supplier + ", type=" + type + ", cabinClass=" + cabinClass
				+ ", conditions=" + conditions + ", externalReservation=" + externalReservation + "]";
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
	public CabinClass getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(CabinClass cabinClass) {
		this.cabinClass = cabinClass;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public Boolean getExternalReservation() {
		return externalReservation;
	}
	public void setExternalReservation(Boolean externalReservation) {
		this.externalReservation = externalReservation;
	}
	
}
