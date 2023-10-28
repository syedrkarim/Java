package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "f"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));

		// l1.removeAll(l2);
		// System.out.println(l1);

		// Finding the common elements
		System.out.println(l1.retainAll(l2)); 
		System.out.println(l1);

	}

}
