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
 * The persistent class for the new_trainroutes database table.
 * 
 */
@Entity
@Table(name="new_trainroutes")
@NamedQuery(name="NewTrainroute.findAll", query="SELECT n FROM NewTrainroute n")
public class NewTrainroute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trainroute_id")
	private int trainrouteId;

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

	@Column(name="train_companies_id")
	private String trainCompaniesId;

	@Column(name="trainroute_banner")
	private String trainrouteBanner;

	@Column(name="trainroute_country_tbl_id")
	private int trainrouteCountryTblId;

	@Column(name="trainroute_creationdate")
	private Timestamp trainrouteCreationdate;

	@Lob
	@Column(name="trainroute_description")
	private String trainrouteDescription;

	@Column(name="trainroute_displayname")
	private String trainrouteDisplayname;

	@Column(name="trainroute_logo")
	private String trainrouteLogo;

	@Lob
	@Column(name="trainroute_metadescription")
	private String trainrouteMetadescription;

	@Lob
	@Column(name="trainroute_metakeyword")
	private String trainrouteMetakeyword;

	@Lob
	@Column(name="trainroute_metatitle")
	private String trainrouteMetatitle;

	@Column(name="trainroute_popularorder")
	private int trainroutePopularorder;

	@Column(name="trainroute_status")
	private String trainrouteStatus;

	@Column(name="trainroute_title")
	private String trainrouteTitle;

	@Column(name="trainroute_url")
	private String trainrouteUrl;

	public NewTrainroute() {
	}

	public int getTrainrouteId() {
		return this.trainrouteId;
	}

	public void setTrainrouteId(int trainrouteId) {
		this.trainrouteId = trainrouteId;
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

	public String getTrainCompaniesId() {
		return this.trainCompaniesId;
	}

	public void setTrainCompaniesId(String trainCompaniesId) {
		this.trainCompaniesId = trainCompaniesId;
	}

	public String getTrainrouteBanner() {
		return this.trainrouteBanner;
	}

	public void setTrainrouteBanner(String trainrouteBanner) {
		this.trainrouteBanner = trainrouteBanner;
	}

	public int getTrainrouteCountryTblId() {
		return this.trainrouteCountryTblId;
	}

	public void setTrainrouteCountryTblId(int trainrouteCountryTblId) {
		this.trainrouteCountryTblId = trainrouteCountryTblId;
	}

	public Timestamp getTrainrouteCreationdate() {
		return this.trainrouteCreationdate;
	}

	public void setTrainrouteCreationdate(Timestamp trainrouteCreationdate) {
		this.trainrouteCreationdate = trainrouteCreationdate;
	}

	public String getTrainrouteDescription() {
		return this.trainrouteDescription;
	}

	public void setTrainrouteDescription(String trainrouteDescription) {
		this.trainrouteDescription = trainrouteDescription;
	}

	public String getTrainrouteDisplayname() {
		return this.trainrouteDisplayname;
	}

	public void setTrainrouteDisplayname(String trainrouteDisplayname) {
		this.trainrouteDisplayname = trainrouteDisplayname;
	}

	public String getTrainrouteLogo() {
		return this.trainrouteLogo;
	}

	public void setTrainrouteLogo(String trainrouteLogo) {
		this.trainrouteLogo = trainrouteLogo;
	}

	public String getTrainrouteMetadescription() {
		return this.trainrouteMetadescription;
	}

	public void setTrainrouteMetadescription(String trainrouteMetadescription) {
		this.trainrouteMetadescription = trainrouteMetadescription;
	}

	public String getTrainrouteMetakeyword() {
		return this.trainrouteMetakeyword;
	}

	public void setTrainrouteMetakeyword(String trainrouteMetakeyword) {
		this.trainrouteMetakeyword = trainrouteMetakeyword;
	}

	public String getTrainrouteMetatitle() {
		return this.trainrouteMetatitle;
	}

	public void setTrainrouteMetatitle(String trainrouteMetatitle) {
		this.trainrouteMetatitle = trainrouteMetatitle;
	}

	public int getTrainroutePopularorder() {
		return this.trainroutePopularorder;
	}

	public void setTrainroutePopularorder(int trainroutePopularorder) {
		this.trainroutePopularorder = trainroutePopularorder;
	}

	public String getTrainrouteStatus() {
		return this.trainrouteStatus;
	}

	public void setTrainrouteStatus(String trainrouteStatus) {
		this.trainrouteStatus = trainrouteStatus;
	}

	public String getTrainrouteTitle() {
		return this.trainrouteTitle;
	}

	public void setTrainrouteTitle(String trainrouteTitle) {
		this.trainrouteTitle = trainrouteTitle;
	}

	public String getTrainrouteUrl() {
		return this.trainrouteUrl;
	}

	public void setTrainrouteUrl(String trainrouteUrl) {
		this.trainrouteUrl = trainrouteUrl;
	}

}