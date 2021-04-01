package review_sessions_Week7_Loops;

public class forLoopCount {

	public static void main(String[] args) {
		// print 1-10 using for loop

		int start = 15;
		int end = 25;
		if (start < end) {
			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}

		} else if (start > end) {
			for (int i = start; i >= end; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("numbers are equal");
		}
	}

}
