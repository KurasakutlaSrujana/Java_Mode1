package com.main;

import java.util.Scanner;

import com.odd.UserMainCode;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scanner.nextInt();
		int sum = UserMainCode.checkSum(number);
		if (sum == 1) {
			System.out.println("Sum of odd digits is odd.");
		} else if (sum == -1) {
			System.out.println("Sum of odd digits is even.");
		} else {
			System.out.println("Number should be greater than zero!!!");
		}
		scanner.close();
	}

}
