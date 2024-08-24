package com.controller.helper;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.controller.helper.booking.OffersHighlight;
import com.controller.helper.booking.PointToPointOffersSearchResults;
import com.controller.helper.booking.Segment;
import com.controller.helper.booking.Service;

import jakarta.persistence.Id;

@Document
public class SearchResultLegOffers {
	@Id
	String id;
	Date queryDepartTime;
	String queryOrigin;
	String queryOriginType;
	String queryDestination;
	String queryDestinationType;
String depDateStr;
	Boolean directOnly;

	String solutionId;
	Date solutionArrival;
	Date solutionDeparture;
	String solutionDestination;
	String solutionDestinationType;
	String solutionDuration;
	String solutionOrigin;
	String solutionOriginType;
	String solutionProviderId;
	List<String> solutionTravelerInformationRequiredLead;
	List<String> solutionTravelerInformationRequiredDefault;

	String segmentId;
	String segmentArrival;
	String segmentClass;
	String segmentDeparture;
	String segmentDestination;
	String segmentDestinationType;
	String segmentDuration;

	String segmentMarketingCarrier;
	String segmentMarketingInformation;
	String segmentOperatingCarrier;
	String segmentOrigin;
	String segmentOriginType;
	String segmentSupplier;
	String segmentType;
	String segmentVehicleCode;
	String segmentVehicleRef;
	String segmentVehicleType;
	String segmentConnNextSegmentId;
	String segmentConnConnectingTime;
	String productCabinClassCode;
	String productCabinClassLabel;
	String productCabinClassComfortCategoryCode;
	String productCabinClassComfortCategoryLabel;
	String productCode;

	String productComfortCategoryCode;
	String productComfortCategoryLabel;
	String productFareLabel;
	String productFareFlexibility;
	Integer productFareFlexibilityLevel;
	String productFareConditions;
	String productLabel;
	String productMarketingCarrier;
	String productPaxTypeLabel;
	String productPaxTypeCode;
	String productSupplier;
	String productType;
	Boolean serviceAdditionalService;
	String serviceId;
	Boolean serviceIncluded;
	String serviceLabel;
	Integer serviceMaxAllowedCount;
	String serviceProductCode;
	List<String> serviceSegments;
	String serviceType;
	Double serviceUnitPrices;
	List<OffersHighlight> highlights;
	String legSolution;
	String strategy;

	String offerBillingCurrency;
	String offerCategory;
	String offerComfortCategoryCode;
	String offerComfortCategoryLabel;
	String offerFlexibilityCode;
	String offerFlexibilityLabel;
	String offerLegSolution;
	String offerLocation;
	Double offerBilling = 0d;
	String offerType;
	List<Segment> segment;
	public List<Segment> getSegment() {
		return segment;
	}

	public void setSegment(List<Segment> segment) {
		this.segment = segment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getQueryDepartTime() {
		return queryDepartTime;
	}

	public void setQueryDepartTime(Date queryDepartTime) {
		this.queryDepartTime = queryDepartTime;
	}

	public String getQueryOrigin() {
		return queryOrigin;
	}

	public void setQueryOrigin(String queryOrigin) {
		this.queryOrigin = queryOrigin;
	}

	public String getQueryDestination() {
		return queryDestination;
	}

	public void setQueryDestination(String queryDestination) {
		this.queryDestination = queryDestination;
	}

	public Boolean getDirectOnly() {
		return directOnly;
	}

	public void setDirectOnly(Boolean directOnly) {
		this.directOnly = directOnly;
	}

	public String getSolutionId() {
		return solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public String getSolutionDestination() {
		return solutionDestination;
	}

	public void setSolutionDestination(String solutionDestination) {
		this.solutionDestination = solutionDestination;
	}

	public String getSolutionDuration() {
		return solutionDuration;
	}

	public void setSolutionDuration(String solutionDuration) {
		this.solutionDuration = solutionDuration;
	}

	public String getSolutionOrigin() {
		return solutionOrigin;
	}

	public void setSolutionOrigin(String solutionOrigin) {
		this.solutionOrigin = solutionOrigin;
	}

	public String getSolutionProviderId() {
		return solutionProviderId;
	}

	public List<String> getSolutionTravelerInformationRequiredLead() {
		return solutionTravelerInformationRequiredLead;
	}

	public void setSolutionTravelerInformationRequiredLead(List<String> solutionTravelerInformationRequiredLead) {
		this.solutionTravelerInformationRequiredLead = solutionTravelerInformationRequiredLead;
	}

	public Date getSolutionArrival() {
		return solutionArrival;
	}

	public Date getSolutionDeparture() {
		return solutionDeparture;
	}

	public void setSolutionProviderId(String solutionProviderId) {
		this.solutionProviderId = solutionProviderId;
	}

	public void setSolutionTravelerInformationRequiredDefault(List<String> solutionTravelerInformationRequiredDefault) {
		this.solutionTravelerInformationRequiredDefault = solutionTravelerInformationRequiredDefault;
	}

	public void setSolutionArrival(Date solutionArrival) {
		this.solutionArrival = solutionArrival;
	}

	public void setSolutionDeparture(Date solutionDeparture) {
		this.solutionDeparture = solutionDeparture;
	}

	public String getSegmentId() {
		return segmentId;
	}

	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}

	public String getSegmentArrival() {
		return segmentArrival;
	}

	public void setSegmentArrival(String segmentArrival) {
		this.segmentArrival = segmentArrival;
	}

	public String getSegmentClass() {
		return segmentClass;
	}

	public void setSegmentClass(String segmentClass) {
		this.segmentClass = segmentClass;
	}

	public String getSegmentDeparture() {
		return segmentDeparture;
	}

	public void setSegmentDeparture(String segmentDeparture) {
		this.segmentDeparture = segmentDeparture;
	}

	public String getSegmentDestination() {
		return segmentDestination;
	}

	public void setSegmentDestination(String segmentDestination) {
		this.segmentDestination = segmentDestination;
	}

	public String getSegmentDuration() {
		return segmentDuration;
	}

	public void setSegmentDuration(String segmentDuration) {
		this.segmentDuration = segmentDuration;
	}

	public String getSegmentMarketingCarrier() {
		return segmentMarketingCarrier;
	}

	public void setSegmentMarketingCarrier(String segmentMarketingCarrier) {
		this.segmentMarketingCarrier = segmentMarketingCarrier;
	}

	public String getSegmentMarketingInformation() {
		return segmentMarketingInformation;
	}

	public void setSegmentMarketingInformation(String segmentMarketingInformation) {
		this.segmentMarketingInformation = segmentMarketingInformation;
	}

	public String getSegmentOperatingCarrier() {
		return segmentOperatingCarrier;
	}

	public void setSegmentOperatingCarrier(String segmentOperatingCarrier) {
		this.segmentOperatingCarrier = segmentOperatingCarrier;
	}

	public String getSegmentOrigin() {
		return segmentOrigin;
	}

	public void setSegmentOrigin(String segmentOrigin) {
		this.segmentOrigin = segmentOrigin;
	}

	public String getSegmentSupplier() {
		return segmentSupplier;
	}

	public void setSegmentSupplier(String segmentSupplier) {
		this.segmentSupplier = segmentSupplier;
	}

	public String getSegmentType() {
		return segmentType;
	}

	public void setSegmentType(String segmentType) {
		this.segmentType = segmentType;
	}

	public String getSegmentConnNextSegmentId() {
		return segmentConnNextSegmentId;
	}

	public void setSegmentConnNextSegmentId(String segmentConnNextSegmentId) {
		this.segmentConnNextSegmentId = segmentConnNextSegmentId;
	}

	public String getSegmentConnConnectingTime() {
		return segmentConnConnectingTime;
	}

	public void setSegmentConnConnectingTime(String segmentConnConnectingTime) {
		this.segmentConnConnectingTime = segmentConnConnectingTime;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQueryOriginType() {
		return queryOriginType;
	}

	public void setQueryOriginType(String queryOrigintype) {
		this.queryOriginType = queryOrigintype;
	}

	public String getQueryDestinationType() {
		return queryDestinationType;
	}

	public void setQueryDestinationType(String queryDestinationType) {
		this.queryDestinationType = queryDestinationType;
	}

	public String getSolutionDestinationType() {
		return solutionDestinationType;
	}

	public void setSolutionDestinationType(String solutionDestinationType) {
		this.solutionDestinationType = solutionDestinationType;
	}

	public String getSolutionOriginType() {
		return solutionOriginType;
	}

	public void setSolutionOriginType(String solutionOriginType) {
		this.solutionOriginType = solutionOriginType;
	}

	public String getSegmentDestinationType() {
		return segmentDestinationType;
	}

	public void setSegmentDestinationType(String segmentDestinationType) {
		this.segmentDestinationType = segmentDestinationType;
	}

	public String getSegmentOriginType() {
		return segmentOriginType;
	}

	public void setSegmentOriginType(String segmentOriginType) {
		this.segmentOriginType = segmentOriginType;
	}

	public List<String> getSolutionTravelerInformationRequiredDefault() {
		return solutionTravelerInformationRequiredDefault;
	}

	public String getSegmentVehicleCode() {
		return segmentVehicleCode;
	}

	public void setSegmentVehicleCode(String segmentVehicleCode) {
		this.segmentVehicleCode = segmentVehicleCode;
	}

	public String getSegmentVehicleRef() {
		return segmentVehicleRef;
	}

	public void setSegmentVehicleRef(String segmentVehicleRef) {
		this.segmentVehicleRef = segmentVehicleRef;
	}

	public String getSegmentVehicleType() {
		return segmentVehicleType;
	}

	public void setSegmentVehicleType(String segmentVehicleType) {
		this.segmentVehicleType = segmentVehicleType;
	}

	public String getProductComfortCategoryCode() {
		return productComfortCategoryCode;
	}

	public void setProductComfortCategoryCode(String productComfortCategoryCode) {
		this.productComfortCategoryCode = productComfortCategoryCode;
	}

	public String getProductComfortCategoryLabel() {
		return productComfortCategoryLabel;
	}

	public void setProductComfortCategoryLabel(String productComfortCategoryLabel) {
		this.productComfortCategoryLabel = productComfortCategoryLabel;
	}

	public String getProductFareLabel() {
		return productFareLabel;
	}

	public void setProductFareLabel(String productFareLabel) {
		this.productFareLabel = productFareLabel;
	}

	public String getProductFareFlexibility() {
		return productFareFlexibility;
	}

	public void setProductFareFlexibility(String productFareFlexibility) {
		this.productFareFlexibility = productFareFlexibility;
	}

	public Integer getProductFareFlexibilityLevel() {
		return productFareFlexibilityLevel;
	}

	public void setProductFareFlexibilityLevel(Integer productFareFlexibilityLevel) {
		this.productFareFlexibilityLevel = productFareFlexibilityLevel;
	}

	public String getProductFareConditions() {
		return productFareConditions;
	}

	public void setProductFareConditions(String productFareConditions) {
		this.productFareConditions = productFareConditions;
	}

	public String getProductCabinClassCode() {
		return productCabinClassCode;
	}

	public void setProductCabinClassCode(String productCabinClassCode) {
		this.productCabinClassCode = productCabinClassCode;
	}

	public String getProductCabinClassLabel() {
		return productCabinClassLabel;
	}

	public void setProductCabinClassLabel(String productCabinClassLabel) {
		this.productCabinClassLabel = productCabinClassLabel;
	}

	public String getProductCabinClassComfortCategoryCode() {
		return productCabinClassComfortCategoryCode;
	}

	public void setProductCabinClassComfortCategoryCode(String productCabinClassComfortCategoryCode) {
		this.productCabinClassComfortCategoryCode = productCabinClassComfortCategoryCode;
	}

	public String getProductCabinClassComfortCategoryLabel() {
		return productCabinClassComfortCategoryLabel;
	}

	public void setProductCabinClassComfortCategoryLabel(String productCabinClassComfortCategoryLabel) {
		this.productCabinClassComfortCategoryLabel = productCabinClassComfortCategoryLabel;
	}

	public String getProductLabel() {
		return productLabel;
	}

	public void setProductLabel(String productLabel) {
		this.productLabel = productLabel;
	}

	public String getProductMarketingCarrier() {
		return productMarketingCarrier;
	}

	public void setProductMarketingCarrier(String productMarketingCarrier) {
		this.productMarketingCarrier = productMarketingCarrier;
	}

	public String getProductPaxTypeLabel() {
		return productPaxTypeLabel;
	}

	public void setProductPaxTypeLabel(String productPaxTypeLabel) {
		this.productPaxTypeLabel = productPaxTypeLabel;
	}

	public String getProductPaxTypeCode() {
		return productPaxTypeCode;
	}

	public void setProductPaxTypeCode(String productPaxTypeCode) {
		this.productPaxTypeCode = productPaxTypeCode;
	}

	public String getProductSupplier() {
		return productSupplier;
	}

	public void setProductSupplier(String productSupplier) {
		this.productSupplier = productSupplier;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Boolean getServiceAdditionalService() {
		return serviceAdditionalService;
	}

	public void setServiceAdditionalService(Boolean serviceAdditionalService) {
		this.serviceAdditionalService = serviceAdditionalService;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Boolean getServiceIncluded() {
		return serviceIncluded;
	}

	public void setServiceIncluded(Boolean serviceIncluded) {
		this.serviceIncluded = serviceIncluded;
	}

	public String getServiceLabel() {
		return serviceLabel;
	}

	public void setServiceLabel(String serviceLabel) {
		this.serviceLabel = serviceLabel;
	}

	public Integer getServiceMaxAllowedCount() {
		return serviceMaxAllowedCount;
	}

	public void setServiceMaxAllowedCount(Integer serviceMaxAllowedCount) {
		this.serviceMaxAllowedCount = serviceMaxAllowedCount;
	}

	public String getServiceProductCode() {
		return serviceProductCode;
	}

	public void setServiceProductCode(String serviceProductCode) {
		this.serviceProductCode = serviceProductCode;
	}

	public List<String> getServiceSegments() {
		return serviceSegments;
	}

	public void setServiceSegments(List<String> serviceSegments) {
		this.serviceSegments = serviceSegments;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Double getServiceUnitPrices() {
		return serviceUnitPrices;
	}

	public void setServiceUnitPrices(Double serviceUnitPrices) {
		this.serviceUnitPrices = serviceUnitPrices;
	}

	public List<OffersHighlight> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<OffersHighlight> highlights) {
		this.highlights = highlights;
	}

	public String getLegSolution() {
		return legSolution;
	}

	public void setLegSolution(String legSolution) {
		this.legSolution = legSolution;
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getOfferBillingCurrency() {
		return offerBillingCurrency;
	}

	public void setOfferBillingCurrency(String offerBillingCurrency) {
		this.offerBillingCurrency = offerBillingCurrency;
	}

	public String getOfferCategory() {
		return offerCategory;
	}

	public void setOfferCategory(String offerCategory) {
		this.offerCategory = offerCategory;
	}

	

	public String getOfferComfortCategoryCode() {
		return offerComfortCategoryCode;
	}

	public void setOfferComfortCategoryCode(String offerComfortCategoryCode) {
		this.offerComfortCategoryCode = offerComfortCategoryCode;
	}

	public String getOfferComfortCategoryLabel() {
		return offerComfortCategoryLabel;
	}

	public void setOfferComfortCategoryLabel(String offerComfortCategoryLabel) {
		this.offerComfortCategoryLabel = offerComfortCategoryLabel;
	}

	public String getOfferFlexibilityCode() {
		return offerFlexibilityCode;
	}

	public void setOfferFlexibilityCode(String offerFlexibilityCode) {
		this.offerFlexibilityCode = offerFlexibilityCode;
	}

	public String getOfferFlexibilityLabel() {
		return offerFlexibilityLabel;
	}

	public void setOfferFlexibilityLabel(String offerFlexibilityLabel) {
		this.offerFlexibilityLabel = offerFlexibilityLabel;
	}

	public String getOfferLegSolution() {
		return offerLegSolution;
	}

	public void setOfferLegSolution(String offerLegSolution) {
		this.offerLegSolution = offerLegSolution;
	}

	public String getOfferLocation() {
		return offerLocation;
	}

	public void setOfferLocation(String offerLocation) {
		this.offerLocation = offerLocation;
	}

	public Double getOfferBilling() {
		return offerBilling;
	}

	public void setOfferBilling(Double offerBilling) {
		this.offerBilling = offerBilling;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	@Override
	public String toString() {
		return "SearchResultLegOffers [id=" + id + ", queryDepartTime=" + queryDepartTime + ", queryOrigin="
				+ queryOrigin + ", queryOriginType=" + queryOriginType + ", queryDestination=" + queryDestination
				+ ", queryDestinationType=" + queryDestinationType + ", directOnly=" + directOnly + ", solutionId="
				+ solutionId + ", solutionArrival=" + solutionArrival + ", solutionDeparture=" + solutionDeparture
				+ ", solutionDestination=" + solutionDestination + ", solutionDestinationType="
				+ solutionDestinationType + ", solutionDuration=" + solutionDuration + ", solutionOrigin="
				+ solutionOrigin + ", solutionOriginType=" + solutionOriginType + ", solutionProviderId="
				+ solutionProviderId + ", solutionTravelerInformationRequiredLead="
				+ solutionTravelerInformationRequiredLead + ", solutionTravelerInformationRequiredDefault="
				+ solutionTravelerInformationRequiredDefault + ", segmentId=" + segmentId + ", segmentArrival="
				+ segmentArrival + ", segmentClass=" + segmentClass + ", segmentDeparture=" + segmentDeparture
				+ ", segmentDestination=" + segmentDestination + ", segmentDestinationType=" + segmentDestinationType
				+ ", segmentDuration=" + segmentDuration + ", segmentMarketingCarrier=" + segmentMarketingCarrier
				+ ", segmentMarketingInformation=" + segmentMarketingInformation + ", segmentOperatingCarrier="
				+ segmentOperatingCarrier + ", segmentOrigin=" + segmentOrigin + ", segmentOriginType="
				+ segmentOriginType + ", segmentSupplier=" + segmentSupplier + ", segmentType=" + segmentType
				+ ", segmentVehicleCode=" + segmentVehicleCode + ", segmentVehicleRef=" + segmentVehicleRef
				+ ", segmentVehicleType=" + segmentVehicleType + ", segmentConnNextSegmentId="
				+ segmentConnNextSegmentId + ", segmentConnConnectingTime=" + segmentConnConnectingTime
				+ ", productCabinClassCode=" + productCabinClassCode + ", productCabinClassLabel="
				+ productCabinClassLabel + ", productCabinClassComfortCategoryCode="
				+ productCabinClassComfortCategoryCode + ", productCabinClassComfortCategoryLabel="
				+ productCabinClassComfortCategoryLabel + ", productCode=" + productCode
				+ ", productComfortCategoryCode=" + productComfortCategoryCode + ", productComfortCategoryLabel="
				+ productComfortCategoryLabel + ", productFareLabel=" + productFareLabel + ", productFareFlexibility="
				+ productFareFlexibility + ", productFareFlexibilityLevel=" + productFareFlexibilityLevel
				+ ", productFareConditions=" + productFareConditions + ", productLabel=" + productLabel
				+ ", productMarketingCarrier=" + productMarketingCarrier + ", productPaxTypeLabel="
				+ productPaxTypeLabel + ", productPaxTypeCode=" + productPaxTypeCode + ", productSupplier="
				+ productSupplier + ", productType=" + productType + ", serviceAdditionalService="
				+ serviceAdditionalService + ", serviceId=" + serviceId + ", serviceIncluded=" + serviceIncluded
				+ ", serviceLabel=" + serviceLabel + ", serviceMaxAllowedCount=" + serviceMaxAllowedCount
				+ ", serviceProductCode=" + serviceProductCode + ", serviceSegments=" + serviceSegments
				+ ", serviceType=" + serviceType + ", serviceUnitPrices=" + serviceUnitPrices + ", highlights="
				+ highlights + ", legSolution=" + legSolution + ", strategy=" + strategy + ", offerBillingCurrency="
				+ offerBillingCurrency + ", offerCategory=" + offerCategory + ", offerComfortCategoryCode="
				+ offerComfortCategoryCode + ", offerComfortCategoryLabel=" + offerComfortCategoryLabel
				+ ", offerFlexibilityCode=" + offerFlexibilityCode + ", offerFlexibilityLabel=" + offerFlexibilityLabel
				+ ", offerLegSolution=" + offerLegSolution + ", offerLocation=" + offerLocation + ", offerBilling="
				+ offerBilling + ", offerType=" + offerType + "]";
	}

	public String getDepDateStr() {
		return depDateStr;
	}

	public void setDepDateStr(String depDateStr) {
		this.depDateStr = depDateStr;
	}

	

}
