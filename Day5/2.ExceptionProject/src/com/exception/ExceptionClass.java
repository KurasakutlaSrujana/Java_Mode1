package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		int number1=0;
		int number2=0;
		int result=0;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			number1 = scanner.nextInt();
			number2 = scanner.nextInt();
			result = number1/number2;
			System.out.println(result);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			scanner.close();
		}
		

	}

}
