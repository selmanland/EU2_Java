package day13_methods_Part1;

public class deepAndDeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am starting in main");
		deep();
		System.out.println("Now I am back in main");

	}
	public static void deep() {
		System.out.println("I am now in deep");
		deeper();
		System.out.println("Now I am back in deep");
	}
	public static void deeper() {
		System.out.println("I am now in deeper");
	}

}
