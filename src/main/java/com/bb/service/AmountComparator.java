package com.bb.service;

import java.util.Comparator;

import com.controller.helper.booking.Amount;

public class AmountComparator implements Comparator<Amount>{
	int sortBy = 1;

	public AmountComparator(String sortBy) {
		if (sortBy.equals("sortingOrder"))
			this.sortBy = 1;
	}

	@Override
	public int compare(Amount s1, Amount s2) {
		if (sortBy == 1)
			return compareBySortingOrder(s1, s2);
		else
			return 0;
	}

	public int compareBySortingOrder(Amount s1, Amount s2) {

	
		if(s1.getValue().floatValue() > s2.getValue().floatValue())
			return 1;
		return -1;
	}
}
