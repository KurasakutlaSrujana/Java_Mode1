package com.mainclass;

import java.util.Scanner;

import com.element.ElementSearch;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 Integers");
		int[] integerArray = new int[10];
		for (int iterator = 0; iterator < 10; iterator++) {
			integerArray[iterator] = scanner.nextInt();
		}
		System.out.println("Enter the element you want to find");
		int search = scanner.nextInt();
		ElementSearch element = new ElementSearch();
		int result = element.searchElement(integerArray, search);
		if(result == 1) {
			System.out.println(search + " "+ "is found");
		}
		else {
			System.out.println(search + " "+"is not found");
		}
		scanner.close();

	}

}
