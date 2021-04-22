package exercises;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Item1: ");
        String item1 = sc.nextLine();   
        System.out.println("Enter Item1 price: ");
        double price1 = sc.nextDouble();
        sc.nextLine(); // above int below "string line", before "string line" must add this line

        System.out.print("Enter Item2: ");
        String item2 = sc.nextLine();
        
        System.out.println("Enter Item2 price: ");
        double price2 = sc.nextDouble();
        sc.nextLine(); // above int below "string line", before "string line" must add this line
        
        System.out.print("Enter Item3: ");
        String item3 = sc.nextLine();
        System.out.println("Enter Item3 price: ");
        double price3 = sc.nextDouble();
        
        double totalPrice = price1 + price2 + price3;

        System.out.println("Item1: " + item1 + " Price: " + price1 + " Item2: " + item2 + " Price: "+
        price2 + " Price: " + " Item3: " + item3 + " Price: "+ price3);
        
		
        
        sc.close();
	}
	

}
