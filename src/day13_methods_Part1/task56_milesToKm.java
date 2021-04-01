package day13_methods_Part1;

public class task56_milesToKm {

	public static void main(String[] args) {

		convertKM();
		convertKM();
	}

	public static void convertKM() {
		
		int mile=70;
		double km=mile*1.60934;
		
		System.out.println(mile + " mile = " + km + " KM");
		
	}

}
