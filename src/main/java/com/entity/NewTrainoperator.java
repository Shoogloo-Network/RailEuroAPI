package com.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.sql.Timestamp;


/**
 * The persistent class for the new_trainoperators database table.
 * 
 */
@Entity
@Table(name="new_trainoperators")
@NamedQuery(name="NewTrainoperator.findAll", query="SELECT n FROM NewTrainoperator n")
public class NewTrainoperator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="train_operator_id")
	private int trainOperatorId;

	@Lob
	@Column(name="merchant_details")
	private String merchantDetails;

	@Lob
	@Column(name="merchant_image")
	private String merchantImage;

	@Lob
	@Column(name="merchant_link")
	private String merchantLink;

	@Lob
	@Column(name="rightbanner_code")
	private String rightbannerCode;

	@Lob
	@Column(name="rightbanner_image")
	private String rightbannerImage;

	@Lob
	@Column(name="rightbanner_link")
	private String rightbannerLink;

	@Lob
	@Column(name="search_right")
	private String searchRight;

	@Lob
	@Column(name="topbanner_code")
	private String topbannerCode;

	@Lob
	@Column(name="topbanner_image")
	private String topbannerImage;

	@Lob
	@Column(name="topbanner_link")
	private String topbannerLink;

	@Column(name="train_operator_banner")
	private String trainOperatorBanner;

	@Column(name="train_operator_country_tbl_id")
	private int trainOperatorCountryTblId;

	@Column(name="train_operator_creationdate")
	private Timestamp trainOperatorCreationdate;

	@Lob
	@Column(name="train_operator_description")
	private String trainOperatorDescription;

	@Column(name="train_operator_displayname")
	private String trainOperatorDisplayname;

	@Column(name="train_operator_logo")
	private String trainOperatorLogo;

	@Lob
	@Column(name="train_operator_metadescription")
	private String trainOperatorMetadescription;

	@Lob
	@Column(name="train_operator_metakeyword")
	private String trainOperatorMetakeyword;

	@Lob
	@Column(name="train_operator_metatitle")
	private String trainOperatorMetatitle;

	@Column(name="train_operator_popularorder")
	private int trainOperatorPopularorder;

	@Column(name="train_operator_status")
	private String trainOperatorStatus;

	@Column(name="train_operator_url")
	private String trainOperatorUrl;

	@Column(name="train_routes_id")
	private String trainRoutesId;

	@Lob
	@Column(name="video_link")
	private String videoLink;

	public NewTrainoperator() {
	}

	public int getTrainOperatorId() {
		return this.trainOperatorId;
	}

	public void setTrainOperatorId(int trainOperatorId) {
		this.trainOperatorId = trainOperatorId;
	}

	public String getMerchantDetails() {
		return this.merchantDetails;
	}

	public void setMerchantDetails(String merchantDetails) {
		this.merchantDetails = merchantDetails;
	}

	public String getMerchantImage() {
		return this.merchantImage;
	}

	public void setMerchantImage(String merchantImage) {
		this.merchantImage = merchantImage;
	}

	public String getMerchantLink() {
		return this.merchantLink;
	}

	public void setMerchantLink(String merchantLink) {
		this.merchantLink = merchantLink;
	}

	public String getRightbannerCode() {
		return this.rightbannerCode;
	}

	public void setRightbannerCode(String rightbannerCode) {
		this.rightbannerCode = rightbannerCode;
	}

	public String getRightbannerImage() {
		return this.rightbannerImage;
	}

	public void setRightbannerImage(String rightbannerImage) {
		this.rightbannerImage = rightbannerImage;
	}

	public String getRightbannerLink() {
		return this.rightbannerLink;
	}

	public void setRightbannerLink(String rightbannerLink) {
		this.rightbannerLink = rightbannerLink;
	}

	public String getSearchRight() {
		return this.searchRight;
	}

	public void setSearchRight(String searchRight) {
		this.searchRight = searchRight;
	}

	public String getTopbannerCode() {
		return this.topbannerCode;
	}

	public void setTopbannerCode(String topbannerCode) {
		this.topbannerCode = topbannerCode;
	}

	public String getTopbannerImage() {
		return this.topbannerImage;
	}

	public void setTopbannerImage(String topbannerImage) {
		this.topbannerImage = topbannerImage;
	}

	public String getTopbannerLink() {
		return this.topbannerLink;
	}

	public void setTopbannerLink(String topbannerLink) {
		this.topbannerLink = topbannerLink;
	}

	public String getTrainOperatorBanner() {
		return this.trainOperatorBanner;
	}

	public void setTrainOperatorBanner(String trainOperatorBanner) {
		this.trainOperatorBanner = trainOperatorBanner;
	}

	public int getTrainOperatorCountryTblId() {
		return this.trainOperatorCountryTblId;
	}

	public void setTrainOperatorCountryTblId(int trainOperatorCountryTblId) {
		this.trainOperatorCountryTblId = trainOperatorCountryTblId;
	}

	public Timestamp getTrainOperatorCreationdate() {
		return this.trainOperatorCreationdate;
	}

	public void setTrainOperatorCreationdate(Timestamp trainOperatorCreationdate) {
		this.trainOperatorCreationdate = trainOperatorCreationdate;
	}

	public String getTrainOperatorDescription() {
		return this.trainOperatorDescription;
	}

	public void setTrainOperatorDescription(String trainOperatorDescription) {
		this.trainOperatorDescription = trainOperatorDescription;
	}

	public String getTrainOperatorDisplayname() {
		return this.trainOperatorDisplayname;
	}

	public void setTrainOperatorDisplayname(String trainOperatorDisplayname) {
		this.trainOperatorDisplayname = trainOperatorDisplayname;
	}

	public String getTrainOperatorLogo() {
		return this.trainOperatorLogo;
	}

	public void setTrainOperatorLogo(String trainOperatorLogo) {
		this.trainOperatorLogo = trainOperatorLogo;
	}

	public String getTrainOperatorMetadescription() {
		return this.trainOperatorMetadescription;
	}

	public void setTrainOperatorMetadescription(String trainOperatorMetadescription) {
		this.trainOperatorMetadescription = trainOperatorMetadescription;
	}

	public String getTrainOperatorMetakeyword() {
		return this.trainOperatorMetakeyword;
	}

	public void setTrainOperatorMetakeyword(String trainOperatorMetakeyword) {
		this.trainOperatorMetakeyword = trainOperatorMetakeyword;
	}

	public String getTrainOperatorMetatitle() {
		return this.trainOperatorMetatitle;
	}

	public void setTrainOperatorMetatitle(String trainOperatorMetatitle) {
		this.trainOperatorMetatitle = trainOperatorMetatitle;
	}

	public int getTrainOperatorPopularorder() {
		return this.trainOperatorPopularorder;
	}

	public void setTrainOperatorPopularorder(int trainOperatorPopularorder) {
		this.trainOperatorPopularorder = trainOperatorPopularorder;
	}

	public String getTrainOperatorStatus() {
		return this.trainOperatorStatus;
	}

	public void setTrainOperatorStatus(String trainOperatorStatus) {
		this.trainOperatorStatus = trainOperatorStatus;
	}

	public String getTrainOperatorUrl() {
		return this.trainOperatorUrl;
	}

	public void setTrainOperatorUrl(String trainOperatorUrl) {
		this.trainOperatorUrl = trainOperatorUrl;
	}

	public String getTrainRoutesId() {
		return this.trainRoutesId;
	}

	public void setTrainRoutesId(String trainRoutesId) {
		this.trainRoutesId = trainRoutesId;
	}

	public String getVideoLink() {
		return this.videoLink;
	}

	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

}