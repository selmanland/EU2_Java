package day31_arrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shopList = new ArrayList<>();
		
		shopList.add("paper towel");
		shopList.add("dish soap");
		shopList.add("trash bag");
		shopList.add("clorox");
		shopList.add("gloves");
		shopList.add("shovel");
		
		int count = shopList.size();
		System.out.println(count);
		
		// print all items in single line
		System.out.println(shopList.toString());
		
		// print first and last item in single line
		System.out.println(shopList.get(0) + " and " + shopList.get(shopList.size()-1));

		shopList.remove("paper towel");
		shopList.remove("shovel");
		System.out.println(shopList.toString());
		
		shopList.remove(0);
		System.out.println(shopList.toString());
		
		// print each item
		for(String item : shopList) {
			System.out.println(item);
			
		// remove all items at once
			shopList.clear();
			System.out.println(shopList.toString());
		}
	}

}
