package com.palindrome;

public class StringPalindrome {
	public String isPalindrome(String string) {
		String reverse = "";
		for (int iterator = string.length()-1; iterator >= 0; iterator--) {
			reverse += string.charAt(iterator);
		}
		if (string.equals(reverse)) {
			return "Yes";
		} else {
			return "No";
		}
	}
}
