package rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		/*List <String> li = new ArrayList<>(Arrays.asList("as","ad","af"));
		System.out.println(li);
		String [] a = new String[li.size()]; 
		//String [] a =li.toArray(new String[0]);
		a =li.toArray(a);
		for(String x: a) {
			System.out.println(x);
		}*/
		
		/*int a=2;
		int b=3;
		int temp=0;
		if(true)
			temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);*/
			
		/*int []x= {5,2,9,8,7,4};
		int max=x[0];
		for(int i=1;i<x.length;i++) {
			if(max<x[i])
				max=x[i];
		}
		System.out.println("Maximum number is: "+max);*/
		
		/*
		private static void revString() {
		String str="This is java";
		char[] strArr=str.toCharArray();
		String rev="";
		for(int i=strArr.length-1;i>=0;i--) {
			rev=rev+strArr[i];
		}
		System.out.println(rev);
		System.out.println(str.replace('s', '$'));
		}

		public static void main(String[] args) {
		revString();
		

		}*/
		for (int i=1; i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for (int i=0; i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		for (int i=0; i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
