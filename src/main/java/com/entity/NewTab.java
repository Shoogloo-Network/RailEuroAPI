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
 * The persistent class for the new_tabs database table.
 * 
 */
@Entity
@Table(name="new_tabs")
@NamedQuery(name="NewTab.findAll", query="SELECT n FROM NewTab n")
public class NewTab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tab_id")
	private int tabId;

	@Column(name="box_image")
	private String boxImage;

	@Column(name="contentbanner_image")
	private String contentbannerImage;

	@Column(name="merchant_details")
	private String merchantDetails;

	@Column(name="merchant_image")
	private String merchantImage;

	@Column(name="merchant_link")
	private String merchantLink;

	@Column(name="rightbanner_code")
	private String rightbannerCode;

	@Column(name="rightbanner_image")
	private String rightbannerImage;

	@Column(name="rightbanner_link")
	private String rightbannerLink;

	@Column(name="search_right")
	private String searchRight;

	@Column(name="tab_country_tbl_id")
	private int tabCountryTblId;

	@Column(name="tab_creationdate")
	private Timestamp tabCreationdate;

	@Column(name="tab_description")
	private String tabDescription;

	@Column(name="tab_displaylevel")
	private String tabDisplaylevel;

	@Column(name="tab_displayname")
	private String tabDisplayname;

	@Column(name="tab_metadescription")
	private String tabMetadescription;

	@Column(name="tab_metakeyword")
	private String tabMetakeyword;

	@Column(name="tab_metatitle")
	private String tabMetatitle;

	@Column(name="tab_order")
	private int tabOrder;

	@Column(name="tab_position")
	private String tabPosition;

	@Column(name="tab_selection")
	private String tabSelection;

	@Column(name="tab_status")
	private String tabStatus;

	@Column(name="tab_title")
	private String tabTitle;

	@Column(name="tab_type")
	private String tabType;

	@Column(name="tab_url")
	private String tabUrl;

	@Column(name="topbanner_code")
	private String topbannerCode;

	@Column(name="topbanner_image")
	private String topbannerImage;

	@Column(name="topbanner_link")
	private String topbannerLink;

	@Column(name="video_link")
	private String videoLink;

	public NewTab() {
	}

	public int getTabId() {
		return this.tabId;
	}

	public void setTabId(int tabId) {
		this.tabId = tabId;
	}

	public String getBoxImage() {
		return this.boxImage;
	}

	public void setBoxImage(String boxImage) {
		this.boxImage = boxImage;
	}

	public String getContentbannerImage() {
		return this.contentbannerImage;
	}

	public void setContentbannerImage(String contentbannerImage) {
		this.contentbannerImage = contentbannerImage;
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

	public int getTabCountryTblId() {
		return this.tabCountryTblId;
	}

	public void setTabCountryTblId(int tabCountryTblId) {
		this.tabCountryTblId = tabCountryTblId;
	}

	public Timestamp getTabCreationdate() {
		return this.tabCreationdate;
	}

	public void setTabCreationdate(Timestamp tabCreationdate) {
		this.tabCreationdate = tabCreationdate;
	}

	public String getTabDescription() {
		return this.tabDescription;
	}

	public void setTabDescription(String tabDescription) {
		this.tabDescription = tabDescription;
	}

	public String getTabDisplaylevel() {
		return this.tabDisplaylevel;
	}

	public void setTabDisplaylevel(String tabDisplaylevel) {
		this.tabDisplaylevel = tabDisplaylevel;
	}

	public String getTabDisplayname() {
		return this.tabDisplayname;
	}

	public void setTabDisplayname(String tabDisplayname) {
		this.tabDisplayname = tabDisplayname;
	}

	public String getTabMetadescription() {
		return this.tabMetadescription;
	}

	public void setTabMetadescription(String tabMetadescription) {
		this.tabMetadescription = tabMetadescription;
	}

	public String getTabMetakeyword() {
		return this.tabMetakeyword;
	}

	public void setTabMetakeyword(String tabMetakeyword) {
		this.tabMetakeyword = tabMetakeyword;
	}

	public String getTabMetatitle() {
		return this.tabMetatitle;
	}

	public void setTabMetatitle(String tabMetatitle) {
		this.tabMetatitle = tabMetatitle;
	}

	public int getTabOrder() {
		return this.tabOrder;
	}

	public void setTabOrder(int tabOrder) {
		this.tabOrder = tabOrder;
	}

	public String getTabPosition() {
		return this.tabPosition;
	}

	public void setTabPosition(String tabPosition) {
		this.tabPosition = tabPosition;
	}

	public String getTabSelection() {
		return this.tabSelection;
	}

	public void setTabSelection(String tabSelection) {
		this.tabSelection = tabSelection;
	}

	public String getTabStatus() {
		return this.tabStatus;
	}

	public void setTabStatus(String tabStatus) {
		this.tabStatus = tabStatus;
	}

	public String getTabTitle() {
		return this.tabTitle;
	}

	public void setTabTitle(String tabTitle) {
		this.tabTitle = tabTitle;
	}

	public String getTabType() {
		return this.tabType;
	}

	public void setTabType(String tabType) {
		this.tabType = tabType;
	}

	public String getTabUrl() {
		return this.tabUrl;
	}

	public void setTabUrl(String tabUrl) {
		this.tabUrl = tabUrl;
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

	public String getVideoLink() {
		return this.videoLink;
	}

	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

}