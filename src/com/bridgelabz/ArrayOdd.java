package com.bridgelabz;

public class ArrayOdd {
	public static void main(String[] args) {
		int[] num = { 3, 32, 44, 555, 12, 67, 80, 100 };
		int i;

		for (i = 0; i < num.length; i = i + 2)
			System.out.println("The elements in an odd position " + (i + 1) + "is" + num[i]);

	}

}
