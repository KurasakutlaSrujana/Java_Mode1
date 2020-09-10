package com.main;

import java.util.Scanner;

import com.day1.Swapping;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers for swapping");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println("The numbers before swapping :");
		System.out.println(number1 + " "+number2);
		Swapping swapping = new Swapping();
		System.out.println("The numbers after swapping :");
		int[] result = swapping.Swap(number1, number2);
		System.out.println(result[0] + " "+result[1]);
		scanner.close();
		
		
	}

}
