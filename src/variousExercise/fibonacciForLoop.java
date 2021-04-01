package variousExercise;

public class fibonacciForLoop {

	public static void main(String[] args) {

		int n = 10;
		int num1=0, num2=1;
		int temp;
		
		System.out.print(num1 + ", " + num2);
		
		for(int i=1; i<=n-2; i++) {
			temp=num1+num2;
			System.out.print(", " + temp);
			
			num1=num2;
			num2=temp;
		}

	}

}
