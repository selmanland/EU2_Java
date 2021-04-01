package review_sessions_week10_review;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		//equals		
				
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};

        System.out.println("nums1 == nums2 > \"using Arrays.methods\" " + Arrays.equals(nums1, nums2) );	
   // true bc checking values inside array
        System.out.println("nums1 == nums2 > \"using equals sign only\" " + (nums1 == nums2) );	
   // false bc checking objects and these two are different objects

        boolean bool1 = Arrays.equals(nums2, nums3);
        System.out.println("nums2 == nums3 > " + bool1);
        
        System.out.println("==========");
        
        // sort method
        
        Arrays.sort(nums2);
        Arrays.sort(nums3);

        System.out.println("After sorting: nums2 == nums3 > " + Arrays.equals(nums2,nums3));
        
        System.out.println("==========");
        
        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};
        
        System.out.println(Arrays.toString(cars1).toUpperCase());
        System.out.println(Arrays.toString(cars4));
        System.out.println(Arrays.toString(cars3));
        System.out.println(Arrays.toString(cars2));
        
        System.out.println("==========");
        
        // copy of method
        String[] newCars = Arrays.copyOf(cars1, 3);		// created new array and take copy with 3 elements only
        System.out.println(Arrays.toString(newCars) + " COPY OF array with 3 elements");
        
        System.out.println("=========="); 
        
        //sort method
        
        int[] nums = {44, 12, 5, 900, 1, -5};	// cannot increase or decrease the size of the array
        // nums[6] = 5;	cannot increase the size from 5 to 6. index no is fixed from 0 to 5 not 6
        
        System.out.println("before sorting");
        System.out.println( Arrays.toString(nums) );

        Arrays.sort(nums); 						// sorting nums array values

        System.out.println("after sorting");
        System.out.println(Arrays.toString(nums));
        System.out.println("---------------------");

        //declare companies array and assign companies
        String[] companies = {"Cybertek", "Capital one", "FreddieMac","apple", "Google", "Verizon"};
        
        //sort companies array
        Arrays.sort(companies);

        System.out.println(Arrays.toString(companies) + " \"this is String right now\""); // String now. Use as a String
        System.out.println(companies[0]);
        
        System.out.println("==========");
	}

}
