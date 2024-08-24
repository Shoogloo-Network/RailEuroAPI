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
 * The persistent class for the new_country database table.
 * 
 */
@Entity
@Table(name="new_country")
@NamedQuery(name="NewCountry.findAll", query="SELECT n FROM NewCountry n")
public class NewCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="country_id")
	private int countryId;

	@Column(name="attractions_id")
	private String attractionsId;

	@Column(name="country_banner")
	private String countryBanner;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_continent_tbl_id")
	private int countryContinentTblId;

	@Column(name="country_creationdate")
	private Timestamp countryCreationdate;

	@Lob
	@Column(name="country_description")
	private String countryDescription;

	@Column(name="country_displayname")
	private String countryDisplayname;

	@Column(name="country_flagalt")
	private String countryFlagalt;

	@Column(name="country_image")
	private String countryImage;

	@Column(name="country_largeflagurl")
	private String countryLargeflagurl;

	@Column(name="country_latitude")
	private double countryLatitude;

	@Column(name="country_longitude")
	private double countryLongitude;

	@Column(name="country_mapalt")
	private String countryMapalt;

	@Column(name="country_mapurl")
	private String countryMapurl;

	@Lob
	@Column(name="country_metadescription")
	private String countryMetadescription;

	@Lob
	@Column(name="country_metakeyword")
	private String countryMetakeyword;

	@Lob
	@Column(name="country_metatitlebar")
	private String countryMetatitlebar;

	@Column(name="country_pagebackground")
	private String countryPagebackground;

	@Column(name="country_popularorder")
	private int countryPopularorder;

	@Column(name="country_smallflagurl")
	private String countrySmallflagurl;

	@Column(name="country_status")
	private String countryStatus;

	@Column(name="country_urlname")
	private String countryUrlname;

	@Column(name="country_zoomlevel")
	private int countryZoomlevel;

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

	public NewCountry() {
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getAttractionsId() {
		return this.attractionsId;
	}

	public void setAttractionsId(String attractionsId) {
		this.attractionsId = attractionsId;
	}

	public String getCountryBanner() {
		return this.countryBanner;
	}

	public void setCountryBanner(String countryBanner) {
		this.countryBanner = countryBanner;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getCountryContinentTblId() {
		return this.countryContinentTblId;
	}

	public void setCountryContinentTblId(int countryContinentTblId) {
		this.countryContinentTblId = countryContinentTblId;
	}

	public Timestamp getCountryCreationdate() {
		return this.countryCreationdate;
	}

	public void setCountryCreationdate(Timestamp countryCreationdate) {
		this.countryCreationdate = countryCreationdate;
	}

	public String getCountryDescription() {
		return this.countryDescription;
	}

	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}

	public String getCountryDisplayname() {
		return this.countryDisplayname;
	}

	public void setCountryDisplayname(String countryDisplayname) {
		this.countryDisplayname = countryDisplayname;
	}

	public String getCountryFlagalt() {
		return this.countryFlagalt;
	}

	public void setCountryFlagalt(String countryFlagalt) {
		this.countryFlagalt = countryFlagalt;
	}

	public String getCountryImage() {
		return this.countryImage;
	}

	public void setCountryImage(String countryImage) {
		this.countryImage = countryImage;
	}

	public String getCountryLargeflagurl() {
		return this.countryLargeflagurl;
	}

	public void setCountryLargeflagurl(String countryLargeflagurl) {
		this.countryLargeflagurl = countryLargeflagurl;
	}

	public double getCountryLatitude() {
		return this.countryLatitude;
	}

	public void setCountryLatitude(double countryLatitude) {
		this.countryLatitude = countryLatitude;
	}

	public double getCountryLongitude() {
		return this.countryLongitude;
	}

	public void setCountryLongitude(double countryLongitude) {
		this.countryLongitude = countryLongitude;
	}

	public String getCountryMapalt() {
		return this.countryMapalt;
	}

	public void setCountryMapalt(String countryMapalt) {
		this.countryMapalt = countryMapalt;
	}

	public String getCountryMapurl() {
		return this.countryMapurl;
	}

	public void setCountryMapurl(String countryMapurl) {
		this.countryMapurl = countryMapurl;
	}

	public String getCountryMetadescription() {
		return this.countryMetadescription;
	}

	public void setCountryMetadescription(String countryMetadescription) {
		this.countryMetadescription = countryMetadescription;
	}

	public String getCountryMetakeyword() {
		return this.countryMetakeyword;
	}

	public void setCountryMetakeyword(String countryMetakeyword) {
		this.countryMetakeyword = countryMetakeyword;
	}

	public String getCountryMetatitlebar() {
		return this.countryMetatitlebar;
	}

	public void setCountryMetatitlebar(String countryMetatitlebar) {
		this.countryMetatitlebar = countryMetatitlebar;
	}

	public String getCountryPagebackground() {
		return this.countryPagebackground;
	}

	public void setCountryPagebackground(String countryPagebackground) {
		this.countryPagebackground = countryPagebackground;
	}

	public int getCountryPopularorder() {
		return this.countryPopularorder;
	}

	public void setCountryPopularorder(int countryPopularorder) {
		this.countryPopularorder = countryPopularorder;
	}

	public String getCountrySmallflagurl() {
		return this.countrySmallflagurl;
	}

	public void setCountrySmallflagurl(String countrySmallflagurl) {
		this.countrySmallflagurl = countrySmallflagurl;
	}

	public String getCountryStatus() {
		return this.countryStatus;
	}

	public void setCountryStatus(String countryStatus) {
		this.countryStatus = countryStatus;
	}

	public String getCountryUrlname() {
		return this.countryUrlname;
	}

	public void setCountryUrlname(String countryUrlname) {
		this.countryUrlname = countryUrlname;
	}

	public int getCountryZoomlevel() {
		return this.countryZoomlevel;
	}

	public void setCountryZoomlevel(int countryZoomlevel) {
		this.countryZoomlevel = countryZoomlevel;
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

}