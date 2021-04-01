package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {

		// create set collection and add new products

		Set<Product> mySet = new HashSet<>();

		mySet.add(new Product("book", 25.99));
		mySet.add(new Product("book", 17.99));
		mySet.add(new Product("magazine", 7.99));

		System.out.println(mySet.toString());

		// print each product using for-each loop
		for (Product each : mySet) {
			System.out.println(each);
		}
		// print each product price using for-each loop
		for (Product each : mySet) {
			System.out.println(each.getPrice());
		}

		// print each product using forEach loop
		mySet.forEach(each -> System.out.println(each));

	}

}
