package com.reverse;

public class ReverseNumber {
	public int reverse(int number) {
		int temporary = 0;
		int reminder = 0;
		while (number > 0) {
			reminder = number % 10;
			temporary = temporary * 10 + reminder;
			number = number / 10;
		}
		return temporary;

	}
}
