package com.string;

public class UserMainCode {
	public static String reshape(String string, char character) {
		String reverse = "";
		for (int iterator = string.length() - 1; iterator >= 0; iterator--) {
			reverse += string.charAt(iterator);
			if(iterator!=0) {
				reverse += character;
			}	
		}
		return reverse;
	}
}
