package array;

import java.util.Arrays;

public class MergingTwoArrays {

	public static void main(String[] args) {
		
		String[] a= {"a","e","i"};
		String[] b= {"o","u","a"};
		String [] c= new String[a.length+b.length];
		
		int pos=0;
		for(String x:a) {
			c[pos]=x;
			pos++;
		}
		for(String y:b) {
			c[pos]=y;
			pos++;
		}
		
		/*for(String z:c) {
			System.out.println(z);
		}*/
		
		System.out.println(Arrays.toString(c));

	}

}
