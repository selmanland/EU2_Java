package day31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// Languages create, print size arrayList, 
		
		ArrayList<String> langs = new ArrayList<>();
		
		langs.add("English");
		langs.add("Turkish");
		langs.add("Spanish");
		langs.add("Danish");
		
		System.out.println("Size of the langsArrayList is " + langs.size());		
		System.out.println("if it contains is " + langs.contains("Arabic"));
		
		System.out.println(langs.toString());		
		System.out.println(langs.get(1));
		
		langs.set(3, "Arabic");
		System.out.println(langs.toString());
		
		langs.remove(2);
		langs.add("Polish");
		System.out.println(langs.toString());

	}

}
