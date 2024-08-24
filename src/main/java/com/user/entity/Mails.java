package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mails")

public class Mails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;

	String to;
	String from;
	Long siteId;
	String action;
	Date curDate = new Date();
	String name;
	String publicUrl;
	String readOnly;
	String size;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getCurDate() {
		return curDate;
	}
	public void setCurDate(Date curDate) {
		this.curDate = curDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublicUrl() {
		return publicUrl;
	}
	public void setPublicUrl(String publicUrl) {
		this.publicUrl = publicUrl;
	}
	public String getReadOnly() {
		return readOnly;
	}
	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Mails [id=" + id + ", to=" + to + ", from=" + from + ", siteId=" + siteId + ", action=" + action
				+ ", curDate=" + curDate + ", name=" + name + ", publicUrl=" + publicUrl + ", readOnly=" + readOnly
				+ ", size=" + size + "]";
	}

}
