package review_sessions_week11_wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = Boolean.valueOf(true); //java 12
		Boolean b3 = Boolean.valueOf("true");
		
		Character c1 = new Character('a');
		Character c2 = Character.valueOf('a');
		
		Integer i1 = new Integer(100);
		Integer i2 = Integer.valueOf("1000");
		Integer i3 = Integer.valueOf(1000);
		
		Integer num = new Integer(10);
		System.out.println(num);
		
		String strNum = num.toString();
		System.out.println(strNum);
		
		System.out.println(Integer.sum(40, 30));
		System.out.println(Integer.max(40,30));
		System.out.println(Integer.min(40, 30));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		
		/*
		 first is larger than second - > 1
		 equals - > 0
		 first is less than second - > -1
		 */
		System.out.println(Integer.compare(10, 5));

		// Convert a String into int
		
		String countStr = "3456";
		int intCount = Integer.parseInt(countStr);
		int intCount2 = Integer.valueOf(countStr);
		
		System.out.println(intCount);
		System.out.println(intCount2);
	

	}

}
