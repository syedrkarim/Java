package array;

public class ThreeDimArray {

	public static void main(String[] args) {
		int[][][] myArray = new int[2][3][4];

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				for (int k = 0; k < myArray[i][j].length; k++) {
					myArray[i][j][k] = (int) (Math.random() * 100);
					System.out.print(myArray[i][j][k] + " ");

				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
