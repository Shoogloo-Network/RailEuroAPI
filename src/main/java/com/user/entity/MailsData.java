package com.user.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "User")
public class MailsData {
	String htmlContent;
	String from;
	String to; 
	List<MailsDataAttachment> attachmentUrl;
	public String getHtmlContent() {
		return htmlContent;
	}
	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public List<MailsDataAttachment> getAttachmentUrl() {
		return attachmentUrl;
	}
	public void setAttachmentUrl(List<MailsDataAttachment> attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}
	@Override
	public String toString() {
		return "MailsData [htmlContent=" + htmlContent + ", from=" + from + ", to=" + to + ", attachmentUrl="
				+ attachmentUrl + "]";
	}
	
}
