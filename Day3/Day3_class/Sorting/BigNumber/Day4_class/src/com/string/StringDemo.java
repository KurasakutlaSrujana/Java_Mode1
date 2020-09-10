package com.string;

public class StringDemo {
	public int searchChar(String str,String search) {
	  int counting = 0;
	  for(int i=0;i<str.length();i++) {
		  if(str.charAt(i) == search.charAt(0)) {
			 counting++;
		  }
	  }
	  return counting++;
	}
}
