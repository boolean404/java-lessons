package day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Reading_3 {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("src/employee.txt");

		List<String> lines = Files.readAllLines(path);

		List<Employee> empList = lines.stream().map(Employee::convertLineToObject).toList();
		empList.forEach(emp -> {
			System.out.println("id" + emp.getId());
			System.out.println("name" + emp.getName());
			System.out.println("city" + emp.getCity());
		});
	}
}
