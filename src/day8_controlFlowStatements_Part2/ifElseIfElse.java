package day8_controlFlowStatements_Part2;

public class ifElseIfElse {

	public static void main(String[] args) {
		//1=Monday  2=Tuesday  3=Wednesday  4=Thursday  5=Friday  6=Saturday  7=Sunday
		
		int day=4;
		
		if(day==1) {
			System.out.println("Monday");
	}else if(day==2) {
			System.out.println("Tuesday");
	}else if(day==3) {
			System.out.println("Wednesday");	
	}else if(day==4) {
			System.out.println("Thursday");
	}else if(day==5) {
			System.out.println("Friday");
	}else if(day==6) {
			System.out.println("Saturday");
	}else if(day==7) {
			System.out.println("Sunday");
	}else {
		System.out.println("NOT a valid day entry");
	}System.out.println("********************************");
	
	
	int age = 10;
	
	if(age<2 || age>18) {
		System.out.println("ineligible");
	}if(age==2) {
		System.out.println("toddler");
	}if(age>=3 && age<=5) {
		System.out.println("early childhood");
	}if(age==6 || age==7) {
		System.out.println("young reader");
	}if(age>=8 && age<=10) {
		System.out.println("elementary");
	}if(age==11 || age==12) {
		System.out.println("middle");
	}if(age==13) {
		System.out.println("impossible");
	}if(age>=14 && age<=16) {
		System.out.println("high school");
	}if(age==17 || age==18) {
		System.out.println("scholar");
	}else {
		System.out.println("not valid");
	}
	
	}
}