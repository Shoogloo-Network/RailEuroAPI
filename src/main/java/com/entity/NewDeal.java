package com.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the new_deals database table.
 * 
 */
@Entity
@Table(name="new_deals")
@NamedQuery(name="NewDeal.findAll", query="SELECT n FROM NewDeal n")
public class NewDeal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="country_id")
	private int countryId;

	@Column(name="deal_creationdate")
	private Timestamp dealCreationdate;

	@Temporal(TemporalType.DATE)
	@Column(name="deal_expiry")
	private Date dealExpiry;

	@Column(name="deal_status")
	private String dealStatus;

	private String description;

	private String discount;

	@Column(name="ffb_link")
	private String ffbLink;

	private String image;

	private String link;

	@Column(name="ln_link")
	private String lnLink;

	@Column(name="page_type")
	private int pageType;

	@Column(name="page_url")
	private String pageUrl;

	private String title;

	@Column(name="tw_link")
	private String twLink;

	@Column(name="votes_down")
	private int votesDown;

	@Column(name="votes_up")
	private int votesUp;
	@Column(name="dealOrder")
	private int dealOrder;
	public NewDeal() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Timestamp getDealCreationdate() {
		return this.dealCreationdate;
	}

	public void setDealCreationdate(Timestamp dealCreationdate) {
		this.dealCreationdate = dealCreationdate;
	}

	public Date getDealExpiry() {
		return this.dealExpiry;
	}

	public void setDealExpiry(Date dealExpiry) {
		this.dealExpiry = dealExpiry;
	}

	public String getDealStatus() {
		return this.dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFfbLink() {
		return this.ffbLink;
	}

	public void setFfbLink(String ffbLink) {
		this.ffbLink = ffbLink;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getLnLink() {
		return this.lnLink;
	}

	public void setLnLink(String lnLink) {
		this.lnLink = lnLink;
	}

	public int getPageType() {
		return this.pageType;
	}

	public void setPageType(int pageType) {
		this.pageType = pageType;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTwLink() {
		return this.twLink;
	}

	public void setTwLink(String twLink) {
		this.twLink = twLink;
	}

	public int getVotesDown() {
		return this.votesDown;
	}

	public void setVotesDown(int votesDown) {
		this.votesDown = votesDown;
	}

	public int getVotesUp() {
		return this.votesUp;
	}

	public void setVotesUp(int votesUp) {
		this.votesUp = votesUp;
	}

	public int getDealOrder() {
		return dealOrder;
	}

	public void setDealOrder(int dealOrder) {
		this.dealOrder = dealOrder;
	}

	@Override
	public String toString() {
		return "NewDeal [id=" + id + ", countryId=" + countryId + ", dealCreationdate=" + dealCreationdate
				+ ", dealExpiry=" + dealExpiry + ", dealStatus=" + dealStatus + ", description=" + description
				+ ", discount=" + discount + ", ffbLink=" + ffbLink + ", image=" + image + ", link=" + link
				+ ", lnLink=" + lnLink + ", pageType=" + pageType + ", pageUrl=" + pageUrl + ", title=" + title
				+ ", twLink=" + twLink + ", votesDown=" + votesDown + ", votesUp=" + votesUp + ", dealOrder="
				+ dealOrder + "]";
	}

}