package exercises;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
	    
	    int loginAttemps=3;
	    
	    for (int i=0; i<=loginAttemps;i++) {
	    
	        System.out.println("Enter username:");
	        String userName=scan.next();
	        System.out.println("Enter password:");
	        String password=scan.next();
	        
	        if (i==2) {
	            System.out.println("3 attemps failed!");
	            System.out.println("Account locked!");
	            break;
	        }
	        
	        if (userName.equals("Cybertek") && (password.equals("Cybertek123"))) {
	                System.out.println("Login sucessful.");    
	                break;
	                
	        }
	            if (! userName.equals("Cybertek") && ( ! password.equals("Cybertek123"))) {
	                
	                System.out.println("Username or password invalid!");
	                System.out.println("Please re-enter! \n");
	                
	            
	            }else {
	                
	        
	    }
		
	    }

	
    }
    
}

