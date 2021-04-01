package review_sessions_week10_review;

import java.util.Arrays;

public class _2DArray {

	public static void main(String[] args) {


		//declare 2 D String array List
        //String list[][];
        //String[] list[];
		
        String[][] list = new String[4][3];		// declared 4 rows 3 columns array
        
        //add vegetables						//list[0] = new String[]{"Potatoes","Carrots","Onions"};
        list[0][0] = "Potatoes";
        list[0][1] = "Carrots";
        list[0][2] = "Onions";               

        //Add fruits
        list[1][0] = "Apples";
        list[1][1] = "Kiwis";
        list[1][2] = "Figs";

        //Add dairy
        list[2][0] = "Milk";
        list[2][1] = "Eggs";
        list[2][2] = "Cheese";

        //Add bread
        list[3][0] = "Bread";
        list[3][1] = "Bagel";
        list[3][2] = "Muffin";

        /*
          0 -> “Potatoes”,“Carrots”,“Onion”
          1 -> “Apples”,	“Kiwi”,	“Figs”
          2 -> “Milk” ,	“Eggs”,	“Cheese”
          3 -> “Bread”,	“Bagel”, “Muffin”
         */

        System.out.println(list[0][0] +","+list[0][1]+","+list[0][2]);
        System.out.println(list[1][0] +","+list[1][1]+","+list[1][2]);
        System.out.println(list[2][0] +","+list[2][1]+","+list[2][2]);
        System.out.println(list[3][0] +","+list[3][1]+","+list[3][2]);

        System.out.println(Arrays.deepToString(list));

        String fruit = list[1][1];
        System.out.println("My favourite fruit: " + fruit);
        

        //lets find out how many arrays in the 2D array
        
        System.out.println("Number of arrays/rows: " +list.length);
        
        
        
        //how many vegetables
        
        System.out.println("Number of vegetables: " + list[0].length);
        System.out.println("Number of fruits: " + list[1].length);
        System.out.println("Number of dairy: " + list[2].length);
        System.out.println("Number of Bakery: " + list[3].length);
        

        //How to print using a loop
        //Print all vegetables using a loop
                                               			// list[0][0]  list[0][1] list[0][2]
        for(int i = 0; i < list[0].length; i++){ //[Potatoes, Carrots,    Onions]
            System.out.println(list[0][i]);
        }
                              							// list[3][0] list[3][1] list[3][2]
        //Print all Bakery items [Bread, Bagel, Muffin]
        
        for (int i = 0; i < list[3].length; i++ ){
            System.out.println(list[3][i]);
        }

        //print all dairy using for each loop
        
        for(String each : list[2]){ //2	-> “Milk”	“Eggs”	“Cheese”
            System.out.println(each);
        }

        // String[][] list = new String[4][3]; rows - 4. col - 3
        //Print all items using nested for loop
        
        for(int i = 0; i < list.length; i++){ //0 , 1, 2, 3
            System.out.println("Row: " + i);
            for (int j = 0; j < list[i].length; j++){ //0, 1 , 2
                System.out.print(" Col: " + j +"-");
                System.out.print(list[i][j]);
            }
            System.out.println();
        }

	}

}
