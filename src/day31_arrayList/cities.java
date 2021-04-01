package day31_arrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
				
		System.out.println(cities.toString());
		
		// print each city by using for-each loop
		
		for (String city : cities) {
			System.out.print(city + " ");
		}
		System.out.println();
		System.out.println("----------------------------");
		
		// print each city for iterator loop		
		
		for(int i=0; i<cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		System.out.println("----------------------------");
		
		System.out.println("removing Baku");
		cities.remove("Baku");
		cities.remove("New York"); 		// not in the list
		
		System.out.println(cities.toString());
		
		System.out.println("----------------------------");
		
		cities.add(0, "Arlington");
		cities.add(1, "Istanbul");
		
		System.out.println(cities.toString());
		
		System.out.println("----------------------------");
		
		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa"));
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
		System.out.println(cities.toString());	// now empty

	}

}
