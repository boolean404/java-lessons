package day9;

public class Employee {
	static int noOfEmployee = 3;
	static int nextId = 1;
	String name;
	int salary;

	final int empId;

	public Employee() throws AppException {
		if (nextId > noOfEmployee) {
			throw new AppException("Sorry! Limited number has been reached");
		}
		empId = nextId;
		nextId++;

	}

	// name = "Hla Hla", salary = 50000
	public void init(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// name = "Cherry", new Salary = 50000
	public void changeData(String newName, int newSalary) {
		if (!this.name.equalsIgnoreCase(newName)) {
			this.name = newName;
		}
		if (this.salary != newSalary) {
			this.salary = newSalary;
		}
	}

	public void showdata() {
		System.out.format("%d \t %s \t %d \n", this.empId, this.name, this.salary);
	}
}
