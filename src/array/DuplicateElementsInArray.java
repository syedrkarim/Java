package array;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		// How many duplicate in one array
		int[] a = { 1, 2, 3, 2, 2, 4 };
		//int[] b = { 1, 2, 3, 5 };
		int element=2;
		int count=0;
		
		for(int x:a) {
			if(x==element) {
				count++;
			}
		}
		if(count==1)
			System.out.println("No duplicate element");
		else
		System.out.println("Total duplication is:"+count);

		// Duplicate in one array
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println(a[j]);
			}
		}*/

		// Duplicate in two array
		/*for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					System.out.println(b[j]);
			}
		}*/

	}

}
