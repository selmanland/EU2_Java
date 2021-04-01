package day14_methods_Part2;

public class Lab1_printLarger {

	public static void main(String[] args) {
		
		displayMessage("Hi Guys ", 5);

	}
	public static void displayMessage(String message, int times) {
		for(int i=1; i<=times; i++) {
			System.out.print(message);
		}
	}

}
/* for method another way is:
	public static void displayMessage(String message, int times){
		String str="";
		for(int i=1; i<=times; i++){
			str = str + message;	//we concatenate 2 string variables
		}
		System.out.println(str);
	}*/