package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="healthstatus")
public class HealthStatus {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String  statusid;
	String	status;
	String	downtime;
	Long converttime;
	Long addontime;
	Date createdate;
	String uktime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatusid() {
		return statusid;
	}
	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDowntime() {
		return downtime;
	}
	public void setDowntime(String downtime) {
		this.downtime = downtime;
	}
	public Long getConverttime() {
		return converttime;
	}
	public void setConverttime(Long converttime) {
		this.converttime = converttime;
	}
	public Long getAddontime() {
		return addontime;
	}
	public void setAddontime(Long addontime) {
		this.addontime = addontime;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getUktime() {
		return uktime;
	}
	public void setUktime(String uktime) {
		this.uktime = uktime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "HealthStatus [id=" + id + ", statusid=" + statusid + ", status=" + status + ", downtime=" + downtime
				+ ", converttime=" + converttime + ", addontime=" + addontime + ", createdate=" + createdate
				+ ", uktime=" + uktime + "]";
	}
		
}
