package com.parent;

public class A {
	protected int number1;
	protected int number2;
	public A(int number1,int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	public int add() {
		return number1+number2;
	}
}
