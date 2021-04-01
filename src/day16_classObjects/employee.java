package day16_classObjects;

public class employee {

	String name;
	String jobTitle;
	double salary;

	public void work() {
		System.out.println("Employee " + name + " is working hard");
	}

	public void attendMeeting() {
		System.out.println(name + " is attending a meeting as " + jobTitle);
	}

	public void salary() {
		System.out.println("Name: " + name + " job title: " + jobTitle + " Salary: " + salary);
	}
}
