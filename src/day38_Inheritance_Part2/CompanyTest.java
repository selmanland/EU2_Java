package day38_Inheritance_Part2;

public class CompanyTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FulltimeEmployee ft = new FulltimeEmployee();
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40, 40);
		ct.calculatePay(40, 40);

	}

}
