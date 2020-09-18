package com.main;

import java.util.Scanner;

import com.replace.ReplaceClass;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word");
		String word = scanner.nextLine();
		ReplaceClass replaceClass = new ReplaceClass();
		System.out.println("The word after replacing the occurance : " + replaceClass.replace(word));
		scanner.close();
	}

}
