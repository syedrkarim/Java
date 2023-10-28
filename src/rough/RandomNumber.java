package rough;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int temp;
		int min;
		ArrayList<Integer> al = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < 500; i++) {
			temp = rand.nextInt(200);
			al.add(temp);
		}

		System.out.println("Contents of al: " + al);
		min = al.get(0);
		for (int j = 0; j < al.size(); j++) {
			if (min > al.get(j)) {
				min = al.get(j);
				
			}

		}
		System.out.println("Minimum Number is: " + min);
	}

}
