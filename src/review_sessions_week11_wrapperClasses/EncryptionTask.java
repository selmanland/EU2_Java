package review_sessions_week11_wrapperClasses;

public class EncryptionTask {

	public static void main(String[] args) {
		//
		// create a method that accepts a string and return encrypted string
			  
			
				String str = "java";
				System.out.println(encrypted(str));
		}
			
			public static String encrypted(String word) {
				
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				String encrypted ="zyxwvutsrqponmlkjihgfedcba";
				String dummy = "";
				
				for(int i=0;i<word.length();i++) {					
													//1.Read a letter from word
					char myLetter = word.charAt(i);					
											//2.Find the position/index of myLetter in alphabet and save it into idx
					int idx = alphabet.indexOf(myLetter);
					
													//3.Read the letter from encrypted and store into char
					char enc = encrypted.charAt(idx);
					
					dummy = dummy + enc;					
				}				
				return dummy;		
	}

}
