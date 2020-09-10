package co.day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scanner.next();
		StringRepeat repeat = new StringRepeat();
		String countLetter = repeat.countLetters(word);
		System.out.println(countLetter);
		scanner.close();
	}

}
