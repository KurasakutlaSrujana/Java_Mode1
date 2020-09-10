package com.main;

import java.util.Scanner;

import com.word.UserMainCode;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any sentence");
		String sentence = scanner.nextLine();
		System.out.println(UserMainCode.getLargestWord(sentence));
		scanner.close();

	}

}
