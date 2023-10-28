package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList <String> lang = new ArrayList <String>();
		lang.add("java");
		lang.add("C");
		lang.add("JS");
		lang.add("Python");
		lang.add("Ruby");
		System.out.println(lang);
		
		// for loop
		for(int i=0;i<lang.size();i++) {
			System.out.println(lang.get(i));
		}
		System.out.println("-------------------------------");
		
		// for each loop
		for(String s: lang) {
			System.out.println(s);
		}
		
		// java stream
		System.out.println("-------------------------------");
		lang.stream().forEach(ele-> System.out.println(ele));
		
		System.out.println("-------------------------------");
		
		// Iterator
		Iterator <String> it = lang.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
