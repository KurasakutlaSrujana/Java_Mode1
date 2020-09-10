package com.day1;

public class Swapping {
		public int[] Swap(int number1 , int number2) {
			int[] temporaryArray = new int[2];
			temporaryArray[0]=number1;
			temporaryArray[1]=number2;
			int temporary;
			temporary = temporaryArray[0];
			temporaryArray[0] = temporaryArray[1];
			temporaryArray[1] = temporary;
			
			return temporaryArray;
			//System.out.println(number1 +" "+number2);
			
			
		}
}
