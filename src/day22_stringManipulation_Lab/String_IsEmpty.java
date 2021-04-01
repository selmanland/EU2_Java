package day22_stringManipulation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {
		
		String userName = " ";
		String password = "";
		
		if(userName.isEmpty()) {									// returns boolean
			System.out.println("Username field cannot be empty");
			System.out.println(userName.isBlank());
			System.out.println(userName.isEmpty());
		}else {
			System.out.println("Username is not empty");
			
		}
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
			System.out.println(userName.isBlank());
			System.out.println(userName.isEmpty());
		}else {
			System.out.println("Username or password is not empty");
		
		}

	}

}
