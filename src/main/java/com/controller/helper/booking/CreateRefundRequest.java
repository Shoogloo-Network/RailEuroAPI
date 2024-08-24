package com.controller.helper.booking;

import java.util.List;

public class CreateRefundRequest {
	String type;
	List<AfterSalesItem> items;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<AfterSalesItem> getItems() {
		return items;
	}
	public void setItems(List<AfterSalesItem> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "CreateRefundRequest [type=" + type + ", items=" + items + "]";
	}
	
	
}
