package com.main;

import java.util.Scanner;

import com.sorting.IntergerSorting;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 Integers ");
		int[] integerArray = new int[10];
		for(int iteraor = 0;iteraor<integerArray.length;iteraor++) {
			integerArray[iteraor] = scanner.nextInt();
		}
		IntergerSorting sorting = new IntergerSorting();
		System.out.println("The array after sorting" + sorting.sortingArray(integerArray));
		scanner.close();

	}

}
