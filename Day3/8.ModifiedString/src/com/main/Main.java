package com.main;

import java.util.Scanner;

import com.string.UserMainCode;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.next();
		System.out.println(UserMainCode.getString(string));
		scanner.close();
	}

}
