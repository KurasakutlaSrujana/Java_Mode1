package com.main;

import java.util.Scanner;

import com.palindrome.Palindrome;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		Palindrome palindrome = new Palindrome();
		int palindromeNumber = palindrome.paindrome(number);
		if (palindromeNumber == 1) {
			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The given number is not palindrome");
		}
		scanner.close();
	}

}
