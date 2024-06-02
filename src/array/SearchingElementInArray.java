package array;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// Linear Search
		int a[] = { 12, 14, 52, 78, 30, 10 };
		int search_element = 14;
		boolean status = false;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == search_element) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		if (status == false)
			System.out.println("Element not found");

	}

}
