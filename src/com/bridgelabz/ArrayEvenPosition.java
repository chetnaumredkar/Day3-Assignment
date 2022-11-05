package com.bridgelabz;

import java.util.Arrays;

public class ArrayEvenPosition {
	public static void main(String[] args) {
		int[] num = { 3, 32, 44, 555, 12, 67, 80, 100 };
		int i;

		for (i = 1; i <= num.length; i = i + 2) {
		}
		System.out.println("The elements in an even position of array are:" + Arrays.toString(num));
	}
}