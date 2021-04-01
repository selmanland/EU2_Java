package review_sessions_week12_arraylist;

public class AccountTest {

	public static void main(String[] args) {
		
		//Array of object
		//Unlike traditional array that store values like string, integer, boolean
		//array objects stores Objects. The array elemnts store the location of the reference variables of the object
		
		Account obj [] = new Account[2];
		obj[0] = new Account();
		obj[1] = new Account();
		
		
		//when there is a class, how u can call the method belong to that class
		//referenceVariable.methodName
		
		obj[0].setData(1, 2);
		obj[1].setData(3, 4);
		
		System.out.println("For Array Element 0");
		obj[0].showData();
		
		System.out.println("For Array Element 1");
		obj[1].showData();
		
		
		

	}

}
