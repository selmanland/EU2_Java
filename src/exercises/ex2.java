package exercises;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(repl("Hello", 3));

	}
	public static String repl(String str, int rpt) {
		
		String temp = "";
		
		for(int i=1; i<=rpt; i++) {
			temp = temp + str;
		}
		return temp;
	}

}
