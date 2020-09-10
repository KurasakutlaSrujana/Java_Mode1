package com.child;

import com.parent.A;

public class B extends A {
	private int number3;
	private int number4;

	public B(int number1, int number2, int number3, int number4) {
		super(number1, number2);
		this.number3 = number3;
		this.number4 = number4;
	}

	public int sub() {
		return number3 - number4;
	}

	@Override
	public int add() {
		return number3+number4;
	}

}
