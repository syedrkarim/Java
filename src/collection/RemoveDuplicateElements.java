package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 3, 3, 8, 7, 5, 4, 1));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(number);
		ArrayList<Integer> numWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numWithoutDuplicate);

		// Using Java Stream
		List<Integer> distinctnumber = number.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctnumber);

	}

}
