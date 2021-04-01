package review_sessions_week9_review;

public class ex2 {

	public static void main(String[] args) {
		
		// How to get a particular substring
		
		String s1 = "The best Java core course in Europe is Cybertek. End of story";
		
		String myTarget = "Cybertek";
		
		int index1 = s1.indexOf(myTarget);
		
		int index2 = index1 + myTarget.length();
		
		System.out.println(s1.substring(index1, index2));
		
		for(int i = 0; i <=myTarget.length(); i++) {
			System.out.print(myTarget.substring(0, i));
			System.out.println();
		}
		
	}

}
