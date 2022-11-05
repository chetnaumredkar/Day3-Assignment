package com.bridgelabz;

public class ArrayLargest {
	public static void main(String[] args) {
		int[] num = { 3, 32, 44, 555, 12, 67, 80, 100 };
		int i;
		int max = num[0];
		for (i = 1; i <= num.length; i++) {
			if (num[i] >= max) {
				max = num[i];

			}

			System.out.println("The largest element in an array is:" + " " + max);
		}
	}

}
