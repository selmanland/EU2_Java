package day20_stringManipulation_part2;

public class String_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("position of . is " + i);
		
		System.out.println(url.charAt(i+1));
		
		// find position of '-' and check if space is on right and left side
		String title = "Java - Google Search";
		System.out.println(title.indexOf("-"));
		
		boolean hasSpace = title.contains(" - ");
		System.out.println("proposition if dash has space before and after is \"" + hasSpace + "\"");
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("position of states : " + states);
		
		String word2 = "java, c++, python, tomcat, eclipse"; 	// check if c++ is in word2
		
		boolean cSharp = word2.contains("c++");
		System.out.println(cSharp + " word2");
		System.out.println("position of c++ is " + word2.indexOf("c++"));
		
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is NOT there");
		}
		if(word2.indexOf("c++") > -1) {			     // if there is not, return -1
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is NOT there");
		}
		
	}

}
