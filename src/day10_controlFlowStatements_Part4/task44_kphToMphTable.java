package day10_controlFlowStatements_Part4;

public class task44_kphToMphTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("KPH      MPH");
		System.out.println("------------");
		
		for(int kph=60; kph<=130; kph+=10) {
		double mph=kph*0.6214;
		System.out.println(kph + "\t" + mph);
		}
		
	} 

}
