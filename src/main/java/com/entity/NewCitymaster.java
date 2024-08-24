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
 * The persistent class for the new_citymaster database table.
 * 
 */
@Entity
@Table(name="new_citymaster")
@NamedQuery(name="NewCitymaster.findAll", query="SELECT n FROM NewCitymaster n")
public class NewCitymaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="attractions_id")
	private String attractionsId;

	private String banner;

	private String code;

	@Column(name="country_id")
	private int countryId;

	private Timestamp creationdate;

	@Lob
	private String description;

	private String displayname;

	private double latitude;

	private double longitude;

	@Lob
	private String metadescription;

	@Lob
	private String metakeyword;

	@Lob
	private String metatitle;

	private int popularorder;

	@Lob
	@Column(name="rightbanner_code")
	private String rightbannerCode;

	@Lob
	@Column(name="rightbanner_image")
	private String rightbannerImage;

	@Lob
	@Column(name="rightbanner_link")
	private String rightbannerLink;

	private String smallbanner;
	@Column(name="status")
	private String statusCode;

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

	private String url;

	private String weathercode;

	private int websitemasterid;

	private int zoomlevel;

	public NewCitymaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAttractionsId() {
		return this.attractionsId;
	}

	public void setAttractionsId(String attractionsId) {
		this.attractionsId = attractionsId;
	}

	public String getBanner() {
		return this.banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Timestamp getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(Timestamp creationdate) {
		this.creationdate = creationdate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getMetadescription() {
		return this.metadescription;
	}

	public void setMetadescription(String metadescription) {
		this.metadescription = metadescription;
	}

	public String getMetakeyword() {
		return this.metakeyword;
	}

	public void setMetakeyword(String metakeyword) {
		this.metakeyword = metakeyword;
	}

	public String getMetatitle() {
		return this.metatitle;
	}

	public void setMetatitle(String metatitle) {
		this.metatitle = metatitle;
	}

	public int getPopularorder() {
		return this.popularorder;
	}

	public void setPopularorder(int popularorder) {
		this.popularorder = popularorder;
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

	public String getSmallbanner() {
		return this.smallbanner;
	}

	public void setSmallbanner(String smallbanner) {
		this.smallbanner = smallbanner;
	}

	

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWeathercode() {
		return this.weathercode;
	}

	public void setWeathercode(String weathercode) {
		this.weathercode = weathercode;
	}

	public int getWebsitemasterid() {
		return this.websitemasterid;
	}

	public void setWebsitemasterid(int websitemasterid) {
		this.websitemasterid = websitemasterid;
	}

	public int getZoomlevel() {
		return this.zoomlevel;
	}

	public void setZoomlevel(int zoomlevel) {
		this.zoomlevel = zoomlevel;
	}

}