package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Declaration
		//HashMap hm=new HashMap();
		
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		
		//Adding pair into HashMap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "Smith");
		hm.put(105, "Kim");
		
		System.out.println(hm);
		
		//Remove a pair from HashMap
		hm.remove(103);
		System.out.println("After removing pair"+hm);
		
		//Reading value from HashMap
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		// Using Java 8 for each and Lambda
		hm.forEach((k,v)-> System.out.println("Key = "+k + " Value = "+v));
		

	}

}
