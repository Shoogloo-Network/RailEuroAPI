package com.controller.helper.pointoffer;

import com.controller.helper.Flexibility;

public class Fare {
	String label;
	Flexibility flexibility;
	String conditions;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Flexibility getFlexibility() {
		return flexibility;
	}
	public void setFlexibility(Flexibility flexibility) {
		this.flexibility = flexibility;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	@Override
	public String toString() {
		return "Fare [label=" + label + ", flexibility=" + flexibility + ", conditions=" + conditions + "]";
	}
	
	
}
