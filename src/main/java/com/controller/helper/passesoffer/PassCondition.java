package com.controller.helper.passesoffer;

public class PassCondition {
	String condition;
	String type;
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "PassCondition [condition=" + condition + ", type=" + type + "]";
	}
	
}
