package com.word;

public class UserMainCode {
	public static String getLargestWord(String sentence) {
		String[] words = sentence.split(" ");
		String large = words[0];
		for(int i = 1;i< words.length;i++) {
			if(large.length() < words[i].length()) {
				large = words[i];
			}
			else if(large.length() == words[i].length()) {
				continue;
			}
		}
		return large;
	}
}
