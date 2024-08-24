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


/**
 * The persistent class for the ctt_review database table.
 * 
 */
@Entity
@Table(name="ctt_review")
@NamedQuery(name="CttReview.findAll", query="SELECT c FROM CttReview c")
public class CttReview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="review_id")
	private int reviewId;

	private String email;

	private int flag;

	private String name;

	private int rating;

	@Temporal(TemporalType.DATE)
	@Column(name="review_date")
	private Date reviewDate;

	@Lob
	@Column(name="review_description")
	private String reviewDescription;

	@Column(name="review_page_type")
	private int reviewPageType;

	@Column(name="review_page_url")
	private String reviewPageUrl;

	@Column(name="review_status")
	private String reviewStatus;

	@Column(name="review_title")
	private String reviewTitle;

	public CttReview() {
	}

	public int getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewDescription() {
		return this.reviewDescription;
	}

	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}

	public int getReviewPageType() {
		return this.reviewPageType;
	}

	public void setReviewPageType(int reviewPageType) {
		this.reviewPageType = reviewPageType;
	}

	public String getReviewPageUrl() {
		return this.reviewPageUrl;
	}

	public void setReviewPageUrl(String reviewPageUrl) {
		this.reviewPageUrl = reviewPageUrl;
	}

	public String getReviewStatus() {
		return this.reviewStatus;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getReviewTitle() {
		return this.reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

}