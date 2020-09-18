package com.main;

import java.util.Scanner;

import com.custom.CustomException;

public class MainClass {

	public static void main(String[] args) throws CustomException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the player name");
		String playerName = scanner.next();
		System.out.println("Enter the player age");
		int playerAge = scanner.nextInt();

		try {
			checkAge(playerAge, playerName);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			scanner.close();
		}

	}

	public static void checkAge(int age, String name) throws CustomException {
		if (age >= 19) {
			System.out.println("Player naame : " + name);
			System.out.println("Player age : " + age);
		} else {
			throw new CustomException("InvalidAgeRangeException");
		}
	}
}
