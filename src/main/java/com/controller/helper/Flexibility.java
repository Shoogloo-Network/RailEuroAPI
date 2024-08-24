package com.controller.helper;

public class Flexibility {
	String code;
	
	String label="string";

	Integer level=0;

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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Flexibility [code=" + code + ", label=" + label + ", level=" + level + "]";
	}
}