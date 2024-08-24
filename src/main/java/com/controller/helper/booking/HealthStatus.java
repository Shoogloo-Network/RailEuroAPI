package com.controller.helper.booking;

public class HealthStatus {
	String id;
	String	status;
	String	downtime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDowntime() {
		return downtime;
	}
	public void setDowntime(String downtime) {
		this.downtime = downtime;
	}
	@Override
	public String toString() {
		return "HealthStatus [id=" + id + ", status=" + status + ", downtime=" + downtime + "]";
	}
	
//	ISO 8601 duration format
//
//	Example:
//	PT40M46S
	
	
}
