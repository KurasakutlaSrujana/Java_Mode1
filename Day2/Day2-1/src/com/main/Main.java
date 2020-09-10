package com.main;

import java.util.Scanner;

import com.small.SmallNumber;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		SmallNumber smallNumber = new SmallNumber();
		System.out.println("The smallest number among these three is : "+smallNumber.findSmall(number1, number2, number3));
		scanner.close();
	}

}
