package com.bridgelabz;

import java.util.Scanner;

public class ArrayAscending {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		Scanner asc = new Scanner(System.in);
		System.out.println("Enter the array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = asc.nextInt();
		}

		int tempo;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					tempo = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tempo;
				}
			}

			System.out.println(arr1[i]);

		}

	}
}
