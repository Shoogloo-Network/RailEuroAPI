package com.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * The persistent class for the new_page database table.
 * 
 */
@Entity
@Table(name="new_page")
@NamedQuery(name="NewPage.findAll", query="SELECT n FROM NewPage n")
public class NewPage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String description;

	private String displayname;

	private String freeText;

	private String headercode;

	private String image;

	private String logoimage;

	private int masterPageId;

	private String metakeyword;

	private String metatitle;

	private String name;

	private int siteId;

	private String status;

	private String title;

	private String tooltip;

	private String url;

	public NewPage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFreeText() {
		return this.freeText;
	}

	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}

	public String getHeadercode() {
		return this.headercode;
	}

	public void setHeadercode(String headercode) {
		this.headercode = headercode;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLogoimage() {
		return this.logoimage;
	}

	public void setLogoimage(String logoimage) {
		this.logoimage = logoimage;
	}

	public int getMasterPageId() {
		return this.masterPageId;
	}

	public void setMasterPageId(int masterPageId) {
		this.masterPageId = masterPageId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSiteId() {
		return this.siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTooltip() {
		return this.tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}