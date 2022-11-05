package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		int size;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the size of array");
		size = obj.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array ::");

		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();
			// System.out.println(arr[i]);
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}
}
