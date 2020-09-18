package com.mainapp;

import java.util.Scanner;

import com.substring.SubString;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		System.out.println("Enter the two integers for generating substring");
		int from = scanner.nextInt();
		int to = scanner.nextInt();
		SubString substring = new SubString();
		System.out.println("The substring is : "+substring.subString(string, from, to));
		scanner.close();
		
	}

}
