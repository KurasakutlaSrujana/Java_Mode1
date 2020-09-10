package com.main;

import java.util.Scanner;

import com.day2.Calculator;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();
		Calculator calculator = new Calculator();
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Reminder");
		System.out.println("Enter your option");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			System.out.println("------Addition--------");
			int result = calculator.sum(number1, number2);
			System.out.println("The sum of given numbers is : " + result);
			break;
		case 2:
			System.out.println("------Subtraction---------");
			result = calculator.difference(number1, number2);
			System.out.println("The difference between given numbers is : " + result);
			break;
		case 3:
			System.out.println("------Multiplication---------");
			result = calculator.multiplication(number1, number2);
			System.out.println("The multiplication of given numbers is : " + result);
			break;
		case 4:
			System.out.println("------Division---------");
			result = calculator.division(number1, number2);
			System.out.println("The division of given numbers is : " + result);
			break;
		case 5:
			System.out.println("------Reminder---------");
			result = calculator.reminder(number1, number2);
			System.out.println("The reminder of given numbers is : " + result);
			break;
		default:
			System.out.println("Enter valid option [1-5] only");

		}
		scanner.close();

	}

}
