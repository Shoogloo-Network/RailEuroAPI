package com.controller.helper.pointoffer;

import java.util.List;

import com.controller.helper.CauseError;
import com.controller.helper.ResourceError;

public class SegmentConnection {
	ResourceError warning;
	CauseError  causes;
	String code;
	List<String> details;
	String label;
	String previousSegmentId;
	String nextSegmentId;
	String connectingTime;
	@Override
	public String toString() {
		return "SegmentConnection [code=" + code + ", details=" + details + ", label=" + label + ", previousSegmentId="
				+ previousSegmentId + ", nextSegmentId=" + nextSegmentId + ", connectingTime=" + connectingTime + "]";
	}
	public ResourceError getWarning() {
		return warning;
	}
	public void setWarning(ResourceError warning) {
		this.warning = warning;
	}
	public CauseError getCauses() {
		return causes;
	}
	public void setCauses(CauseError causes) {
		this.causes = causes;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPreviousSegmentId() {
		return previousSegmentId;
	}
	public void setPreviousSegmentId(String previousSegmentId) {
		this.previousSegmentId = previousSegmentId;
	}
	public String getNextSegmentId() {
		return nextSegmentId;
	}
	public void setNextSegmentId(String nextSegmentId) {
		this.nextSegmentId = nextSegmentId;
	}
	public String getConnectingTime() {
		return connectingTime;
	}
	public void setConnectingTime(String connectingTime) {
		this.connectingTime = connectingTime;
	}
	

}
