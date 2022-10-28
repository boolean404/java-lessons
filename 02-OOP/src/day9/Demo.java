package day9;

public class Demo {
	public static void main(String[] args) {
		try {
			// create obj
			Employee emp = new Employee();
			var emp2 = new Employee();
			var emp3 = new Employee();
			
			// init data
			emp.init("Kyaw Kyaw", 50000);
			emp2.init("Aung Aung", 60000);
			emp3.init("Hla Hla", 50000);
			
			// show data
			System.out.println("ID \t Name \t Salary");
			System.out.println("--------------------");
			emp.showdata();
			emp2.showdata();
			emp3.showdata();
			
			emp3.changeData("Cherry", 50000);
			System.out.println("After change emp1 data");
			emp3.showdata();
			
			var emp4 = new Employee(); //occur exception
			emp4.showdata();
		} catch (AppException e) {
			System.err.println(e.getMessage());
		}
	}
}
