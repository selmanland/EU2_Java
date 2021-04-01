package day9;

public class day9_ORLogicWithSwitch {

	public static void main(String[] args) {
		// OR Logic With Switch
		// A or B or C --> Pass     D or E --> Fail
		
// char grade = 'A';
		
		//A or B or C - >  pass D or E - > fail
		
//		switch(grade) {
//		case 'A':
//			System.out.println("pass");
//			break;
//		case 'B':
//			System.out.println("pass");
//			break;
//		case 'C':
//			System.out.println("pass");
//			break;
//		case 'D':
//			System.out.println("fail");
//			break;
//		case 'E':
//			System.out.println("fail");
//			break;
//		}
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("pass");
			break;
			
		case 'D':
		case 'E':
			System.out.println("fail");
			break;
		}
		
		

	}

}
