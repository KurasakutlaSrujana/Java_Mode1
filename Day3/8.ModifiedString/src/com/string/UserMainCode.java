package com.string;

public class UserMainCode {
	public static String getString(String string) {
		if (string.charAt(0) == 'k' && string.charAt(1) == 'b') {
			return string;
		} else if (string.charAt(0) == 'k') {
			return string.charAt(0) + string.substring(2, string.length());
		} else if (string.charAt(1) == 'b') {
			return string.substring(1, string.length());
		}
		else {
			return string.substring(2, string.length());
		}
	}
}
