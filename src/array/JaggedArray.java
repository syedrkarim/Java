package array;

public class JaggedArray {

	public static void main(String[] args) {

		int[][] jaggedArray = {

				{ 1, 4, 7 }, { 5, 4 }, { 2, 5, 8, 7 }, { 7 } };

		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
