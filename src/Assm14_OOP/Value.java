package Assm14_OOP;

public class Value {

//	Write a class definition of a class named 'Value' with the following:  +
//	a constructor accepting a single integer parameter  +
//	a constructor with no parameters  +
//	a method 'setVal' that accepts a single parameter,
//	a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
//	a method 'getVal' that returns an integer value as follows: if setVal has ever been called, 
//	it getVal returns the last value passed to setVal. Otherwise if the "single int parameter" 
//	constructor was used to create the object, getVal returns the value passed to that constructor. 
//	Otherwise getVal returns 0.

	// INSTANCE VARIABLE DEFAULTS:
	// String NULL , int 0, boolean false

	boolean modified = false; // instance variable -- class daki TÜM methodlarda erişi VAR
	private int abc;

	public Value(int value) {
		this.abc = value;
	}

	public Value() { // default ataması için genelde kullanılır!!
		this.abc = 0;
	}

	public int getVal() {
		// setValue -- onun değerini dön
		// cons(arg) -- oo arg nin değerini dön
		// cons(non-arg) -- 0 dön
		return this.abc;
	}

	public void setVal(int value) { // setter
		this.abc = value;
		modified = true;
	}

	public boolean wasModified() { // setVal cağırıldı ise True

		return modified;
	}

	public static void main(String[] args) {
		Value test = new Value(10); // const ile ilk değer ataması yaptım abc=10
		test.setVal(20); // modifiye ettim , abc=20
		System.out.println(test.wasModified()); // true
		test.getVal(); // 20 this.abc

	
		@SuppressWarnings("unused")
		Value test2 = new Value(10); // this.abc=10
		System.out.println(test.wasModified()); // false
		test.getVal(); // abc=10 this.abc

	
		@SuppressWarnings("unused")
		Value test3 = new Value(); // abc = 0
		test.getVal(); // this.abc=0

	}

}
