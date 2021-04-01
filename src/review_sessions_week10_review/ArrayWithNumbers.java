package review_sessions_week10_review;

public class ArrayWithNumbers {

	public static void main(String[] args) {
		
		 //1. declare numsArray with 5 numbers
        //assign values to each index
		
        int[] numsArray = new int[5];
        numsArray[0] = 123;
        numsArray[1] = 345;
        numsArray[2] = 33;
        numsArray[3] = 10;
        numsArray[4] = numsArray[0] + numsArray[1];//468

        //2. declare and assign values in same statement
                         // 0  1   2   3   4   5
        int[] numsArray2 = {44, 12, 44, 66, 55, 88};

        //3. declare and assign values in same statement using new keyword
        int[] numsArray3 = new int[]{33, 55, 6, 1, 42, 54, 900, 324};


        //declare 3 int variables and assign values
        int n1 = 23;
        int n2 = 45;
        int n3 = 10;

        int[] numsArray4 = {n1 , n2, n3, 88};

        //print size of each array
        //numsArray = 5
        System.out.println("numsArray  = " + numsArray.length);
        System.out.println("numsArray2 = " + numsArray2.length);
        System.out.println("numsArray3 = " + numsArray3.length);
        System.out.println("numsArray4 = " + numsArray4.length);

        //read from array
        System.out.println(numsArray[0]);//123
        int j = 0;
        System.out.println(numsArray[j]);//123
        //print last one using length - 1
        int l1 = numsArray.length-1;
        System.out.println(numsArray[l1]);//index 4

        System.out.println( numsArray[ numsArray.length -1 ]);

        //print all numbers using a for loop
        for(int i = 0; i < numsArray.length; i++){
            System.out.print( numsArray[i] + ", " );
        }

        System.out.println();

        //print the number if it is more than 100
        for(int n = 0; n < numsArray.length; n++){
            if(numsArray[n] > 100){
                System.out.print(numsArray[n] + " | ");
            }
        }
        System.out.println();
        //print array items in reverse in same line
        for(int i = numsArray.length-1; i >= 0; i--){
            System.out.print(numsArray[i] +", ");
        }


	}

}
