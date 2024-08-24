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
 * The persistent class for the new_stations database table.
 * 
 */
@Entity
@Table(name="new_stations")
@NamedQuery(name="NewStation.findAll", query="SELECT n FROM NewStation n")
public class NewStation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String banner;

	private int cityid;

	private String code;

	private int countryid;

	private Timestamp creationdate;

	private String description;

	private String displayname;

	private double llatitude;

	private double longitude;

	private String metadescription;

	private String metakeyword;

	private String metatitle;

	private int popularorder;

	@Column(name="rightbanner_code")
	private String rightbannerCode;

	@Column(name="rightbanner_image")
	private String rightbannerImage;

	@Column(name="rightbanner_link")
	private String rightbannerLink;

	@Column(name="station_zoomlevel")
	private int stationZoomlevel;

	private String status;

	@Column(name="topbanner_code")
	private String topbannerCode;

	@Column(name="topbanner_image")
	private String topbannerImage;

	@Column(name="topbanner_link")
	private String topbannerLink;

	private String urlname;

	public NewStation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBanner() {
		return this.banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public int getCityid() {
		return this.cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCountryid() {
		return this.countryid;
	}

	public void setCountryid(int countryid) {
		this.countryid = countryid;
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

	public double getLlatitude() {
		return this.llatitude;
	}

	public void setLlatitude(double llatitude) {
		this.llatitude = llatitude;
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

	public int getStationZoomlevel() {
		return this.stationZoomlevel;
	}

	public void setStationZoomlevel(int stationZoomlevel) {
		this.stationZoomlevel = stationZoomlevel;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getUrlname() {
		return this.urlname;
	}

	public void setUrlname(String urlname) {
		this.urlname = urlname;
	}

}