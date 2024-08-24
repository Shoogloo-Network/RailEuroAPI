package com.controller.helper.booking;

public class ValueDocument {
	String url;
Integer 	size;
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public Integer getSize() {
	return size;
}
public void setSize(Integer size) {
	this.size = size;
}
@Override
public String toString() {
	return "ValueDocument [url=" + url + ", size=" + size + "]";
}

}
