package day26_arrays_part3;

public class Arrays2D {

	public static void main(String[] args) {
		
		int [][] scores = new int [3][4];
		
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		
		
		System.out.println(scores[0][0]); //print first row
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		System.out.println(scores[1][0]); //second row
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		System.out.println(scores[2][0]); // third row
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
		System.out.println("--------------------");
		
		scores[0][0]=10;
		scores[0][1]=20;
		scores[0][2]=30;
		scores[0][3]=40;
		
		scores[1][0]=10;
		scores[1][1]=100;
		scores[1][2]=200;
		scores[1][3]=300;
		
		scores[2][0]=10;
		scores[2][1]=10;
		scores[2][2]=10;
		scores[2][3]=10;
		
		System.out.println(scores[0][0]); //print first row
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[0][3]);
		
		System.out.println(scores[1][0]); //second row
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		System.out.println(scores[1][3]);
		
		System.out.println(scores[2][0]); // third row
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		System.out.println(scores[2][3]);
	}

}
