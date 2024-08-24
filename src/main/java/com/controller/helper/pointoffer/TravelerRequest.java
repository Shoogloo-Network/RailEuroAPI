package com.controller.helper.pointoffer;

import java.util.Arrays;
import java.util.List;

public class TravelerRequest {
	Integer age;
	String[] claimProductTypes;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String[] getClaimProductTypes() {
		return claimProductTypes;
	}

	public void setClaimProductTypes(String[] claimProductTypes) {
		this.claimProductTypes = claimProductTypes;
	}

	@Override
	public String toString() {
		return "TravelerRequest [age=" + age + ", claimProductTypes=" + Arrays.toString(claimProductTypes) + "]";
	}

	
}
