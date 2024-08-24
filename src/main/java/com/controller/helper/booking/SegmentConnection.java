package com.controller.helper.booking;

public class SegmentConnection {
	SegmentConnectionWarning warning;
	String previousSegmentId;
	String nextSegmentId;
	String connectingTime;
	public SegmentConnectionWarning getWarning() {
		return warning;
	}
	public void setWarning(SegmentConnectionWarning warning) {
		this.warning = warning;
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
	@Override
	public String toString() {
		return "SegmentConnection [previousSegmentId=" + previousSegmentId + ", nextSegmentId=" + nextSegmentId
				+ ", connectingTime=" + connectingTime + "]";
	}
	
}
