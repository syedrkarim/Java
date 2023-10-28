package com.java.userinput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner test = new Scanner(System.in);
		double fnum, snum, sum;
		System.out.println("Enter a Number");
		fnum=test.nextInt();
		
		/*System.out.println("Enter Second Number");
		snum=test.nextDouble();
		sum=fnum+snum;
		System.out.println("Result is " +sum);*/
		
		if(fnum%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		// Using java stream
		/*List <Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		num.stream().filter(n->n%2==0).forEach(n->System.out.println(n));*/
		
		

	}

}
