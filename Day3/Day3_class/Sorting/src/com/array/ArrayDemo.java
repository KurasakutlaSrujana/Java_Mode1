package com.array;

public class ArrayDemo {

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	private int[] numbers = new int[getSize()];

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	public int[] sorting() {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++)
			{
				if(numbers[j]>numbers[j+1]) {
					int temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
					
				}
			}
		}return numbers;
	}

	
	
	
	
	
	
}
