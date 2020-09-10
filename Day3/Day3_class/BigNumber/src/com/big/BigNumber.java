package com.big;

import java.util.Scanner;

public class BigNumber {
	
	
    public static void main(String[] args) {
    	
    int number1;
    int number2;
    int number3;
	Process process = new Process();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter three numbers");
	number1 = scanner.nextInt();
	number2 = scanner.nextInt();
	number3 = scanner.nextInt();
	int big = process.bigNumber(number1,number2,number3);
	System.out.println("The biggest number is : " +big );
	scanner.close();
    }
}
