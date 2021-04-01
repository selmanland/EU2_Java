package Assm11_;

import java.util.Arrays;

public class Assm11_q49_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3 };

		if (arr.length < 2) {
			System.out.println(Arrays.toString(arr));
		} else {
			
			int[] arrNew = new int[2];
			for (int i = 0; i < arrNew.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println(Arrays.toString(arrNew));
		}		
	}

}
