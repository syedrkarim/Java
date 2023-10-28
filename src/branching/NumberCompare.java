package branching;

public class NumberCompare {

	public static void main(String[] args) {

		int a = 94;
		int b = 78;
		int c = 84;

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else
			System.out.println(c);
	}
}
