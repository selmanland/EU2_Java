package day8_controlFlowStatements_Part2;

public class task33_grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=100;
		
		if(mark<60) {
			System.out.println("fail");
		}else if((mark>=60) && (mark<90)) {
			System.out.println("pass");
		}else if((mark>=90) && (mark<=100)) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("invalid mark");
		}
	}

}
