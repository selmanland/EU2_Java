package day9;

public class day9_ifElseRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(false) 
			System.out.println("Hello"); //Since there is 1 line, no need to use {{}}
		else
			System.out.println("Bye");
		
		System.out.println("******************");
		
		if(false)
			System.out.println("Hello");  //there is 2 lines so must use {{}} to put else below
			System.out.println("Running");
		//else
	}

}
