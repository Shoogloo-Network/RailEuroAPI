package com.controller.helper.booking;

public class Applicability {
	String origin;
	String event;
	String level;
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Applicability [origin=" + origin + ", event=" + event + ", level=" + level + "]";
	}
	
}
