package array;

import java.util.Arrays;

public class ArrayEqualityCheck {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 40, 30 };
		int arr2[] = { 20, 10, 30, 40 };
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//System.out.println(Arrays.toString(arr1));
		//System.out.println(Arrays.equals(arr1, arr2));
		/*if(Arrays.equals(arr1, arr2))
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
		
		boolean isEqual = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}
		} else
			isEqual = false;

		if (isEqual)
			System.out.println("Arrays are Equal");
		else
			System.out.println("Arrays are not Equal");

	}

}
