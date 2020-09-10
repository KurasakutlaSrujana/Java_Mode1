package co.day4;

public class StringRepeat {
	public String countLetters(String word) {
		char[] wordArray = word.toCharArray();
		String result = " ";
		for(int i = 0;i < wordArray.length;i++) {
			int count = 0;
			String str = " ";
			for(int j = 0;j<wordArray.length;j++) {
				if(wordArray[i]==wordArray[j]) {
					count++;
				}
			}
			str = wordArray[i] +" " +count;
			if(result.contains(str)) {
				continue;
			}
			result = result+ " " +str;
		}
		return result;
	}
	
	
	
	
}
