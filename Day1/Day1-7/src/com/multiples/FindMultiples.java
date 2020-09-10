package com.multiples;

public class FindMultiples {
	public String printMultiples() {
		String buffer = " ";
		for (int iterator = 1; iterator < 100; iterator++) {
			if (iterator % 3 == 0 && iterator % 5 == 0) {
				buffer = buffer + " FizzBuzz";
			} else if (iterator % 3 == 0) {
				buffer = buffer + " Fizz";
			} else if (iterator % 5 == 0) {
				buffer = buffer + " Buzz";
			} else {
				buffer = buffer + " " + iterator;
			}
		}
		buffer = buffer.trim();
		return buffer;
	}
}