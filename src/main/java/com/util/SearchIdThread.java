package com.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.controller.helper.SearchResultLegOffers;
import com.controller.helper.SearchResults;
import com.controller.helper.booking.Billing;
import com.controller.helper.booking.LegSolution;
import com.controller.helper.booking.LegSolutionHighlight;
import com.controller.helper.booking.PointToPointOffer;
import com.controller.helper.booking.PointToPointOffersLeg;
import com.controller.helper.booking.PointToPointOffersSearchResults;
import com.controller.helper.booking.PointToPointProduct;
import com.controller.helper.booking.Segment;
import com.controller.helper.booking.SegmentConnection;
import com.controller.helper.booking.Service;
import com.controller.helper.pointoffer.custom.SearchRequest;
import com.mongo.repository.SearchResultLegOffersRepository;
import com.mongo.repository.SearchResultsRepository;

public class SearchIdThread extends Thread {

	SearchResultLegOffersRepository searchResultLegOffersRepository = null;

	PointToPointOffersSearchResults result = null;
	
	public SearchIdThread(SearchResultLegOffersRepository searchResultLegOffersRepository,
			PointToPointOffersSearchResults pointToPointOffersSearchResults) {
		
		this.searchResultLegOffersRepository = searchResultLegOffersRepository;
		this.result = pointToPointOffersSearchResults;
		
	}

	public void run() {
		
	
		SearchResultLegOffers resLegOffers = new SearchResultLegOffers();
		Map<String,LegSolution>solutionMap=new HashMap<String,LegSolution>();
		//System.out.println("result="+result);
		for(PointToPointOffersLeg leg:result.getLegs())
		{
			
			try {
				resLegOffers.setQueryDepartTime(DateFormatFunction.getDate(leg.getDeparture()));
			} catch (ParseException e) {
			
				e.printStackTrace();
			}
			
			resLegOffers.setQueryDestination(leg.getDestination().getLabel());
			resLegOffers.setQueryDestinationType(leg.getDestination().getType());
			resLegOffers.setQueryOrigin(leg.getOrigin().getLabel());
			resLegOffers.setQueryOriginType(leg.getOrigin().getType());
			
			resLegOffers.setDirectOnly(leg.getDirectOnly());
			if(leg!=null &&leg.getSolutions()!=null)
			for(LegSolution solution:leg.getSolutions())
			{
				solutionMap.put(solution.getId(), solution);
			}
		}
		
		Map<String,PointToPointProduct>productMap=new HashMap<String,PointToPointProduct>();
		if(result.getProducts()!=null)
		for(PointToPointProduct product:result.getProducts())
		{
		/*	resLegOffers.setProductCabinClassCode( product.getCabinClass().getCode());
			resLegOffers.setProductCabinClassLabel( product.getCabinClass().getLabel());
			resLegOffers.setProductCabinClassComfortCategoryCode(product.getCabinClass().getComfortCategory().getCode());
			resLegOffers.setProductCabinClassComfortCategoryLabel(product.getCabinClass().getComfortCategory().getLabel());
			
			resLegOffers.setProductCode(product.getCode());
			resLegOffers.setProductComfortCategoryLabel(product.getComfortCategory().getLabel());
			resLegOffers.setProductComfortCategoryCode(product.getComfortCategory().getCode());
			resLegOffers.setProductFareLabel(product.getFare().getLabel());
			resLegOffers.setProductFareConditions(product.getFare().getConditions());
			resLegOffers.setProductFareFlexibility(product.getFare().getFlexibility().getLabel());
			resLegOffers.setProductFareFlexibilityLevel(product.getFare().getFlexibility().getLevel());
			resLegOffers.setProductLabel(product.getLabel());
			resLegOffers.setProductMarketingCarrier(product.getMarketingCarrier());
			resLegOffers.setProductPaxTypeCode(product.getPaxType().getCode());
			resLegOffers.setProductPaxTypeLabel(product.getPaxType().getLabel());
			resLegOffers.setProductSupplier(product.getSupplier());
			resLegOffers.setProductType(product.getType());
		*/	productMap.put(product.getCode(), product);
			
		}
		if(result.getServices()!=null)
		for(Service service:result.getServices())
		{
		
			resLegOffers.setServiceAdditionalService(service.getAdditionalService());
			resLegOffers.setServiceId(service.getId());
			resLegOffers.setServiceIncluded(service.getIncluded());
			resLegOffers.setServiceLabel(service.getLabel());
			resLegOffers.setServiceMaxAllowedCount(service.getMaxAllowedCount());
			resLegOffers.setServiceProductCode(service.getProductCode());
			resLegOffers.setServiceSegments(service.getSegments());
			
			service.getType();
			Double billingAmount=0d;
		/*	try {
			
			for( Billing billing:service.getUnitPrices().getBillings())
			{
				billingAmount+=billing.getBillingPrice().getAmount().getValue().doubleValue();
			}
			}catch(Exception e) {e.printStackTrace();
			System.out.println("service="+service);
		
			
			}*/
			resLegOffers.setServiceUnitPrices(billingAmount);
		}
		if(result.getHighlights()!=null)
		for(LegSolutionHighlight highlight:result.getHighlights())
		{
			resLegOffers.setHighlights(highlight.getHighlights());
			resLegOffers.setLegSolution(highlight.getLegSolution());
			resLegOffers.setStrategy(highlight.getStrategy());
		}
		List<String>ids=new ArrayList<String>();
		if(result.getOffers()!=null)
		for(PointToPointOffer offer:result.getOffers())
		{
			SearchResultLegOffers resLegOffer = new SearchResultLegOffers();
			resLegOffer.setOfferBillingCurrency( offer.getBillingCurrency());
			resLegOffer.setOfferCategory(offer.getCategory());
			resLegOffer.setOfferComfortCategoryCode(offer.getComfortCategory().getCode());
			resLegOffer.setOfferComfortCategoryLabel(offer.getComfortCategory().getLabel());
			resLegOffer.setOfferFlexibilityCode(offer.getFlexibility().getCode());
			resLegOffer.setOfferFlexibilityLabel(offer.getFlexibility().getLabel());
			resLegOffer.setOfferLegSolution( offer.getLegSolution());
			resLegOffer.setOfferLocation(offer.getLocation());
			Double billing=0d;
			for(Billing am:offer.getPrices().getBillings())
			{
				billing+=	am.getBillingPrice().getAmount().getValue().doubleValue();
			}
			resLegOffer.setOfferBilling(billing);
			resLegOffer.setOfferType(	offer.getType());;
			setSolution(resLegOffer,solutionMap.get(offer.getLegSolution()));
			resLegOffer.setQueryDestination(resLegOffers.getQueryDestination());
			resLegOffer.setQueryDestinationType(resLegOffers.getQueryDestinationType());
			resLegOffer.setQueryOrigin(resLegOffers.getQueryOrigin());
			resLegOffer.setQueryOriginType(resLegOffers.getQueryOriginType());
		List<SearchResultLegOffers> list = searchResultLegOffersRepository.findByQueryOriginAndQueryDestinationAndDepDateStr(
				resLegOffers.getQueryOrigin(), resLegOffers.getQueryDestination(), resLegOffers.getDepDateStr());

		for(SearchResultLegOffers row:list)
		{
			
			ids.add(row.getId());
			
		}
			searchResultLegOffersRepository.save(resLegOffer);
			
		}
		searchResultLegOffersRepository.deleteAllById(ids);
		
		
		
		//*resLegOffers.setMeansOfPayment(getName());
		
		
		
		
		
		
		
		
	}

	private void setSolution(SearchResultLegOffers resLegOffers, LegSolution solution) {
	if(solution!=null) {
		resLegOffers.setSolutionId(solution.getId());
		try {
			resLegOffers.setSolutionArrival(DateFormatFunction.getDate(solution.getArrival()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resLegOffers.setSolutionDeparture(DateFormatFunction.getDate(solution.getDeparture()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dateDep = resLegOffers.getSolutionDeparture();
		String dateStr=dateDep.getYear()+"-"+dateDep.getMonth()+"-"+dateDep.getDate();
		resLegOffers.setDepDateStr(dateStr);
		resLegOffers.setSolutionDestination(solution.getDestination().getLabel());
		resLegOffers.setSolutionDestinationType(solution.getDestination().getType());
		resLegOffers.setSolutionDuration(solution.getDuration());
		resLegOffers.setSolutionOrigin(solution.getOrigin().getLabel());
		resLegOffers.setSolutionOriginType(solution.getOrigin().getType());
		resLegOffers.setSolutionProviderId(solution.getProviderId());
		resLegOffers.setSolutionTravelerInformationRequiredDefault( solution.getTravelerInformationRequired().getDefaultTravelerInformationRequired());
		resLegOffers.setSolutionTravelerInformationRequiredLead(solution.getTravelerInformationRequired().getLeadTravelerInformationRequired());
		resLegOffers.setSegment(solution.getSegments());
	/*	for(Segment segment:solution.getSegments())
		{
			resLegOffers.setSegmentId(segment.getId());
			resLegOffers.setSegmentArrival(segment.getArrival());
			
			resLegOffers.setSegmentDeparture(segment.getDeparture());
			resLegOffers.setSegmentDestination(segment.getDestination().getLabel());
			resLegOffers.setSegmentDestinationType(segment.getDestination().getType());
			resLegOffers.setSegmentDuration(segment.getDuration());
			
			resLegOffers.setSegmentMarketingCarrier(segment.getMarketingCarrier());
			resLegOffers.setSegmentMarketingInformation(segment.getMarketingInformation());
			resLegOffers.setSegmentOperatingCarrier(segment.getOperatingCarrier());
			resLegOffers.setSegmentOrigin(segment.getOrigin().getLabel());
			resLegOffers.setSegmentOriginType(segment.getOrigin().getType());
			resLegOffers.setSegmentSupplier(segment.getSupplier());
			resLegOffers.setSegmentType(segment.getType());
			resLegOffers.setSegmentVehicleCode(segment.getVehicle().getCode());
			resLegOffers.setSegmentVehicleRef(segment.getVehicle().getReference());
			resLegOffers.setSegmentVehicleType(segment.getVehicle().getType());
		
		}*/
	/*	for(SegmentConnection segmentConn:solution.getSegmentConnections())
		{
			resLegOffers.setSegmentConnNextSegmentId(segmentConn.getNextSegmentId());
			resLegOffers.setSegmentConnConnectingTime(segmentConn.getConnectingTime());
			
			
		}*/
		
	}	
	}	
		
	

}
