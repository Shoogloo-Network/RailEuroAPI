package com.controller.helper.booking;

import java.util.List;

public class Email {
List<Attachment>	attachments;
String			createdDate;
String			customText;
String			emailType;
String			from;
String		id;
String		operationId;
String		sendDate;
String		startExpirationDate;
String		status;
String		subject;
List<String>			to;
public List<Attachment> getAttachments() {
	return attachments;
}
public void setAttachments(List<Attachment> attachments) {
	this.attachments = attachments;
}
public String getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
}
public String getCustomText() {
	return customText;
}
public void setCustomText(String customText) {
	this.customText = customText;
}
public String getEmailType() {
	return emailType;
}
public void setEmailType(String emailType) {
	this.emailType = emailType;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getOperationId() {
	return operationId;
}
public void setOperationId(String operationId) {
	this.operationId = operationId;
}
public String getSendDate() {
	return sendDate;
}
public void setSendDate(String sendDate) {
	this.sendDate = sendDate;
}
public String getStartExpirationDate() {
	return startExpirationDate;
}
public void setStartExpirationDate(String startExpirationDate) {
	this.startExpirationDate = startExpirationDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public List<String> getTo() {
	return to;
}
public void setTo(List<String> to) {
	this.to = to;
}
@Override
public String toString() {
	return "Email [attachments=" + attachments + ", createdDate=" + createdDate + ", customText=" + customText
			+ ", emailType=" + emailType + ", from=" + from + ", id=" + id + ", operationId=" + operationId
			+ ", sendDate=" + sendDate + ", startExpirationDate=" + startExpirationDate + ", status=" + status
			+ ", subject=" + subject + ", to=" + to + "]";
}
			
}
