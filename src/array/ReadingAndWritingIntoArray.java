package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingIntoArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		// Object a[]=new Object[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter your value in position " + i + ":");
			a[i] = sc.nextInt();
			// a[i]=sc.next();
		}
		sc.close();
		// Arrays.sort(a);
		System.out.println("Your Array is:" + Arrays.toString(a));

	}

}
