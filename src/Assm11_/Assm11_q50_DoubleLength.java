package Assm11_;

import java.util.Arrays;

public class Assm11_q50_DoubleLength {

	public static void main(String[] args) {


		int[] arr = {4,5,6};
		
		int[] newArr = new int[arr.length*2];
		
		if(arr.length<2) {
			for(int i=0; i<newArr.length; i++) {
				newArr[i] = 0;
			}
		}else {
			for(int i=0; i<newArr.length-1; i++) {
				newArr[i] = 0;
				
			}
			newArr[newArr.length-1] = arr[arr.length-1];
		}
		
		System.out.println(Arrays.toString(newArr));

	}

}
