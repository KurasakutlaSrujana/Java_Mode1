package com.string;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		System.out.println("Enter a charcter for searching");
		String find = scanner.next();
		StringDemo stringDemo = new StringDemo();
		int count = stringDemo.searchChar(word,find);
		if(count>0) {
			System.out.println("Character found");
			System.out.println("The occurance of "+find +" is : "+count);
		}
		else {
			System.out.println("Character not found");
		}
		
		scanner.close();

	}

}
