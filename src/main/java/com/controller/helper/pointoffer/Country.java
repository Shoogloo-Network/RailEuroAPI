package com.controller.helper.pointoffer;

public class Country {
	
	String code;
	String label;
	String localLabel;
	

	@Override
	public String toString() {
		return "Place [, code=" + code + ", label=" + label + ", localLabel="
				+ localLabel + "]";
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

	
	
}
