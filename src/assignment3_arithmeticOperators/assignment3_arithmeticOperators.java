package assignment3_arithmeticOperators;

public class assignment3_arithmeticOperators {

	public static void main(String[] args) {
		
		// Answer 1
		double gallon, liter;
		
		gallon=15;
		liter=3.79*gallon;
		
		System.out.println(gallon + " gallon is " + liter + " liter");
		
		System.out.println("*************************************************");
		

		// Answer 2
		String name="Halim";
		int birthYear = 1973;
		int age;
		age=2020-birthYear;
		
		System.out.println("Hello " + name + "! Based on your input, your age is " + age + " :)");
		
		System.out.println("*************************************************");
		
		// Answer 3
		double width, height, area;
		width=4.5;
		height=7.9;
		area=width*height;
		
		System.out.println("Area of the rectangle is " + area);
		
		System.out.println("*************************************************");
		
		// Answer 4
		int num1, num2, num;
		num1=10;
		num2=20;		
		
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		System.out.println("------------");
		System.out.println("n1=" + num2);
		System.out.println("n2=" + num1);
		
		System.out.println("*************************************************");
		
		// Answer 5
		int inputSeconds, hours, minutes, seconds, remain;
		
		inputSeconds=15895;
		hours=inputSeconds / (60*60);
		remain=inputSeconds % (hours*60*60);
		minutes=remain / 60;
		remain=remain - (minutes*60);
		seconds=remain;
		
		System.out.println("inputSecond is " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
		System.out.println("*************************************************");
		
		// Answer 6
		int lethalOverdose=10000;
		int mgOfCaffeine;
		int killNumberDrink;
		
		mgOfCaffeine=15;
		killNumberDrink=lethalOverdose/mgOfCaffeine;
		
		System.out.println("Number of milligrams in a drink: " + mgOfCaffeine);
		System.out.println("It would take about " + killNumberDrink + " drinks for a lethal overdose");
		
		System.out.println("*************************************************");
		
		// Answer 7
		int itemPrice;
		int changeBack1, changeBack2, changeBack3, changeBack4;
		int quarters, dimes, nickles;
		
		itemPrice=10;
		changeBack1=100-itemPrice;

        quarters = changeBack1/25;
        changeBack2 = changeBack1 %25;

        dimes = changeBack2/10;
        changeBack3 = changeBack2 %10;

        nickles = changeBack3/5;
        changeBack4 = changeBack3 %5;
        
        System.out.println("Price in cents : " + itemPrice);
        System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");
		
	}

}
