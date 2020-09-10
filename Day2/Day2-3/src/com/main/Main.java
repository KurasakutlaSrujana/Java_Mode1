package com.main;

import java.util.Scanner;

import com.vowel.Vowel;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter data");
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		Vowel vowel = new Vowel();
		int count = vowel.countVowels(data);
		System.out.println("Number of  Vowels in the string: "+count);
		scanner.close();
		

	}

}
