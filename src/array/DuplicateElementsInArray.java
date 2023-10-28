package array;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 4 };
		int[] b = { 1, 2, 3, 5 };

		// Duplicate in one array
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println(a[j]);
			}
		}

		// Duplicate in two array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					System.out.println(b[j]);
			}
		}

	}

}
