package programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		int orgNum = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		if (rev == orgNum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not palindrome number");
		sc.close();

	}

}
