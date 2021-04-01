package review_sessions_week10_review;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		
		String word = "java";
        char[] letters  = word.toCharArray();
        System.out.println("letters length: " + letters.length);
        for(char l : letters){
            System.out.println(l);
        }
        //sort letters array
        Arrays.sort(letters); //aajv

        //print all in same line separated by comma
        System.out.println(Arrays.toString(letters));
        
        String str = "dfaskjhlkisddddyyyddawwwqq";
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        
        //after sorting , create a new string with that value of array
        String sorted = new String(strArr);
        System.out.println("str = " + str);
        System.out.println("sorted = " + sorted);
        String sorted2 = new String(letters);
        System.out.println(sorted2);

	}

}
