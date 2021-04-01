package day15_methodPart3;

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(2, 3, 6));
		System.out.println(sum(2, 3));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}
