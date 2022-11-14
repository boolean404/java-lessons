package day17Assignment2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Assignment2 {
	public static void main(String[] args) {
		System.out.println("============= Stream Assignment 2 by Bo Bo Aung ==============");

		Employee emp1 = new Employee("Htet Htet", "Yangon", "Electronics", 900_000, LocalDate.of(1991, 10, 16));
		Employee emp2 = new Employee("Cheery", "Yangon", "Electronics", 820_000, LocalDate.of(1994, 8, 14));
		Employee emp3 = new Employee("Kyaw Kyaw", "Yangon", "Electronics", 780_000, LocalDate.of(1988, 9, 02));
		Employee emp4 = new Employee("Aung Aung", "Mandalay", "IT", 600_000, LocalDate.of(1995, 1, 11));
		Employee emp5 = new Employee("Jeon", "Mandalay", "IT", 600_000, LocalDate.of(1997, 9, 1));
		Employee emp6 = new Employee("Hsu Hsu", "Pyin Oo Lwin", "IT", 920_000, LocalDate.of(1994, 12, 10));
		Employee emp7 = new Employee("Ko Ko", "Monywa", "IT", 500_000, LocalDate.of(1992, 11, 11));
		Employee emp8 = new Employee("Aye Aye", "Yangon", "HR", 500_000, LocalDate.of(1992, 10, 10));
		Employee emp9 = new Employee("Gay Gay", "Taung Gyi", "HR", 400_000, LocalDate.of(1996, 5, 12));
		Employee emp10 = new Employee("Aye Aye", "Monywa", "HR", 300_000, LocalDate.of(1995, 9, 3));

		List<Employee> empList = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);

		// 1
		System.out.println("\n1.============ Minimun salary of employees ============");
		int minSalary = empList.stream()
				.mapToInt(e -> e.getSalary()).min()
				.getAsInt();
		System.out.println("=> Minimum salary of all employess is : " + minSalary);

		// 2
		System.out.println("\n2.============ Youngest employee information ============");
		System.out.println("Name \t City \t Department \t Salary \t Birthday");
		System.out.println("============================================================");
		List<Employee> sortedList = empList.stream()
				.sorted(Comparator.comparing(Employee::getBirthday).reversed())
				.limit(1)
				.collect(Collectors.toList());
		sortedList.forEach(sp -> System.out.println(sp.getName() + "\t" + sp.getCity() + "\t" + sp.getDepartment()
				+ "\t" + sp.getSalary() + "\t" + sp.getBirthday()));

		// 3
		System.out.println("\n3.============ All Employee count whose birthday is greater than or equal '1995-02-12' ============");
		LocalDate lDate = LocalDate.of(1995, 2, 12);

		long eCount = empList.stream()
				.filter(e -> (e.getBirthday().equals(lDate) || e.getBirthday().isBefore(lDate)))
				.count();
		System.out.println("Count of employee :=> " + eCount);

		// 4
		System.out.println("\n4..============ Total salary of all employees ============");
		int totalSalary = empList.stream()
				.mapToInt(Employee::getSalary)
				.sum();
		System.out.println("Total salary of all employees : => " + totalSalary);

		// 5
		System.out.println("\n5.============ Three maximun salaries ============");
		List<Employee> threeMaxEmp = empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.limit(3)
				.collect(Collectors.toList());

		// System.out.println(threeMaxEmp);
		System.out.println("=> Three max salary are under the following.");
		threeMaxEmp.forEach(e -> System.out.println("=> " + e.getSalary()));

		// 6
		System.out.println("\n6.============ The average salary of department 'HR' ============");
		Map<String, Double> avgSalaryHR = empList.stream()
				.filter(emp -> emp.getDepartment().equals("HR"))
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		avgSalaryHR.forEach((dep, avg) -> System.out.println("Average salary of '" + dep + "' department : => " + avg));

		// 7
		System.out.println("\n7.============ Employee who get smallest salary ============");
		System.out.println("Name \t City \t Department \t Salary \t Birthday");
		System.out.println("============================================================");
		Employee smEmp = empList.stream()
				.min(Comparator.comparingInt(e -> e.getSalary()))
				.get();
		System.out.println(smEmp.getName() + "\t" + smEmp.getCity() + "\t\t" + smEmp.getDepartment() + "\t"
				+ smEmp.getSalary() + "\t\t" + smEmp.getBirthday());

		// 8
		System.out.println("\n8.============ Highest salary of employee in each city ============");
		System.out.println("City \t\t Max Salary");
		System.out.println("==========================");

		Map<String, List<Employee>> groupByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

		groupByCity.forEach((city, emp) -> {
			System.out.print(city);
			Employee maxSalaryEmp = emp.stream()
					.max(Comparator.comparingInt(e -> e.getSalary()))
					.get();
			System.out.println(" =>\t" + maxSalaryEmp.getSalary());
		});

		// 9
		System.out.println("\n9.============ Employee who got the same salary ============");
		Map<Integer, List<Employee>> sameSalaryEmp = empList.stream()
				.collect(Collectors.collectingAndThen(Collectors.groupingBy(Employee::getSalary),
						map -> map.entrySet().stream()
						.filter(e -> e.getValue().size() > 1)
						.collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()))));

		// list output of employee same salary
		System.out.println("List of employee who got same salary : => " + sameSalaryEmp);

		sameSalaryEmp.forEach((salary, emp) -> {
			System.out.println("\nEmployees who get same salary : => " + salary);
			System.out.println("Name \t City \t Department \t Salary \t Birthday");
			System.out.println("============================================================");

			emp.forEach(sEmp -> {
				System.out.println(sEmp.getName() + "\t" + sEmp.getCity() + "\t" + sEmp.getDepartment() + "\t"
						+ sEmp.getSalary() + "\t" + sEmp.getBirthday());
			});
		});

		// 10
		System.out.println("\n10.============ Employee names in each department ============");
		Map<String, List<String>> groupByDepartment = empList.stream()
				.collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

		// list output of employee names in each department
		System.out.println("List of employee names in each department : => " + groupByDepartment);

		groupByDepartment.forEach((d, dEmp) -> {
			System.out.println("\n=> Employee names who are department of '" + d + "'");

			dEmp.forEach(e -> System.out.println("=> " + e));
		});
	}

}
