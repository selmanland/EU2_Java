package assignment3_arithmeticOperators;

public class assignment3_arithmeticOperators {

	public static void main(String[] args) {
/*
Write a program to convert gallons into Liters and display it.
 */
		// Answer 1
		double gallon, liter;
		
		gallon = 15;
		liter = 3.79 * gallon;
		
		System.out.println(gallon + " gallon is " + liter + " liter");
		
		System.out.println("*************************************************");
		

		// Answer 2
		String name = "Halim";
		int birthYear = 1973;
		int age;
		age = 2021 - birthYear;
		
		System.out.println("Hello " + name + "! Based on your input, your age is " + age + " :)");
		
		System.out.println("*************************************************");

		
/*
Write a Java program that displays the area of a rectangle with a width of 4.5 
and a height of 7.9 using the following formula:

area = width * height
*/
		// Answer 3
		double width, height, area;
		width = 4.5;
		height = 7.9;
		area = width * height;
		
		System.out.println("Area of the rectangle is " + area);
		
		System.out.println("*************************************************");

/*
Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2
 */
		// Answer 4
		int num1, num2, numTemp; // create a temp variable and use it to swap numbers
		num1=10;
		num2=20;		
		
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		
		numTemp = num1;
		num1 = num2;
		num2 = numTemp;
		
		System.out.println("------------");
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		
		System.out.println("*************************************************");
		
		
/*
Write a program that outputs the number of hours, minutes, and seconds that 
corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds 
 */
		// Answer 5
		int inputSeconds, hours, minutes, seconds, remain;
		
		inputSeconds = 13695;
		hours = inputSeconds / (60*60);
		remain = inputSeconds % (hours*60*60);
		minutes = remain / 60;
		remain = remain - (minutes*60);
		seconds = remain;
		
		System.out.println("inputSecond is " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
		System.out.println("*************************************************");
		
		
/*
Scientists estimate that roughly 10 grams of caffeine consumed at one time 
is a lethal overdose.

Write a program with a variable that holds the number of milligrams of 
caffeine in a drink and outputs how many drinks it takes to kill a person.
 */
		// Answer 6
		int lethalOverdose=10000;	// 10 grams => 10000 milligrams
		int mgOfCaffeine;
		int killNumberDrink = 0;
		
		mgOfCaffeine = 952;
		
		do {
			
			killNumberDrink++;
			
		} while(mgOfCaffeine * killNumberDrink < 10000);
		
		
		System.out.println("Number of milligrams in a drink: " + mgOfCaffeine);
		System.out.println("It would take about " + killNumberDrink + " drinks for a lethal overdose");
		
		System.out.println("*************************************************");

		
/*
Write a program that determines the change to be dispensed from a vending machine. 
An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments 
(25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar 
bill to pay for the item.

1 dollar = 4 quarters = 10 dimes = 20 nickels
 */
		// Answer 7
		int itemPrice;
		int changeBackAfterPrice, changeBackAsQ, changeBackAsD, changeBackAsN;
		int quarters, dimes, nickles;
		
		itemPrice = 15;
		changeBackAfterPrice = 100 - itemPrice;

        quarters = changeBackAfterPrice / 25;
        changeBackAsQ = changeBackAfterPrice % 25;

        dimes = changeBackAsQ / 10;
        changeBackAsD = changeBackAsQ % 10;

        nickles = changeBackAsD / 5;
        changeBackAsN = changeBackAsD % 5;
        
        System.out.println("Price in cents : " + itemPrice);
        System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");
		
	}

}
