package com.main;

import java.util.Scanner;

import com.reverse.ReverseNumber;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		ReverseNumber reverseNumber = new ReverseNumber();
		System.out.println("The reverse of a given number is :"+reverseNumber.reverse(number));
		scanner.close();

	}

}
