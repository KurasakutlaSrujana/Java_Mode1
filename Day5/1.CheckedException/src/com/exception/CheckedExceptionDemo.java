package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\gowri\\test.txt");
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
			int oneByte;
			while ((oneByte = inputStream.read()) != -1) {
				System.out.print((char)oneByte);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
