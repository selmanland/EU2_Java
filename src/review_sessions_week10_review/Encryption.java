package review_sessions_week10_review;

public class Encryption {

	public static void main(String[] args) {


		 String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	        String encrypted ="zyxwvutsrqponmlkjihgfedcba ";
			
	        //TASK 2. assign a new word and encrypt each letter using a for loop
	        String word2 = "happy birthday fernando";
	        String encryptedWord = "";

	        for(int i = 0; i < word2.length(); i++){
	            //1. read a letter from word2 - index i
	            char myLetter = word2.charAt(i);
	            //2. Find the index of myLetter in alphabet
	            int index = alphabet.indexOf(myLetter);
	            //3. Read the letter at position index from encrypted. and store into char
	            char enc = encrypted.charAt(index);
	            //4. add enc to encryptedWord variable
	            encryptedWord += enc;
	        }

	        System.out.println("encryptedWord = " + encryptedWord);

	        //TASK 3. declare word3 and assign some encrypted message
	        //Decrypt it!
	        String word3 = "qzez rh ufm";
	        String decryptedWord = "";

	        for (int i = 0; i < word3.length(); i++) {
	            //1.  read a letter from word3 - index i and store into myLetter
	            char myLetter = word3.charAt(i);
	            //2. find the position/index of myLetter in encrypted and save into iidx
	            int iidx = encrypted.indexOf(myLetter);
	            //3.  Read the letter at position iidx from alphabet. and store into char
	            char dec = alphabet.charAt(iidx);
	            //4. add the dec value into
	            decryptedWord += dec;
	        }

	        System.out.println("word3 = " + word3);
	        System.out.println("decryptedWord = " + decryptedWord);

	}

}
