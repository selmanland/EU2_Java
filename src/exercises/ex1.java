package exercises;

public class ex1 {

	public static void main(String[] args) {
		
		int x = 11; 
        x &= 7;
        System.out.println(x);
	}

	/**
	 * 	11 ==> 1011  
	 * 	7  ==> 0111  
	 *  11 & 7 = 0011 
	 *  0011 ==> 1 x 2^0 + 1 x 2^1 + 0 x 2^2 + 0 x 2^3 = 3
	 */
}
