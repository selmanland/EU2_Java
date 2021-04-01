package review_sessions_week10_review;

import java.util.Scanner;

public class ArrayWithScanners {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        int[] scores = new int[5];

	        for (int i = 0; i < 5; i++){
	            System.out.println("Enter team "+(i+1)+" score:");
	            scores[i] = scan.nextInt();
	        }
	        
	        //print all score in one line

	        for (int score : scores){
	            System.out.print(score+" ");
	        }
	        System.out.println();
	        
	        
	        //find the max/largest score
	        
	        int max = 0;

	        for (int i = 0; i < scores.length; i++) {
	            //System.out.println(scores[i]);
	            if(scores[i] > max){
	                max = scores[i];
	            }
	        }

	        System.out.println("max = " + max);

	        //find min score
	        
	        int min = scores[0]; //assume first one is min and assign
	        for (int num : scores){
	            if(num < min){
	                min = num;
	            }
	        }

	        System.out.println("min = " + min);


	}

}
