package com.main;

import java.util.Scanner;

import com.palindrome.StringPalindrome;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String");
		String string = scanner.next();
		StringPalindrome palindrome = new StringPalindrome();
		System.out.println(palindrome.isPalindrome(string));
		scanner.close();

	}

}
