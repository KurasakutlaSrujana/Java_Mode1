package com.odd;

public class UserMainCode {
	public static int checkSum(int number) {
		int sum = 0;
		int reminder;
		if (number > 0) {
			while (number > 0) {
				reminder = number % 10;
				if (reminder % 2 != 0) {
					sum += reminder;
				}
				number = number / 10;
			}
			if (sum % 2 != 0) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}

	}
}
