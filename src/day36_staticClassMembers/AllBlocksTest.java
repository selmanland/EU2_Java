package day36_staticClassMembers;

public class AllBlocksTest {

	public static void main(String[] args) {
		
		AllBlocks o1 = new AllBlocks();
		AllBlocks o2 = new AllBlocks(8);
		
/*output: static blocks run first and only once then instance blocks and constructors

First static init				// static blocks run first and only once
Second static init
First instance init				// instance blocks run before constructors and each time
Second instance init
No argument constructor
First instance init				// instance blocks run before constructors and each time
Second instance init
One argument constructor

*/

	}

}
