package com.controller.helper.pointoffer;

import java.util.List;

public class LegSolutionHighlight {
	String legSolution;
	String strategy;
	List<OffersHighlight> highlights;

	@Override
	public String toString() {
		return "LegSolutionHighlight [legSolution=" + legSolution + ", strategy=" + strategy + ", highlights="
				+ highlights + "]";
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

	public List<OffersHighlight> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<OffersHighlight> highlights) {
		this.highlights = highlights;
	}

}
