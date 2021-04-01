package assignment8_Methods;

import java.util.Scanner;

public class q15_toDoListApp {

	public static void main(String[] args) {
		// q15_to do list app
		
		boolean b = validateTask(false);
		System.out.println(b);

	}
	public static boolean validateTask(boolean flag) {
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter true or false and 2 task ID");
		flag = user_input.nextBoolean();
		int taskld = user_input.nextInt();
		int currentID = user_input.nextInt();
		
		if(flag==false) {
			flag=false;
		}else if(flag==true && taskld==(currentID+1)) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;
		
	}

}
