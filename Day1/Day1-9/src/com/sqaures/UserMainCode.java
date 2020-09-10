package com.sqaures;

public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int number) {
		int sum = 0;
		int reminder = 0;
		if (number > 0) {
			while (number > 0) {
				reminder = number % 10;
				if (reminder % 2 == 0) {
					sum += (reminder * reminder);
				}
				number = number /10;
			}
			return sum;
		} else {
			return 0;
		}
	}
}
