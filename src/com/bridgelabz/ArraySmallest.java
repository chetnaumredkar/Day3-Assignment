package com.bridgelabz;

public class ArraySmallest {
	public static void main(String[] args) {
		int[] arr1 = { 23, 45, 12, 9, 25 };
		int min = arr1[0];
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] <= min) {
				min = arr1[i];
			}
		}
		System.out.println("The smallest element in an array is " + min);

	}
}
