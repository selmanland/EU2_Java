package Assm11_;

import java.util.Arrays;

public class Assm11_q46_ShortestWordsArray {

	public static void main(String[] args) {
//		Write a program that will find out the shortest words in the given string str. 
//		If there are few words that are evenly short, print them all. Use the split method 
//		in order to split the str string variable and create an array of strings. 
//		Print array with Arrays.toString() method. Sort array before printing.

		String words = "cat,olive,fish,pursuit,old,warning,red";
		String[] str = words.split(",");
		String shortest = str[0];

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < str[0].length()) {
				shortest = str[i];
			}
		}
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() == shortest.length()) {
				count++;
			}
		}
//		System.out.println(count);

		if (count != 1) {
			String[] strNew = new String[count];

			for (int i = 0; i < str.length; i++) {
				if (str[i].length() == shortest.length()) {
					strNew[count - 1] = str[i];
					count--;
				}
			}
			Arrays.sort(strNew);

			System.out.println(Arrays.toString(strNew));

		} else {
			String[] strNew = new String[count];
			strNew[0] = shortest;

			System.out.println(Arrays.toString(strNew));
		}
	}
}
