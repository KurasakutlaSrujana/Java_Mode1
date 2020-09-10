package com.main;

import java.util.Scanner;

import com.room.Room;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Room No");
		int number = scanner.nextInt();
		System.out.println("Enter Room Type");
		String rType = scanner.next();
		System.out.println("Enter Room Area");
		String area = scanner.next();
		System.out.println("Enter Ac Machine");
		String ac = scanner.next();
	    Room room = new Room();
		room.setData(number, rType, area, ac);
		System.out.println("The Room Details are :");
		System.out.println(room.displayData());
		scanner.close();
		
	}

}
