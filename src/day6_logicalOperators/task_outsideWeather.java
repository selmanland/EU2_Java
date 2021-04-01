package day6_logicalOperators;

public class task_outsideWeather {

	public static void main(String[] args) {
		
		String outsideWeather;
		int degree;
		outsideWeather="Shinny";
		degree=70;
		
		boolean comp2 = (!(outsideWeather=="Rainy" || degree==70));
		
		System.out.println(comp2);
		
		int b=2;
		boolean res = ++b == 2 || --b == 2 && --b ==2; // F || T && F  >>> F || F  >>> F
		
		System.out.println(res);
		
		boolean x=true, z=true;
		int y=20;
		
		x=(y!=10) || (z=false); // x = T || F >>> x = T
		
		System.out.println(x);
		
		double v1=20;
		double v2=80;
		int q, remain;
		q=(int)(v1+v2)*25;
		remain=q%40;
		
		System.out.println(remain);
		
		

	}

}
