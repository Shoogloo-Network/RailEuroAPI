package com.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the new_cityrailopertorel database table.
 * 
 */
@Entity
@Table(name="new_cityrailopertorel")
@NamedQuery(name="NewCityrailopertorel.findAll", query="SELECT n FROM NewCityrailopertorel n")
public class NewCityrailopertorel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int cityId;

	private int railOperatorId;

	public NewCityrailopertorel() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getRailOperatorId() {
		return this.railOperatorId;
	}

	public void setRailOperatorId(int railOperatorId) {
		this.railOperatorId = railOperatorId;
	}

}