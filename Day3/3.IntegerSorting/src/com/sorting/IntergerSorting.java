package com.sorting;

import java.util.Arrays;

public class IntergerSorting {
	public String sortingArray(int[] array) {
		Arrays.sort(array);
		String temporary = Arrays.toString(array);
		return temporary;
	}
}
