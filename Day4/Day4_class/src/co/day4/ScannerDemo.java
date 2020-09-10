package co.day4;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		System.out.println("Enter a string :");
		String str = scanner.next();
		
		System.out.println("number is : "+(number+100));
		System.out.println("String is : "+str+" " +"world");
		scanner.close();
	}

}
