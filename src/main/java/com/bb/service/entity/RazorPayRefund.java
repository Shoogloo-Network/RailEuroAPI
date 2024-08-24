package com.bb.service.entity;

public class RazorPayRefund {
Double amount;
String speed="optimum";
String receipt="";
String note;
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public String getSpeed() {
	return speed;
}
public void setSpeed(String speed) {
	this.speed = speed;
}
public String getReceipt() {
	return receipt;
}
public void setReceipt(String receipt) {
	this.receipt = receipt;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
@Override
public String toString() {
	return "RazorPayRefund [amount=" + amount + ", speed=" + speed + ", receipt=" + receipt + ", note=" + note + "]";
}


}
