package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
		sc.close();

	}

}
