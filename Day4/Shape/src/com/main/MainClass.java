package com.main;

import java.util.Scanner;

import com.shape.Circle;
import com.shape.Rectangle;
import com.shape.Shape;
import com.shape.Square;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Circle \nSquare\nRectangle");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the shape name");
		String shapeName = scanner.next();
	    switch (shapeName) {
		case "Circle":
			System.out.println("Enter the radius");
			int radius = scanner.nextInt();
			Circle circle = new Circle(shapeName, radius);
			System.out.println("Area of Circle is :"+String.format("%.2f",circle.calculateArea()));
			break;
		case "Square":
			System.out.println("Enter the side length");
			int side = scanner.nextInt();
			Shape square = new Square(shapeName, side);
			System.out.println("Area of Square is :"+String.format("%.2f",square.calculateArea()));
			break;
		case "Rectangle":
			System.out.println("Enter the length and breadth");
			int length = scanner.nextInt();
			int breadth = scanner.nextInt();
			Rectangle rectangle = new Rectangle(shapeName, length,breadth);
			System.out.println("Area of Rectangle is :"+String.format("%.2f",rectangle.calculateArea()));
			break;
		default:
			System.out.println("Invaild input");
			break;
		}
	    scanner.close();
	}

}
