package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		int over = 0 ;
		int run = 0;
		float runRate =0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the total runs scored");
			float runs = Float.parseFloat(reader.readLine());
			System.out.println("Enter the total overs faced");
			float overs = Float.parseFloat(reader.readLine());
			if(overs == 0.0) {
			run = (int) runs;	
			over = Math.round(overs);
			runRate = run/over;
			}
			else {
				runRate = runs/overs;
			}
	        System.out.println("Current Run Rate :"+String.format("%.2f", runRate));
		} catch(Exception e) {
			System.out.println(e);
		}

		

	}

}
