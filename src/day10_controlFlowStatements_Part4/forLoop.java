package day10_controlFlowStatements_Part4;

public class forLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("Hello");
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("i = " + i);
		
	}
		for(int i=5; i<=100; i+=10) {
			System.out.println("i = " + i);
		}
		for(int num=20; num>=15; num--) {
			System.out.println("num = " + num);
		}
		for(int i=50; i>=0; i-=10) {
			System.out.println("i = " + i);
		}	
	}	

}
