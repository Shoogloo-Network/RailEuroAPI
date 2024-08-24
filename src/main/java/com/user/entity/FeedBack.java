	package com.user.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@NamedQuery(query="SELECT  b.name, a.service, a.location, a.valueMoney, a.cleanliness,   a.facilities, a.seoUrl,"
		+ "   (a.service+a.location+   a.valueMoney+ a.cleanliness+ a.facilities)/5 "
		+ "as average,    a.status,  a.publishDate "
		+ "FROM FeedBack a , User b where a.userId=b.id and siteId=?1 and seoUrl=?2", name = "FeedBack.findFeedBackBySeoUrl")
@Table(name="feedBack")

public class FeedBack implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;

	private Long siteId;
	private Integer service;
	private Integer location;
	private Integer valueMoney;
	private Long userId;
	private Integer cleanliness;
	private Integer facilities;
	private String seoUrl;
	private Long average;
	private Integer status;
	Date publishDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public Integer getValueMoney() {
		return valueMoney;
	}
	public void setValueMoney(Integer valueMoney) {
		this.valueMoney = valueMoney;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getCleanliness() {
		return cleanliness;
	}
	public void setCleanliness(Integer cleanliness) {
		this.cleanliness = cleanliness;
	}
	public Integer getFacilities() {
		return facilities;
	}
	public void setFacilities(Integer facilities) {
		this.facilities = facilities;
	}
	public String getSeoUrl() {
		return seoUrl;
	}
	public void setSeoUrl(String seoUrl) {
		this.seoUrl = seoUrl;
	}
	public Long getAverage() {
		return average;
	}
	public void setAverage(Long average) {
		this.average = average;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "FeedBack [id=" + id + ", siteId=" + siteId + ", service=" + service + ", location=" + location
				+ ", valueMoney=" + valueMoney + ", userId=" + userId + ", cleanliness=" + cleanliness + ", facilities="
				+ facilities + ", seoUrl=" + seoUrl + ", average=" + average + ", status=" + status + ", publishDate="
				+ publishDate + "]";
	}

	
	
}