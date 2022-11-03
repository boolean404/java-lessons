package day12Assignment2;

public class Demo {
	public static void main(String[] args) {

		// start read me first section
		// you can change under default fields' data
		String name = "Aung Aung";
		String nrcNo = "6/htwana(Naing)123456";
		String address = "No.17, Myeik Road, Kyauk Maw Quarter";
		String phone = "09876543210";
		String origPosition = "Junior Developer";
		String origDepartment = "Web Department";
		int origSalary = 300_000;
		String newPosition = "Project Manager";
		String newDepartment = "Game Department";
		int newSalary = 600_000;
		// end read me first section

		System.out.println("------------- Assignment 2 by Bo Bo Aung --------------");

		// start person section
		Person per = new Person(name, nrcNo, address, phone);

		// original person info
		System.out.println("\n------------ original Person Info --------------");
		per.showInfo();
		per.showIdentificationInfo();

		// new person info
		System.out.println("\n------------ New Person Info --------------");
		per.setName("Su Su");
		per.setNRCNo("13/kathana(Naing)654321");
		per.setAddress("No.8, 1 Street, Ayeyeikthar Quarter");
		per.setPhone("09422201071");

		per.showInfo();
		per.showIdentificationInfo();
		// end person section

		// start teacher section
		System.out.println("\n------------ Original Teacher's Info --------------");
		Teacher tea = new Teacher(name, nrcNo, address, phone, origPosition, origDepartment, origSalary);
		tea.showTeacherInfo();
		tea.showIdentificationInfo();

		System.out.println("\n------------- New Job Promote --------------");
		tea.promote(newPosition, newSalary);
		System.out.println("-------------------------");

		System.out.println("\n-------------- Transfer new Department ----------------");
		tea.transfer(newDepartment);
		System.out.println("-------------------------");

		System.out.println("\n------------ Teacher's All New Info --------------");
		tea.showInfo();
		System.out.println("-------------------------");

		tea.showIdentificationInfo();
		// end teacher section

		System.out.println("\n------------- Bye ---------------");

	}
}
