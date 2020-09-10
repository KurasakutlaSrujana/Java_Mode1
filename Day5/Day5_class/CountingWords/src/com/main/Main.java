package com.main;

import java.util.Scanner;

import com.words.CountingWords;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = scanner.nextLine();
		CountingWords counting = new CountingWords();
		System.out.println("Total number of words in the given sentence : " + counting.countWords(sentence));
		scanner.close();

	}

}
