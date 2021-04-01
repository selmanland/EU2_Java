package review_sessions_week12_arraylist;

import java.util.ArrayList;

public class MethodsReturnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getMonths());
		
		
	}
	public static ArrayList<String> getMonths(){
		
		ArrayList<String> months = new ArrayList<String>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		months.add("May");
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		months.add("Sep");
		months.add("Oct");
		months.add("Nov");
		months.add("Dec");
		
		
		return months;
		
	}

}
