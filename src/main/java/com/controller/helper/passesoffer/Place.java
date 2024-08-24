package com.controller.helper.passesoffer;

public class Place {
	String type;
	String code;

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

	@Override
	public String toString() {
		return "Place [type=" + type + ", code=" + code + "]";
	}

}
