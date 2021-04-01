package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student("Mike", 30, 1000);
		Student s2 = new Student("Ozzy", 20, 1200);
		Student s3 = new Student("Jamal", 10, 1500);

		s1.school = "CybertekEU";	// school belongs to class and whatever changes I made will effect all other objects
								// was "Cybertek" before but s1.school changed all s object school values to "CybertekEU"
								// bc school belongs to class and changed static value...

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		// STATIC means SHARE the same value by each object
	}

}
