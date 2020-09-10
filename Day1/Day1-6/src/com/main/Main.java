package com.main;

import java.util.Scanner;

import com.ascii.AsciiValue;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Character");
		char character = scanner.next().charAt(0);
		AsciiValue asciivalue = new AsciiValue();
		scanner.close();
		System.out.println("The ASCII value of the" + character + "is :"+asciivalue.asciiValue(character));
	}

}
