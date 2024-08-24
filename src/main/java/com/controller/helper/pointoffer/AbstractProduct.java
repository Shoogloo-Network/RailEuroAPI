package com.controller.helper.pointoffer;

public class AbstractProduct {
	String code;
	String label;
	String	marketingCarrier;
	String supplier;
	Comfort comfortCategory;

	String type;

	@Override
	public String toString() {
		return "AbstractProduct [code=" + code + ", label=" + label + ", marketingCarrier=" + marketingCarrier
				+ ", supplier=" + supplier + ", comfortCategory=" + comfortCategory + ", type=" + type + "]";
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

}
