package com.element;

public class ElementSearch {
	public int searchElement(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return 1;
			} else {
				continue;
			}
		}
		return 0;
	}
}
