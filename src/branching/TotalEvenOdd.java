package branching;

import java.util.ArrayList;
import java.util.List;

public class TotalEvenOdd {

	public static void main(String[] args) {

		int even = 0;
		int odd = 0;
		int number[] = { 10, 14, 11, 17, 16 };
		for (int x : number) {
			if (x % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Total Even: " + even + "  " + "Total Odd: " + odd);
		
		/*List <Integer> evenarr = new ArrayList<>();
		List <Integer> oddarr = new ArrayList<>();
		for(int i=0;i<number.length;i++) {
			if(number[i]%2==0)
				evenarr.add(number[i]);
			else
				oddarr.add(number[i]);
		}
		System.out.println("Even number: "+evenarr);
		System.out.println("Odd number: "+oddarr);*/

	}

}
