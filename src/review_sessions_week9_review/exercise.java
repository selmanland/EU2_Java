package review_sessions_week9_review;

public class exercise {

	public static void main(String[] args) {

		String email = "employee@yahoo.com";

		if (email.contains("@yahoo")) {
			System.out.println("this is a yahoo account");
		} else if (email.contains("@hotmail")) {
			System.out.println("this is a hotmail account");
		} else if (email.contains("@gmail")) {
			System.out.println("this is a gmail account");
		}

		String tech = "java, c++, phyton, tomcat, aws";

		if (tech.indexOf("c++") > -1) {
			System.out.println(tech.indexOf("c++"));
			System.out.println("index no of c++ is " + tech.indexOf("c++"));

			if (tech.contains("c++")) {
				System.out.println(tech.contains("c++"));
				System.out.println(tech.replaceAll(",", " ; "));
				System.out.println(tech);
			}
		}
	}

}
