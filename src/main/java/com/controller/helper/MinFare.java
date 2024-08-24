package com.controller.helper;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.controller.helper.booking.Amount;

import jakarta.persistence.Id;

@Document
public class MinFare {
	@Id
	String id;
	String source;
	String destination;
	String date;
	Amount fare;
	Date createDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Amount getFare() {
		return fare;
	}
	public void setFare(Amount fare) {
		this.fare = fare;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "MinFare [id=" + id + ", date=" + date + ", fare=" + fare + "]";
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
