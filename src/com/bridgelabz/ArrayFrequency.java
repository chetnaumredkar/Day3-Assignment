package com.bridgelabz;

public class ArrayFrequency {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 2, 7, 7, 9 };
		// Array fr will store frequencies of element
		int[] fr = new int[a.length];
		int visited = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					// To avoid counting same element again
					fr[j] = visited;
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
		}
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + a[i] + "    |    " + fr[i]);
		}

	}
}
