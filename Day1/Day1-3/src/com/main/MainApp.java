package com.main;

import java.util.Scanner;

import com.day1.FindingAverage;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three numbers");
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();
		float number3 = scanner.nextFloat();
        FindingAverage average = new FindingAverage();
        float result = average.findAverage(number1, number2, number3);
        System.out.println("The average of the given 3 numbers is : "+result);
        scanner.close();
	}

}
