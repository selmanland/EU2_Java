package Assm14_OOP.q14;

public class TJMaxTEST {

	public static void main(String[] args) {

		TJMaxx UKtjmaxx = new TJMaxx(); // Create a new Tjmaxx STORE

		// Create a Regular items
		Item menSuit = new Item("Black Suit", 101, 2, 1000);
		Item womenSuit = new Item("Pink Suit", 102, 3, 2000);
		Item menShirt = new Item("Blue Tank-top Shirt", 103, 2, 100);
		Item womenShirt = new Item("Red Tank-top Shirt", 104, 3, 200);

		OnSaleItem menTrousers = new OnSaleItem("Blue jean trousers", 3, 105, 200, 10);
		OnSaleItem womenTrousers = new OnSaleItem("White jean trousers", 2, 106, 400, 10);
		OnSaleItem socks = new OnSaleItem("Winter Socks", 1, 107, 100, 50);

		// collect all objects(items) in Arrays
		Item[] items = { menSuit, womenSuit, menShirt, womenShirt };
		OnSaleItem[] saleItems = { menTrousers, womenTrousers, socks };

		// assing all items to UK tjmaxx store
		for (Item regular : items) {
			UKtjmaxx.addRegularItem(regular);
		}
		System.out.println("Regular items' name in UK tjmaxx Store: " + UKtjmaxx.getRegularItems());
		/*
		 * UKtjmaxx.addRegularItem(menSuit); UKtjmaxx.addRegularItem(womenSuit);
		 * UKtjmaxx.addRegularItem(menShirt); UKtjmaxx.addRegularItem(womenShirt);
		 * UKtjmaxx.addRegularItem(menTrousers); UKtjmaxx.addRegularItem(womenTrousers);
		 */

		for (OnSaleItem regular : saleItems) {
			UKtjmaxx.addOnSaleItem(regular);
		}

		// Call all items name in UK tjmaxx Store
		System.out.println("All items' name in UK tjmaxx Store: " + UKtjmaxx.getAllItemNames());

		// Call number of regular items and onsale items
		System.out.println("Number of regular items: " + UKtjmaxx.regularItemsCount());
		System.out.println("Number of onsale items : " + UKtjmaxx.onSaleItemsCount());

		// get Item Price according to catalog number:
		System.out.println("Catalog num:101 items Price: " + UKtjmaxx.getItemPrice(101));
		System.out.println("Catalog num:105 items Price: " + UKtjmaxx.getItemPrice(105)); // normal price:200- with
																							// discount:180

		// get on sale itm according to item Name:
		System.out.println("Item Name: Black Suit,  Item: " + UKtjmaxx.getOnSaleItem("Black Suit")); // it will return
																										// Null, because
																										// it is not on
																										// sALE
		System.out
				.println("Item Name: Blue jean trousers,  Item Info: " + UKtjmaxx.getOnSaleItem("Blue jean trousers"));

		// buy any item and update its quantity
		System.out.println("Current men Trousers quantity: " + menTrousers.getQuantity());
		UKtjmaxx.buyItem(105);
		System.out.println("After buy(), Current men Trousers quantity: " + menTrousers.getQuantity());

		// buy after deleted automatically ;
		System.out.println("Current socks quantity: " + socks.getQuantity());
		UKtjmaxx.buyItem(107);
		// System.out.println( "After buy(), Current socks quantity: "
		// +socks.getQuantity());
		// it will give error because this item finished and system remove IT!!

	}

}
