package com.inheritance;

public class Child extends Parent {
	public void hello() {
		super.hello();
		System.out.println("hello srujana");
	}
	public void world() {
		System.out.println("world");
	}
	public int getA() {
		a = 10;
		return a;
	}
	
}
