package assignment4_ifStatements_SwitchStatements;

public class q8_discountPurchase {

	public static void main(String[] args) {
		
		int purchaseAmount=99;
		double retails=99, totalAmount, discountRatio=0; 
		double discountAmount=discountRatio*purchaseAmount*retails;
		
		totalAmount=(purchaseAmount*retails)-discountAmount;
						
		if(purchaseAmount<=0) {
			System.out.println("Enter a valid value please");
		}else if(purchaseAmount<10) {
			discountRatio=0;
			discountAmount=discountRatio*purchaseAmount*retails;
			System.out.println("Your discount is: $" + discountAmount);
			System.out.println("Total amount after discount is: $" + (totalAmount-discountAmount));
		}else if(purchaseAmount<20) {
			discountRatio=0.20;
			discountAmount=discountRatio*purchaseAmount*retails;
			System.out.println("Your discount is: $" + discountAmount);
			System.out.println("Total amount after discount is: $" + (totalAmount-discountAmount));
		}else if(purchaseAmount<50) {
			discountRatio=0.30;
			discountAmount=discountRatio*purchaseAmount*retails;
			System.out.println("Your discount is: $" + discountAmount);
			System.out.println("Total amount after discount is: $" + (totalAmount-discountAmount));
		}else if(purchaseAmount<100) {
				discountRatio=0.40;
				discountAmount=discountRatio*purchaseAmount*retails;
				System.out.println("Your discount is: $" + discountAmount);
				System.out.println("Total amount after discount is: $" + (totalAmount-discountAmount));
		}else if(purchaseAmount>=100) {
			discountRatio=0.50;
			discountAmount=discountRatio*purchaseAmount*retails;
			System.out.println("Your discount is: $" + discountAmount);
			System.out.println("Total amount after discount is: $" + (totalAmount-discountAmount));
	}

}
}