package com.main;

import java.util.Scanner;

import com.sqaures.UserMainCode;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		int result = UserMainCode.sumOfSquaresOfEvenDigits(number);
		if (result > 0) {
			System.out.println(result);
		} else {
			System.out.println("Number should be greater than zero!!!");
		}
		scanner.close();
	}

}
