package Assm11_;

public class Assm11_q51_SortedIntArrayOrder {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 4, 6 };
		int[] arr2 = { 2, 4 };

		boolean flag = false;

		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == arr2[0] && arr1[i+1] == arr2[1]) {
				flag = true;
				break;
			}else {
				flag = false;
			}
		}
		System.out.println(flag);
	}

}
