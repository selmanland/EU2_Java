package day45_exceptions;

public class CheckedvsUncheckedException {

	public static void main(String[] args) {
		
		
		try {
			Thread.sleep(2000);				// need to import or handle exception
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	

	}

/*
 * rules...
 * 
 * 
 */
	
	
}
