package com.words;

public class CountingWords {
	public int countWords(String Sentence) {
		String[] words = Sentence.split(" ");
		return words.length;
	}
}
