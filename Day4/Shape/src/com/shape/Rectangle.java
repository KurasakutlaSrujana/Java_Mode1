package com.shape;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	public Rectangle(String name,int lenght,int breadth) {
		super(name);
		this.length = lenght;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public float calculateArea() {
		return length * breadth;
	}
}
