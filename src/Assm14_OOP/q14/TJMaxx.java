package Assm14_OOP.q14;

import java.util.*;
import java.util.List;

public class TJMaxx {

	private List<Item> regularItems;
	private List<OnSaleItem> onSaleItems;

	public TJMaxx() { // Instantiates regularItems and onSaleItems lists * as new ArrayList
		this.regularItems = new ArrayList<Item>(); // poly way!
		this.onSaleItems = new ArrayList<OnSaleItem>();
	}

	public void addRegularItem(Item item) { // adds an item object to regularItems list * @param item
		regularItems.add(item);

	}

	public void addOnSaleItem(OnSaleItem item) { // adds OnSaleItem object to onSaleItems list * @param item
		onSaleItems.add(item);

	}

	public List<Item> getRegularItems() { // getter for regularItems * @return
		// ???
		return regularItems;
	}

	public List<OnSaleItem> getOnSaleItems() { // getter for onSaleItems * @return
		// ???
		return onSaleItems;
	}

	public int regularItemsCount() {
		/// ???

		return regularItems.size(); // will change...
//		return regularItems.size();
	}

	public int onSaleItemsCount() {
		/// ???

		return onSaleItems.size(); // will change...
//		return onSaleItems.size();
	}

	public List<String> getAllItemNames() { // returns the name of each item in TJ Maxx starting * from regular item
											// then onSaleItems
		List<String> allItem = new ArrayList<String>();	// List<String> allItem = null;

		for (Item regular : regularItems) {
			allItem.add(regular.getName());
		}

		for (OnSaleItem sale : onSaleItems) {
			allItem.add(sale.getName());
		}

		return allItem;
	}

	// gets catalog number and returns price for the item
	// it will search for the item both regularItems and onsaleonSaleItems
	// returns 0.0 if product cannot be found with that catalognumber

	public double getItemPrice(int catalogNumber) {
		
		
		
		for (Item regular : regularItems) {
			if (regular.getCatalogNumber() == catalogNumber) {
				return regular.getPrice();
			}
		}
		for (OnSaleItem sale : onSaleItems) {
			if (sale.getCatalogNumber() == catalogNumber) {
				return sale.getPrice();
			}
		}
		return 0.0;
	}

	// accepts a name then searches among onSaleItems. Once it finds, the method
	// will return that OnSaleItem object

	public OnSaleItem getOnSaleItem(String name) {
		for (OnSaleItem sale : onSaleItems) {
			if (sale.getName().equalsIgnoreCase(name)) {
				return sale;
			}
		}
		return null;

	}

	// removes the item with matching catalogNumber from both regularItems and
	// onSaleItems.
	// Does nothing if not found...

	public void removeItem(int catalogNumber) {

		for (Item regular : regularItems) {
			if (regular.getCatalogNumber() == catalogNumber) {
				regularItems.remove(regular);
				
			}
		}
		for (OnSaleItem sale : onSaleItems) {
			if (sale.getCatalogNumber() == catalogNumber) {
				onSaleItems.remove(sale);
			}
		}

	}

	// it accepts a catalog number and finds that item among regularItems and
	// onSaleItems
	// if it finds the item: decrease the count of the Item by 1,
	// if count reaches 0 after decrementing then remove the product(call removeItem
	// method)

	public void buyItem(int catalogNumber) {

		for (Item regular : regularItems) {
			if (regular.getCatalogNumber() == catalogNumber && regular.getQuantity() > 0) {
				regular.setQuantity(regular.getQuantity() - 1);
			}

			if (regular.getQuantity() == 0) {
				removeItem(catalogNumber);
			}
		}
		for (OnSaleItem sale : onSaleItems) {
			if (sale.getCatalogNumber() == catalogNumber) {
				sale.setQuantity(sale.getQuantity() - 1);
			}

			if (sale.getQuantity() == 0) {
				removeItem(catalogNumber);
			}
		}

	}

}
