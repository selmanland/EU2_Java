package day35_encapsulation;

public class Employee {

	private String name; 					// 1st we make PRIVATE to cut the access
	private int idNumber;
	private String department;
	private String position;

	public void setName(String name) { 		// 2nd create public setter method to set the value
		this.name = name;
	}

	public int getIdNumber() { 				// 3rd to create getter method to retrieve the value
		return idNumber;
	}

	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	public Employee(String name, int idNumber) {

		this.name = name;
		this.idNumber = idNumber;
		department = "";
		position = "";
	}

	public Employee(String name, int idNumber, String department, String position) {

		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		return "Employee [name=" + name + ", idNumber=" + idNumber + ", department=" + department + ", position="
				+ position + "]";
	}

}
