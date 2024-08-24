package com.controller.helper.booking;

public class Attachment {
	String name;
	String publicUrl;
	String readOnly;
	String size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublicUrl() {
		return publicUrl;
	}
	public void setPublicUrl(String publicUrl) {
		this.publicUrl = publicUrl;
	}
	public String getReadOnly() {
		return readOnly;
	}
	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Attachment [name=" + name + ", publicUrl=" + publicUrl + ", readOnly=" + readOnly + ", size=" + size
				+ "]";
	}
	
}
