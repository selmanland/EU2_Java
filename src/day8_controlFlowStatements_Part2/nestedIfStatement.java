package day8_controlFlowStatements_Part2;

public class nestedIfStatement {

	public static void main(String[] args) {
		boolean isRushHour=true;
		int carType=2;
		double price=0.0;
		
		if(carType==1) {
			if(isRushHour) {
				price=30.0;
			}else {
				price=5.0;
			}
		}else if(carType==2) {
			if(isRushHour) {
				price=55.30;
			}else {
				price=15.99;
			}
		}
System.out.println("total cost: $" + price);
	}

}
