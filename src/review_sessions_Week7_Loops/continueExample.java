package review_sessions_Week7_Loops;

public class continueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++) {
			if(i>=2 && i<=4) {
				System.out.println("skipping-" + i);
				continue;
			}
			System.out.println("i = " + i);
		}
	}

}
