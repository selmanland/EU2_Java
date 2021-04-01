package day20_stringManipulation_part2;

public class String_IndexOf2 {

	public static void main(String[] args) {
		// index of with 2 values
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5); // start look for "-" after 5th index
		System.out.println(secondDash);
		
		int thirdDash = list.indexOf("-",secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);
		System.out.println("------------");
		
		String str = "Cybertek Students";
		int x = str.indexOf("t", 8);		// start look for "t" after 8th index *X*X*X*X*X
		System.out.println(str.substring(3, x));

	}

}
