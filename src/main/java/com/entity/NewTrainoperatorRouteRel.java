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
@Table(name="new_railProviderRouteRel")

public class NewTrainoperatorRouteRel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private int id;

	@Lob
	@Column(name="railProviderId")
	private Integer railProviderId;

	@Lob
	@Column(name="routeId")
	private Integer routeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getRailProviderId() {
		return railProviderId;
	}

	public void setRailProviderId(Integer railProviderId) {
		this.railProviderId = railProviderId;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	@Override
	public String toString() {
		return "NewTrainoperatorRouteRel [id=" + id + ", railProviderId=" + railProviderId + ", routeId=" + routeId
				+ "]";
	}

	
}