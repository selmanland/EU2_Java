package Assm13_;

public class q77_badP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] products = {1,1,1,1,0,0,0,0};
		int limit = 5;
		
		System.out.println(badP(products,limit));
		
	}
	public static boolean badP(int[] arr, int num) {
		int count = 0;
		
		for(int value : arr) {
			if(value == 0) {
				count++;
			}
		}
		if(count<num) {
			return true;
		}else {
			return false;
		}
	}

}
