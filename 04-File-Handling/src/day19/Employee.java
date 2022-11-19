package day19;

public class Employee {
	private int id;
	private String name;
	private String city;

//	public Employee(int id, String name, String city) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.city = city;
//	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static Employee convertLineToObject(String line) {
		Employee emp = new Employee();

		String[] data = line.split("\t");
		emp.setCity(data[2]);
		emp.setName(data[1]);
		emp.setId(Integer.parseInt(data[0]));
		return emp;
	}
}
