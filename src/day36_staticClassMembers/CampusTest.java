package day36_staticClassMembers;

public class CampusTest {

	public static void main(String[] args) {		
		
		Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country);

	} // static block run first before everything and only one time
	  // we see UK as country bc first prints USA then overwrites UK as country...we see the last static block country "UK"

}
//output:
//Static Block-1
//Static Block-2
//Constructor
//Constructor
//UK
