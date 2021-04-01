package Assm14_OOP;

public class Atts {
	
	String name;
	String color;
	int amount;	
		
	public String asString() {
		return "name=" + name + " color=" + color + " amount=" + amount;
	}
	
	
	public static void main(String[] args) {
		
		Atts a = new Atts();
		a.name = "table";
		a.color = "brown";
		a.amount = 1;
		
		System.out.println(a.asString());
	}
		
}

