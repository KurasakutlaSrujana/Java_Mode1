package com.main;

import java.util.Scanner;

import com.lower.LowerCase;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word");
		String word = scanner.nextLine();
		LowerCase lowerCase = new LowerCase();
		System.out.println("The word before converting to lowercase :"+word);
		System.out.println("The String after converting to lowercase :"+lowerCase.convertToLowerCase(word));
		scanner.close();
		
	}

}
