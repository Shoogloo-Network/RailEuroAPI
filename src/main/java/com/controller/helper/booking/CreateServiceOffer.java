package com.controller.helper.booking;

import java.util.List;

public class CreateServiceOffer {
	String serviceId;
	List<String> fareOfferIds;
	Integer count;

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public List<String> getFareOfferIds() {
		return fareOfferIds;
	}

	public void setFareOfferIds(List<String> fareOfferIds) {
		this.fareOfferIds = fareOfferIds;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "CreateServiceOffer [serviceId=" + serviceId + ", fareOfferIds=" + fareOfferIds + ", count=" + count
				+ "]";
	}

}
