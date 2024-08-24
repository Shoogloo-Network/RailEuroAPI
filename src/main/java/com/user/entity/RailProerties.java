package com.user.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
 
 
/**
* The persistent class for the new_properties database table.
* 
*/
@Entity
@Table(name="railEuro_properties")

public class RailProerties implements Serializable {
	private static final long serialVersionUID = 1L;
 
	@Id
	private int id;
 
	private String description;
 
	private String domain;
 
	private String key;
 
	private int status;
 
	private String value;
 
	public RailProerties() {
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
 
	public String getDomain() {
		return this.domain;
	}
 
	public void setDomain(String domain) {
		this.domain = domain;
	}
 
	public String getKey() {
		return this.key;
	}
 
	public void setKey(String key) {
		this.key = key;
	}
 
	public int getStatus() {
		return this.status;
	}
 
	public void setStatus(int status) {
		this.status = status;
	}
 
	public String getValue() {
		return this.value;
	}
 
	public void setValue(String value) {
		this.value = value;
	}
 
}
