package com.bridgelabz;

public class ArrayDuplicate {
	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 4, 2, 3, 5, 5, 7, 8, 9, 4 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {

					System.out.println(arr1[i]);

				}
			}
		}
	}
}