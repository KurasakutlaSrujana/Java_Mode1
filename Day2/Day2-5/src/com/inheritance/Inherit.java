package com.inheritance;

import com.child.B;

public class Inherit {

	public static void main(String[] args) {
		B bObj = new B(2,3,4,5);
		System.out.println("Addition : "+bObj.add());
		System.out.println("SUbtraction : "+bObj.sub());

	}

}
