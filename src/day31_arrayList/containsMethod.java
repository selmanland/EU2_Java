package day31_arrayList;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;
		System.out.println(list2.toString());
		
		// copy all values from list1
		ArrayList<String> months = new ArrayList<String>(list1);	// copied list1 here directly in (list1)
		months.add("June");
		months.add("July");
		months.add("Aug");
		System.out.println(months);
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		System.out.println(months.contains("jan"));
		System.out.println(months.indexOf("Feb") == 1);		// checks index no 	X x X x X x X x
		System.out.println(months.get(1).equals("Feb"));
		
		list1.add("Jan");
		System.out.println("List1 : " + list1);
		System.out.println("months : " + months); 
		
		if(months.containsAll(list1)) {
			System.out.println("months has all list1");
		}else {
			System.out.println("some values are missing");
		}

	}

}
