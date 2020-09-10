package com.big;

public class Process {
     public int bigNumber(int num1,int num2,int num3) {
    	 if(num1>num2) {
    		 if(num1>num3) {
    			 return num1;
    		 }
    		 else {
    			 return num3;
    		 }
    	 }
    	 else {
    		 if(num2>num3) {
    			 return num2;
    		 }
    		 else {
    			 return num3;
    		 }
    	 }
     }
	
	
}
