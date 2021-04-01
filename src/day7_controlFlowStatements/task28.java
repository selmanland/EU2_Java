package day7_controlFlowStatements;

public class task28 {

	public static void main(String[] args) {
		int selPrice, quantity;
		double discount, revenue, netRevenue;
		selPrice=500;
		quantity=11;
		revenue=selPrice*quantity;
		discount=revenue*0.1;
		netRevenue=(selPrice*quantity)-discount;
		
		System.out.println("Enter product price please:  $" + selPrice);
		System.out.println("Enter the quantity please: " + quantity);
		System.out.println("Revenue is = $" + revenue);
		
		if (revenue>5000) {
		System.out.println("Your discount is = $" + discount);
		System.out.println("Your net revenue is = $" + netRevenue);

	}

}
}