package day12Assignment2;

public class Teacher extends Person {

	private String position, department;
	private int salary;

//	public Teacher(String position, String department, int salary) {
//		this.position = position;
//		this.department = department;
//		this.salary = salary;
//	}

	public Teacher(String name, String nrcNo, String address, String phone, String position, String department,
			int salary) {
		super(name, nrcNo, address, phone);
		this.position = position;
		this.department = department;
		this.salary = salary;
	}

	// getter
	public String getPosition() {
		return position;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public void promote(String position, int salary) {

		System.out.println("Original position is : => " + this.position);
		System.out.println("Original salary is : => " + this.salary + " MMK");
		System.out.println("-------------------------");

		this.position = position;
		this.salary = salary;

		System.out.println("New position is : => " + position);
		System.out.println("New salary is : => " + salary + " MMK");
	}

	public void transfer(String NewDepartment) {
		System.out.println("Original Department is : => " + this.department);
		this.department = NewDepartment;
		System.out.println("New Department is => " + department);
	}

	public void showTeacherInfo() {
		super.showInfo();
		System.out.println("Position is : => " + position);
		System.out.println("Department is : => " + department);
		System.out.println("Salary is : => " + salary + " MMK");
	}

}
