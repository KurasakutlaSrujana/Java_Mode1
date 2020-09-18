package com.main;

import java.util.Scanner;

import com.pangram.UserMainCode;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Data");
		String data = scanner.nextLine();
		UserMainCode object = new UserMainCode();
		int temp = object.isPangram(data);
		if (temp == 1) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not Pangram");
		}
		scanner.close();
	}

}
