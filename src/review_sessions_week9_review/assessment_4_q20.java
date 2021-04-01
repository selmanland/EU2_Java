package review_sessions_week9_review;

public class assessment_4_q20 {

	public static void main(String[] args) {
		
		String userName = "Mike";
		String password = "12|3";
		String blank = "><+%&&(()+^++^''^+5&6|gfgtr767%&/";
		
		if(userName == " " && password == " ") {
			System.out.println("User name and password are blank");
		}else if(userName == " " && password != " ") {
			System.out.println("User name cannot be empty");
		}else if (userName != " " && password == " ") {
			System.out.println("password cannot be empty");
		}else {
			for(int i = 0; i < blank.length(); i++) {
				char find = blank.charAt(i);
				
				if(userName.indexOf(find)> -1 || password.indexOf(find) != -1) {
					System.out.println("User name or password is not valid. Please verify");
					break;
				}
			}
		}

	}

}
