package com.palindrome;

public class Palindrome {
	public int paindrome(int number) {
		int temporary = number;
		int reminder = 0;
		int reverse = 0;
		while (number > 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		if (temporary == reverse) {
			return 1;
		} else {
			return 0;
		}

	}
}
