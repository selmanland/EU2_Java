package Assm13_;

public class q73_CurrencyConvert {

	public static void main(String[] args) {
		
		String[][] money = { {"euro","5.0"} , {"yen","5.0"} };
		String[][] convertionRate = {{"euro","1"} , {"yen","1"} };
		
		System.out.println(convert(money,convertionRate));

	}
	public static double convert(String[][] arr1, String[][] arr2) {
		
		double sum = (Double.parseDouble(arr1[0][1]) * Double.parseDouble(arr2[0][1]) + 
				Double.parseDouble(arr1[1][1]) * Double.parseDouble(arr2[1][1]));		
		
		return sum;
	}

}
