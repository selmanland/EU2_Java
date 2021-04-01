package assignment4_ifStatements_SwitchStatements;

public class q6_massNewton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mass=109;
		double weight=mass*9.8;
		
		if(weight>1000) {
			System.out.println("It is too Heavy!");
		}else if(weight<10) {
			System.out.println("The object is too LIGHT!");
		}else if(weight>=10 && weight<=1000) {
			System.out.println("Weight is NORMAL");
		}
	}

}
