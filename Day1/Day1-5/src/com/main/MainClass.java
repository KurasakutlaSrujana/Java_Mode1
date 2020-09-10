package com.main;

import java.util.Scanner;

import com.prime.PrimeNumber;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		PrimeNumber prime = new PrimeNumber();
		System.out.println(prime.isPrime(number));
		scanner.close();

	}

}
