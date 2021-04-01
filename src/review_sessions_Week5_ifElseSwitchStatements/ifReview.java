package review_sessions_Week5_ifElseSwitchStatements;

public class ifReview {

	public static void main(String[] args) {
		
		 int typeSelection=2;
	     int drinkSelection=2;
	     String drink="None";
	     double price=0;
	        
	        if(typeSelection==1) {
	            //hot drinks code 
	            if(drinkSelection==1) {
	                drink="Tea";
	                price=2;
	                System.out.println("Your total for "+drink+" is $"+price);              
	            }else if(drinkSelection==2) {
	                drink="Coffee";
	                price=4;
	                System.out.println("Your total for "+drink+" is $"+price);              
	            }else {
	                System.out.println("Invalid hot drink selection");
	            }
	        }else if(typeSelection==2) {
	            //Cold drink code 
	            if(drinkSelection==1) {
	                drink="Icetea";
	                price=3.2;
	                System.out.println("Your total for "+drink+" is $"+price);              
	            }else if(drinkSelection==2) {
	                drink="Lemonade";
	                price=3.5;
	                System.out.println("Your total for "+drink+" is $"+price);              
	            }else {
	                System.out.println("Invalid cold drink selection");
	            }
	            
	        }else {
	            System.out.println("Invalid Drink Selection");
	        }

		}
		
	}


