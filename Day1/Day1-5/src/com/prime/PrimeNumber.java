package com.prime;

public class PrimeNumber {
	public String isPrime(int number) {
		int count = 0;
		if (number > 0) {
			for (int iterator = 1; iterator<=number; iterator++) {
				if (number % iterator == 0) {
					count++;
				}
			}
			if (count == 2) {
				return number + " is a prime number";
			} else {
				return number + " is not a prime number";
			}
		} else {
			return number + " is not a prime number";
		}
	}
}
