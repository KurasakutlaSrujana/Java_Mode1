package com.main;

import java.util.Scanner;

import com.array.ArrayDemo;

public class Main {

	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 ArrayDemo arrayDemo = new ArrayDemo();
	 System.out.println("enter the size of an array");
	 int arraySize = scanner.nextInt();
	 arrayDemo.setSize(arraySize);
	 System.out.println("Enter " +arraySize +" numbers");
	 int[] temp = new int[arraySize];
	 for(int i=0;i<arraySize;i++) {
		temp[i]= scanner.nextInt();
		 
	 }
	 arrayDemo.setNumbers(temp);
     System.out.println("The numbers in the array are");
     temp = arrayDemo.getNumbers();
     for(int i=0;i<arraySize;i++) {
    	 System.out.println(temp[i]);
     }
     System.out.println("The numbers in the array after sorting");
     temp = arrayDemo.sorting();
     for(int i=0;i<arraySize;i++) {
    	 System.out.println(temp[i]);
     }
     
	}

}
