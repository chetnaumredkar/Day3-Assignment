package com.bridgelabz;

import java.util.Scanner;

public class ArraySecondLargest {
	public int second(int[] arr, int size) {
		int tempo;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tempo = arr[i];
					arr[i] = arr[j];
					arr[j] = tempo;
				}
			}

		}
		return arr[size - 2];
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = obj.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array ::");

		for (int i = 0; i < size; i++) {
			arr[i] = obj.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.println((arr[i]));
		}
		ArraySecondLargest obk = new ArraySecondLargest();
		System.out.println("the second largest element in the array is   " + obk.second(arr, size));

	}
}
