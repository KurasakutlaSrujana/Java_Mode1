package com.pangram;

public class UserMainCode {
	public int isPangram(String data) {
		int temporary = 1;
		boolean[] alphabets = new boolean[26];
		int flag=0;
		for(int iterator = 0; iterator <data.length();iterator++) {
			if(data.charAt(iterator) >='A' && data.charAt(iterator)<='Z') {
				flag = data.charAt(iterator) - 'A';
			}
			else if(data.charAt(iterator) >='a' && data.charAt(iterator)<='z') {
				flag = data.charAt(iterator) - 'a';
			}
			alphabets[flag] = true;
		}
		for(int iterator = 0; iterator<alphabets.length;iterator++) {
			if(alphabets[iterator]==false) {
				temporary = 0;
			}
		}
		return temporary;
	}
}
