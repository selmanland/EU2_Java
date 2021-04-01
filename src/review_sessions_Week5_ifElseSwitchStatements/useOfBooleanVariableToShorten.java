package review_sessions_Week5_ifElseSwitchStatements;

public class useOfBooleanVariableToShorten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int typeSelection=1;
        int drinkSelection=1;
        String drink="None";
        double price=0;
        boolean isSelected=false;
        
        if(typeSelection==1) {
            //hot drinks code 
            if(drinkSelection==1) {
                drink="Tea";
                price=2;
                isSelected=true;
            }else if(drinkSelection==2) {
                drink="Coffee";
                price=4;
                isSelected=true;
            }else {
                System.out.println("Invalid hot drink selection");
            }
        }else if(typeSelection==2) {
            //Cold drink code 
            if(drinkSelection==1) {
                drink="Icetea";
                price=3.2;
                isSelected=true;
            }else if(drinkSelection==2) {
                drink="Lemonade";
                price=3.5;
                isSelected=true;
            }else {
                System.out.println("Invalid cold drink selection");
            }
            
        }else {
            System.out.println("Invalid Drink Selection");
        }
        
        
    //out of the if statement
        if(isSelected) {
            System.out.println("Your total for "+drink+" is $"+price);              
        }else {
            System.out.println("Please try again");
        }

	}

}
