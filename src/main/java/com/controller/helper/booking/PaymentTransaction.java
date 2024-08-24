package com.controller.helper.booking;

public class PaymentTransaction {

Amount amount;
String relatedTransaction;
String transactionDate;
String transactionId;
String transactionStatus;
String transactionType;
String reasonCode;
String message;
String afterSalesOperationId;
public Amount getAmount() {
	return amount;
}
public void setAmount(Amount amount) {
	this.amount = amount;
}
public String getRelatedTransaction() {
	return relatedTransaction;
}
public void setRelatedTransaction(String relatedTransaction) {
	this.relatedTransaction = relatedTransaction;
}
public String getTransactionDate() {
	return transactionDate;
}
public void setTransactionDate(String transactionDate) {
	this.transactionDate = transactionDate;
}
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}
public String getTransactionStatus() {
	return transactionStatus;
}
public void setTransactionStatus(String transactionStatus) {
	this.transactionStatus = transactionStatus;
}
public String getTransactionType() {
	return transactionType;
}
public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}
public String getReasonCode() {
	return reasonCode;
}
public void setReasonCode(String reasonCode) {
	this.reasonCode = reasonCode;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getAfterSalesOperationId() {
	return afterSalesOperationId;
}
public void setAfterSalesOperationId(String afterSalesOperationId) {
	this.afterSalesOperationId = afterSalesOperationId;
}
@Override
public String toString() {
	return "PaymentTransaction [relatedTransaction=" + relatedTransaction + ", transactionDate=" + transactionDate
			+ ", transactionId=" + transactionId + ", transactionStatus=" + transactionStatus + ", transactionType="
			+ transactionType + ", reasonCode=" + reasonCode + ", message=" + message + ", afterSalesOperationId="
			+ afterSalesOperationId + "]";
}

}
