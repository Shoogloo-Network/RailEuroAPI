package com.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity
@Table(name="new_wizard")
@NamedQuery(name="NewWizard.findAll", query="SELECT n FROM NewWizard n")
public class NewWizard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	private String freetext;
	private String image;
	private String morelink;
	private int siteId;
	private String title;

	public NewWizard() {
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

	public String getFreetext() {
		return this.freetext;
	}

	public void setFreetext(String freetext) {
		this.freetext = freetext;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMorelink() {
		return this.morelink;
	}

	public void setMorelink(String morelink) {
		this.morelink = morelink;
	}

	public int getSiteId() {
		return this.siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}