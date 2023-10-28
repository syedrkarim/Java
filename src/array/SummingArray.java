package array;

public class SummingArray {

	public static void main(String[] args) {

		int number[] = { 10, 45, 14, 78, 85 };
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		System.out.println("Total is: " + sum);

	}
}
