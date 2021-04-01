package review_sessions_Week8_ClassObjects_Scanner;

public class AmazonShop {
	
	public static void main(String[] args) {
	
	// Declare 2 product objects
	
	product prodObj1 = new product();
	product prodObj2 = new product();
	
	// assign values to prodObj1
	
	prodObj1.title="Spoon";
	prodObj1.price=5;
	prodObj1.rating=4;
	prodObj1.seller="SpponSeller";
	
	System.out.println(prodObj1.title);
	

}
}