package com.main;

import java.util.Scanner;

import com.string.UserMainCode;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.next();
		System.out.println("Enter any Character");
		char character = scanner.next().charAt(0);
		System.out.println(UserMainCode.reshape(string, character));
		scanner.close();

	}

}
