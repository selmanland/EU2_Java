package review_sessions_week10_review;

import java.util.Arrays;

public class SentenceSplit {

	public static void main(String[] args) {
		
		 String sentence = "java is fun";
		 							//find out how many words in the sentence and print
		 							//"Number of words: 3"
	        String[] words = sentence.split(" ");
	        System.out.println(Arrays.toString(words));
	        System.out.println("Number of words: " + words.length);

	        						//print everything in same line
	        for(int i = 0; i < words.length; i++){
	            System.out.print(words[i]+" ");
	        }
	        System.out.println();
	        						//print everything in reverse order in same line
	        String reversed = "";
	        for(int i = words.length-1; i >= 0; i--){
	            System.out.print(words[i]+" ");
	            reversed += words[i]+" ";
	        }
	        System.out.println("\nreversed = " + reversed.trim());//remove last space
	        
	        System.out.println("===========");
	        
	        String results = "About 117,000,000 results (1.33 seconds)";
	        String[] googleArr = results.split(" ");

	        System.out.println("googleArr length : " + googleArr.length);

	        //using for each loop print everything in separate lines
	        for(String item : googleArr){
	            System.out.println(item);
	        }

	        System.out.println("Search result count: " + googleArr[1]);

	}

}
