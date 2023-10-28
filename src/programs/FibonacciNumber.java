package programs;

public class FibonacciNumber {

	public static void main(String[] args) {
		int first = 0;
		int sec = 1;
		int fibo;
		System.out.print(first + " " + sec + " ");
		for (int i = 3; i <= 10; i++) {
			fibo = first + sec;
			System.out.print(fibo + " ");
			first = sec;
			sec = fibo;
		}

	}

}
