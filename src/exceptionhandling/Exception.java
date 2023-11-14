package exceptionhandling;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter first number: ");
				int num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.println("Result is: " + result);
				i = i + 1;
				sc.close();
			} catch (ArithmeticException e) {
				System.out.println("Can't devided by zero");
			}
		} while (i == 0);

	}

}
