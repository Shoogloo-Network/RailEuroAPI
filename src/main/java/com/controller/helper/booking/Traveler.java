package com.controller.helper.booking;
import java.util.List;

import com.controller.helper.ResourceError;

public class Traveler {
	String id;

	Integer age;			
	String type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Traveler [id=" + id  + ", age=" + age + ", type="
				+ type + "]";
	}
	
}
