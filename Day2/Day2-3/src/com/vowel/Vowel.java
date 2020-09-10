package com.vowel;

public class Vowel {
public int countVowels(String data) {
	int count = 0;
	for(int iterator = 0;iterator <data.length();iterator++) {
		if(data.charAt(iterator) == 'a' || data.charAt(iterator) == 'e' ||data.charAt(iterator) == 'i'||data.charAt(iterator) == 'o'||data.charAt(iterator) == 'u'||data.charAt(iterator) == 'A'||data.charAt(iterator) == 'E'||data.charAt(iterator) == 'I'||data.charAt(iterator) == 'O'||data.charAt(iterator) == 'U') {
			count++;
		}
	}
	return count;
}
}
