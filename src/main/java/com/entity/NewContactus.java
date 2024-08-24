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
 * The persistent class for the new_contactus database table.
 * 
 */
@Entity
@Table(name="new_contactus")
@NamedQuery(name="NewContactus.findAll", query="SELECT n FROM NewContactus n")
public class NewContactus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="contact_id")
	private int contactId;

	@Column(name="contact_creationdate")
	private Timestamp contactCreationdate;

	@Column(name="contact_email")
	private String contactEmail;

	@Column(name="contact_message")
	private String contactMessage;

	@Column(name="contact_name")
	private String contactName;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="contact_subject")
	private String contactSubject;

	public NewContactus() {
	}

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public Timestamp getContactCreationdate() {
		return this.contactCreationdate;
	}

	public void setContactCreationdate(Timestamp contactCreationdate) {
		this.contactCreationdate = contactCreationdate;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactMessage() {
		return this.contactMessage;
	}

	public void setContactMessage(String contactMessage) {
		this.contactMessage = contactMessage;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactSubject() {
		return this.contactSubject;
	}

	public void setContactSubject(String contactSubject) {
		this.contactSubject = contactSubject;
	}

}