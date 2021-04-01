package day10_controlFlowStatements_Part4;

public class task46_multiplicationTable {

	public static void main(String[] args) {
		int x=5;
		if(x<=0) {
			System.out.println("please enter a valid positive number");
		}else {
		System.out.println("Multiplication table for " + x);
		System.out.println("---------------------------");

		for(int i=1; i<=10; i++) {
			System.out.println(x + "*" + i + "=" + (x*i));
		}
	}

}
}