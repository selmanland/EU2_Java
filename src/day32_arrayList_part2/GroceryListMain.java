package day32_arrayList_part2;

import java.util.Scanner;

public class GroceryListMain {

	static GroceryList groceryList = new GroceryList();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;

		printInstructions();

		while (!quit) {

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				System.out.println("Printing grocery items");
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit = true;
				break;
			}

		}

	}

	public static void searchItem() {
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		if (groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + " in your grocery list");
		} else {
			System.out.println(searchItem + " is not in your grocery list");
		}

	}

	public static void removeItem() {
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine(); 							// better to add nextLine
		groceryList.removeGroceryItem(itemNo - 1);

	}

	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt(); // *X*X*X*X*X
		scanner.nextLine(); // after using nextInt, if you use String nextLine, HAVE TO PUT This *X*X*X*X
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine(); // *X*X*X*X*X
		groceryList.modifyGroceryItem(itemNo - 1, newItem);

	}

	public static void addItem() {
		System.out.println("Enter your grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());

	}

	public static void printInstructions() {

		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");
	}

}
