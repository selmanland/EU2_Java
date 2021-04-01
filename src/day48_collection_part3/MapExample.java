package day48_collection_part3;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		List<Integer> items2 = new ArrayList<>();
		items2.add(10);
		
		Map<String, Double> items = new HashMap<>();
		items.put("Apple", 3.49);					//Map has different methods
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.49);
		items.put("Milk", 6.0);
		items.put("Cherries", 5.99);
//		items.put("Apple", 5.99);	change the value of Apple to 5.99...NOT create another Apple...
		
		System.out.println(items.size());
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());			// output: false
		
		System.out.println(items.get("Apple"));			// get item value
		System.out.println(items.get("Milk"));
		
		items.remove("Flowers");						// remove Flowers
		System.out.println(items.containsKey("Apple"));	// output: true
		items.replace("Eggs", 3.5);						// change item value to 3.5
		
		//increase price of cherries by $2
		items.replace("Cherries", items.get("Cherries")+2);
		System.out.println(items.get("Cherries"));
		
		
		

	}

}
