package variousExercise;

public class oddNumbers {

	public static void main(String[] args) {

		int number = 21;
		int i = 1;
		
		if(number%2==0) {
			while(i<number) {
				if(i%2==0) {
					System.out.print(", ");
				}else {
					System.out.print(i);
				}
				i++;
			}
		}else {
			while(i<=number) {
				if(i%2!=0) {
					System.out.print(i);
				}else {
					System.out.print(", ");
				}
				i++;
			}
		}

	}
}