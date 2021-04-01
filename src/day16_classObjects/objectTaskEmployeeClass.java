package day16_classObjects;

public class objectTaskEmployeeClass {

	public static void main(String[] args) {

		employee person1 = new employee();
		System.out.println(person1.name);

		person1.name = "Ahmet";
		person1.jobTitle = "Engineer";
		person1.salary = 3500;
		person1.attendMeeting();		
		System.out.println(person1.name);
		System.out.println(person1.jobTitle);
		System.out.println(person1.salary);

		employee person2 = new employee();
		System.out.println(person2.name);

		person2.name = "Mehmet";
		person2.jobTitle = "worker";
		person2.salary = 2300;
		person2.work();

		System.out.println();

		person2.attendMeeting();
		person2.work();
		person2.salary();

		System.out.println();

		employee person3 = new employee();
		person3.name = "Halim";
		person3.jobTitle = "Chief";
		person3.salary = 2800;

		System.out.println(person3.name);

		person3.salary();
		person3.work();

	}

}
