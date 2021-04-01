package day36_staticClassMembers;

public class CountableTest {

	public static void main(String[] args) {

		int objectCount;

		Countable obj1 = new Countable(); 	// before static this was 1 (belongs to object and was 0 before 
											// and now constructor makes 11111111111)
		Countable obj2 = new Countable(); 	// before static this was 1 (belongs to object and was 0 before 
											// and now constructor makes 2222222222222)
		Countable obj3 = new Countable(); 	// before static this was 1 (belongs to object and was 0 before 
											// and now constructor makes 333333333333333333333)
					
		objectCount = obj1.getInstanceCount();
		objectCount = obj2.getInstanceCount();
		
		System.out.println(objectCount);		// can print and get the result by these 3 different ways...
		System.out.println(Countable.instanceCount);
		System.out.println(obj3.getInstanceCount());

		// before static all new object values were 1 but static effected the values in class
		// and each time increased the value by 1 and now the value is 3
		
		// STATIC means SHARE the same value by each object

	}
}
