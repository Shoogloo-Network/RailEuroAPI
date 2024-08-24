package com.controller.helper;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;

public class EnumType {
	String[] Vehicle = { "High-Speed", "Inter-City", "Branch-Line/Regional", "Night-Train" };
	String[] ticketingOptions = { "PAH", "TOD", "ETK", "TICKETLESS", "MPASS" };

	String [] comfordCode= {"STANDARD"
			, "COMFORT"
			, "PREMIER"};
	String []flexibility= {"NON_FLEX"
			, "SEMI_FLEX"
			, "FULL_FLEX"};
String []defaultTravelerInformationRequired= {"TITLE"
		,"FIRST_NAME"
		, "LAST_NAME"
		, "DATE_OF_BIRTH"
		, "COUNTRY_OF_RESIDENCE"
		, "EMAIL"
		, "PHONE_NUMBER"
		, "PLACE_OF_BIRTH"
		, "PASSPORT"};
String []leadTravelerInformationRequired= {"TITLE"
		, "FIRST_NAME"
		, "LAST_NAME"
		, "DATE_OF_BIRTH"
		, "COUNTRY_OF_RESIDENCE"
		, "EMAIL"
		, "PHONE_NUMBER"
		, "PLACE_OF_BIRTH"
		, "PASSPORT"};
String []TravelerInformation= {"TITLE"
		,"FIRST_NAME"
		, "LAST_NAME"
		, "DATE_OF_BIRTH"
		, "COUNTRY_OF_RESIDENCE"
		, "EMAIL"
		, "PHONE_NUMBER"
		, "PLACE_OF_BIRTH"
		, "PASSPORT"};

String []TravelerInformationOffer= {"TITLE"
		, "FIRST_NAME"
		, "LAST_NAME"
		, "DATE_OF_BIRTH"
		, "COUNTRY_OF_RESIDENCE"
		, "EMAIL"
		, "PHONE_NUMBER"};

String[] TravelerType= {"ADULT", "SENIOR", "YOUTH","CHILD"};

String [] PassCondition= {"CARD_INTRODUCTION"
		, "CARD_LABEL"
		, "GLOBAL_INTRODUCTION"
		, "GLOBAL_INTRODUCTION_DETAILS"
		, "GLOBAL_DESCRIPTION"
		, "BONUSES"
		, "INCLUDES"
		, "PASS_SALES"
		, "PASS_RANGE_SALES"
		, "SUPPLIER_SALES"
		, "RAILEUROPE_SALES"
		, "CARD_SALES"
		, "PAXTYPE_SALES"
		, "PASS_RANGE_AFTER_SALES"
		, "SUPPLIER_AFTER_SALES"
		, "RAILEUROPE_AFTER_SALES"
		, "TICKETING_METHOD"};
String []PassComfort= {"STANDARD"
		, "COMFORT"};
String[] PassConditionType= {"CARD_INTRODUCTION"
		, "CARD_LABEL"
		, "GLOBAL_INTRODUCTION"
		, "GLOBAL_INTRODUCTION_DETAILS"
		, "GLOBAL_DESCRIPTION"
		, "BONUSES"
		, "INCLUDES"
		, "PASS_SALES"
		, "PASS_RANGE_SALES"
		, "SUPPLIER_SALES"
		, "RAILEUROPE_SALES"
		, "CARD_SALES"
		, "PAXTYPE_SALES"
		, "PASS_RANGE_AFTER_SALES"
		, "SUPPLIER_AFTER_SALES"
		, "RAILEUROPE_AFTER_SALES"
		, "TICKETING_METHOD"};

String[]bookingItemStatus= {"CREATED", "PREBOOKING_IN_PROGRESS", "PREBOOKED",
		"CONFIRMATION_IN_PROGRESS", "CONFIRMED", "CONFIRMATION_ERROR", "EXPIRED", "DELETED",
		"ROLLBACKED", "PARTIALLY_ROLLBACKED", "CANCELLATION_IN_PROGRESS", "PARTIALLY_CANCELED", "CANCELED", "CANCEL_FORCED", "EXCHANGE_IN_PROGRESS", "EXCHANGED"};
String[]AfterSalesOperationStatus= {"QUOTED", "CONFIRMED"  ,"ERROR"};
String[]AfterSalesOperationType= {"REFUND", "EXCHANGE", "TRAVELERS_EDITION"};
String []ResourceError= {"technical"
		, "functional"};
String []bookingStatus= {"CREATED", "PREBOOKING_IN_PROGRESS", "PREBOOKED", "AUTHORIZATION_IN_PROGRESS", "AUTHORIZED", "CONFIRMATION_IN_PROGRESS",
		"CONFIRMED", "CAPTURE_IN_PROGRESS", "INVOICED", "ROLLBACKED", "PARTIALLY_ROLLBACKED", "ROLLBACK_ERROR", "CANCELLATION_IN_PROGRESS", "CANCELED",
		"REFUND_IN_PROGRESS", "MODIFIED", "REFUNDED", "EXCHANGE_IN_PROGRESS", "EXCHANGE_AUTHORIZATION_IN_PROGRESS", "EXCHANGE_CONFIRMATION_IN_PROGRESS",
		"EXCHANGE_AUTHORIZED", "EXCHANGE_CAPTURE_IN_PROGRESS", "EXCHANGE_CREDIT_IN_PROGRESS", "EXCHANGE_CONFIRMED", "EXCHANGE_ERROR,EXPIRED","REFUND_ERROR"};
String []overviewStatus={"BOOKING_SETUP", "ON_HOLD", "PAYMENT_IN_PROGRESS", "INVOICED", "MODIFICATION_IN_PROGRESS", "MODIFIED", "ABORTED","ERRONEOUS"};
String [] BookingStatusChange= {"CREATED", "PREBOOKING_IN_PROGRESS", "PREBOOKED", "AUTHORIZATION_IN_PROGRESS", "AUTHORIZED", "CONFIRMATION_IN_PROGRESS", "CONFIRMED",
		"CAPTURE_IN_PROGRESS", "INVOICED", "ROLLBACKED", "PARTIALLY_ROLLBACKED", "ROLLBACK_ERROR", "CANCELLATION_IN_PROGRESS", "CANCELED", "REFUND_IN_PROGRESS",
		"MODIFIED", "REFUNDED", "EXCHANGE_IN_PROGRESS", "EXCHANGE_AUTHORIZATION_IN_PROGRESS", "EXCHANGE_CONFIRMATION_IN_PROGRESS", "EXCHANGE_AUTHORIZED", 
		"EXCHANGE_CAPTURE_IN_PROGRESS", "EXCHANGE_CREDIT_IN_PROGRESS", "EXCHANGE_CONFIRMED", "EXCHANGE_ERROR","EXPIRED","REFUND_ERROR"};
String[] ContactTitle= {"MR","MS"};
String[] emailType= {"CHECKOUT", "REFUND", "HOLD_START", "HOLD_NOTIFICATION", "HOLD_EXPIRED" ,"EXCHANGE"};
String[]orderStatus= {" BOOKED", "CONFIRMED", "TICKETED", "ABANDONED", "RELEASED", "CANCELED", "RETURNED", "WITHDRAWN", "INVALID", "REPLACED", "EXPIRED",
		"PARTIALLY_CANCELED","UNDEFINED"};
String[]paymentStatus= {"AUTHORIZATION_IN_PROGRESS", "NOT_AUTHORIZED", "AUTHORIZED", "AUTHORIZATION_REVERSED", "SETTLED", "VOIDED", "CREDITED", "AUTHORIZATION_CANCELLED  and ROLLBACKED", "EXPIRED"};
String[]TransactionType= {"AUTHORIZATION", "AUTHORIZATION_REVERSAL", "CAPTURE", "CREDIT", "VOID","ROLLBACK"};
String[] CreateRefundType= {"REFUND"};
String[]EmailStatus= {"CREATED", "VALIDATED", "SENT" , "RESEND_VALIDATED"};
String[]EmailType= {"CHECKOUT", "REFUND", "HOLD_START", "HOLD_NOTIFICATION", "HOLD_EXPIRED", "EXCHANGE"};
String[]TransactionStatus= {"ACCEPT", "PENDING", "DECLINE", "REVIEW", "ERROR", "CANCEL","REJECT"};
String[]SupplierReferenceStatus= {"BOOKED"
		,"CONFIRMED"
		, "TICKETED"
		, "ABANDONED"
		, "RELEASED"
		, "CANCELED"
		, "RETURNED"
		, "WITHDRAWN"
		, "INVALID"
		, "REPLACED"
		, "EXPIRED"
		, "PARTIALLY_CANCELED"
		, "AFTER_SALES_QUOTED"
		, "UNDEFINED"};

String []TravelerDocumentType= {"PASSPORT"
		, "IDENTITY_CARD"
		, "LEGAL_PERMANENT_RESIDENT_CARD"};


String[]meanOfPayment= {"ALLOWANCE"
		, "CREDIT_CARD"
		, "CUSTOMER_CREDIT_CARD"
		, "AGENCY_CREDIT_CARD"};
String[] BillingMeansOfPayment= {"ALLOWANCE"
		,"CREDIT_CARD"
		, "CUSTOMER_CREDIT_CARD"
		, "AGENCY_CREDIT_CARD"};

String[]editableInformation= {"TITLE", "FIRST_NAME", "LAST_NAME", "DATE_OF_BIRTH", "PLACE_OF_BIRTH", "COUNTRY_OF_RESIDENCE", "EMAIL", "PHONE_NUMBER" ,"PASSPORT"};

String []MobileReferenceStatus= {"ACTIVATED", "INACTIVE", "NOT_ACTIVATED", "DEACTIVATED", "REFUNDED", "EXPIRED", "BLOCKED", "DELETED", "UNKNOWN"};
@PostConstruct
	public void init() {
		List<Services> serviceList = new ArrayList<Services>();
		Services servi = new Services("AUDIO", "Onboard Audio at Seat");
		serviceList.add(servi);

		Services servi2 = new Services("BAGGAGE", "Baggage Car");
		serviceList.add(servi2);
		Services servi3 = new Services("BAR", "Bar Car");
		serviceList.add(servi3);
		Services servi4 = new Services("BICYCLE", "Free Bicycle Space");
		serviceList.add(servi4);
		Services servi5 = new Services("BICYCLE_AVAILABLE", "Bicycle Space (Additional Cost)");
		serviceList.add(servi5);
		Services servi6 = new Services("BUFFET", "Buffet Service");
		serviceList.add(servi6);
		Services servi7 = new Services("DINING", "Dining Car");
		serviceList.add(servi7);
		Services servi8 = new Services("HOT_FOOD", "Service of hot food available");
		serviceList.add(servi8);
		Services servi9 = new Services("INTERNET", "WiFi access (Free)");
		serviceList.add(servi9);
		Services servi10 = new Services("INTERNET_AVAILABLE", "(WiFi access (Additional Cost)");
		serviceList.add(servi10);
		Services servi11 = new Services("LOUNGE", "Lounge Car");
		serviceList.add(servi11);
		Services servi12 = new Services("LOUNGE_ACCESS", "(Lounge Access at Station");
		serviceList.add(servi12);
		Services servi13 = new Services("MEAL", "Meal included");
		serviceList.add(servi13);
		Services servi14 = new Services("NETWORK", "WiFi access");
		serviceList.add(servi14);
		Services servi15 = new Services("NEWSPAPER", "Newspapers");
		serviceList.add(servi15);
		Services servi16 = new Services("PARKING", "Parking at Departure Station");
		serviceList.add(servi16);
		Services servi17 = new Services("POWER_SOCKET", "Power Socket at Seat");
		serviceList.add(servi17);
		Services servi18 = new Services("PRIORITY_BOARDING", "Priority Boarding");
		serviceList.add(servi18);
		Services servi19 = new Services("PRIVATE", "Private Car or Cabin");
		serviceList.add(servi19);
		Services servi20 = new Services("QUIET", "Quiet Car or Quiet Zone");
		serviceList.add(servi20);
		Services servi21 = new Services("RESTAURANT", "Restaurant");
		serviceList.add(servi21);
		Services servi22 = new Services("RESTAURANT_1ST", "Restaurant Car available for First Class passengers");
		serviceList.add(servi22);
		Services servi23 = new Services("SNACK", "Snack service");
		serviceList.add(servi23);
		Services servi24 = new Services("TAXI", "On-board booking of taxi");
		serviceList.add(servi24);
		Services servi25 = new Services("TOILET", "Toilet available");
		serviceList.add(servi25);
		Services servi26 = new Services("TROLLEY", "Snack Trolley Service");
		serviceList.add(servi26);
		Services servi27 = new Services("VALET_PARKING", "Valet Parking");
		serviceList.add(servi27);
		Services servi28 = new Services("VIDEO", "Onboard Video Monitors at Seat");
		serviceList.add(servi28);
		Services servi29 = new Services("WHEELCHAIR", "Wheelchair ramp or facilities");
		serviceList.add(servi29);
		Services servi30 = new Services("WHEELCHAIR_RES", "Wheelchair only reservations");
		serviceList.add(servi30);
	}

	class Services {
		public Services(String name, String value) {
			this.name = name;
			this.value = value;
		}

		String name;
		String value;
	}
}
