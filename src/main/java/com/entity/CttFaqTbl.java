package com.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;




/**
 * The persistent class for the ctt_faq_tbl database table.
 * 
 */
@Entity
@Table(name="ctt_faq_tbl")
@NamedQuery(name="CttFaqTbl.findAll", query="SELECT c FROM CttFaqTbl c")
public class CttFaqTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="faq_id")
	private int faqId;

	@Lob
	@Column(name="faq_description")
	private String faqDescription;

	@Column(name="faq_order")
	private int faqOrder;

	@Column(name="faq_page_type")
	private int faqPageType;

	@Column(name="faq_page_url")
	private String faqPageUrl;

	@Column(name="faq_status")
	private String faqStatus;

	@Column(name="faq_title")
	private String faqTitle;

	public CttFaqTbl() {
	}

	public int getFaqId() {
		return this.faqId;
	}

	public void setFaqId(int faqId) {
		this.faqId = faqId;
	}

	public String getFaqDescription() {
		return this.faqDescription;
	}

	public void setFaqDescription(String faqDescription) {
		this.faqDescription = faqDescription;
	}

	public int getFaqOrder() {
		return this.faqOrder;
	}

	public void setFaqOrder(int faqOrder) {
		this.faqOrder = faqOrder;
	}

	public int getFaqPageType() {
		return this.faqPageType;
	}

	public void setFaqPageType(int faqPageType) {
		this.faqPageType = faqPageType;
	}

	public String getFaqPageUrl() {
		return this.faqPageUrl;
	}

	public void setFaqPageUrl(String faqPageUrl) {
		this.faqPageUrl = faqPageUrl;
	}

	public String getFaqStatus() {
		return this.faqStatus;
	}

	public void setFaqStatus(String faqStatus) {
		this.faqStatus = faqStatus;
	}

	public String getFaqTitle() {
		return this.faqTitle;
	}

	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}

}