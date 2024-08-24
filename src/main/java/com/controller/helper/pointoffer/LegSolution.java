package com.controller.helper.pointoffer;

import java.util.List;

import com.controller.helper.ResourceError;

public class LegSolution {
	String id;
	List<ResourceError> errors;
	List<ResourceError> warnings;

	Place origin;
	
	Place destination;
/*<date-time>
This time is in local time
*/
	String departure;
	/*<date-time>
	This time is in local time
	*/	
	
	String	arrival;
	

//<ISO-8601>
	String	duration;

	
	List<Segment> segments;
	List<SegmentConnection> segmentConnections;

	TravelerInformationRequired travelerInformationRequired;
	
}
