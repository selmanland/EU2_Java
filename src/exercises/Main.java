package exercises;

public class Main {
	
	public static void DoPrint(Base o) {
		o.Print();
	}

	public static void main(String[] args) {
		
		Base x = new Base();
		Derived z = new Derived();
		DoPrint(x);
		DoPrint(z);

	}
	

}
