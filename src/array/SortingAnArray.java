package array;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {

		int a[] = { 12, 5, 56, -2, 32, 2, -26, 9, 43, 94, -78 };

		/*
		 * Arrays.sort(a); System.out.println(Arrays.toString(a));
		 */

		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array elements in descending order:" + Arrays.toString(a));
		System.out.println("Largest number is: " + a[0]);
		System.out.println("Second largest number is: " + a[2 - 1]);

	}

}
