package day20_stringManipulation_part2;

public class task81_TimeStamp {

	public static void main(String[] args) {

		String date = "10/10/2019 14:59:00";
		System.out.println(timeStamp(date));

	}

	public static String timeStamp(String date) {

		date = date.replace("/", "").replace(":", "").replace(" ", "");
		
		return date;
	}
}
