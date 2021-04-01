package day26_arrays_part3;

import java.util.Arrays;

public class task94_passwordCreation {

	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . please do not share with anyone";
		
		String [] infoArray1 = info1.split("This info is used for creation password : ");
		String [] infoArray2 = info2.split("This info is used for creation password : ");
		
		System.out.println(Arrays.toString(infoArray1));
		System.out.println(Arrays.toString(infoArray2));
		
		String pass1 = infoArray1[1].split(" . please")[0];
		String pass2 = infoArray2[1].split(" . please")[0];
		System.out.println(pass1);
		System.out.println(pass2);
		
		pass1 = pass1.substring(3, 9);
		pass2 = pass2.substring(3, 9);
		
		System.out.println(pass1);
		System.out.println(pass2);
		
		String passLast = pass1.concat(pass2);
		System.out.println(passLast);

	}

}
