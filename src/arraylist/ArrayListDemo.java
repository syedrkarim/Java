package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); // We can store any type of elements

		// ArrayList <String> list=new ArrayList <String>(); //We can store String type elements.
		// ArrayList <Integer> list=new ArrayList <Integer>(); //We can store Integer type elements.

		// Adding value to ArratList
		list.add("John");
		list.add("James");
		list.add("Paul");
		list.add("Tom");
		list.add(2);
		list.add('A');

		// Size of ArraList
		System.out.println(list.size());
		System.out.println(list);

		// Remove from ArrayList
		list.remove(2);
		System.out.println(list.size());
		System.out.println(list);

		// Insert a new element in middle of ArrayList
		list.add(1, "Peter");
		System.out.println(list.size());
		System.out.println(list);

		// Read value from ArrayList
		 /*for(String s:list) { 
		 System.out.println(s);
		}*/

		for (Object s : list) { // Object type of variable can hold any type of data.
			System.out.println(s);
		}

	}

}
