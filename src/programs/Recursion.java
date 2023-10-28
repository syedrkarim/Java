package programs;

public class Recursion {

	public static long factorial(long n) {
		if (n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Result is : " + factorial(5));
	}

}
