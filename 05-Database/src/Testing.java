import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Testing {
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mariadb://localhost:3306/testing_java";
		String username = "root";
		String password = "root";

		// create connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("get connection");

		// create statement
		Statement stm = con.createStatement();
		System.out.println("Create statement ok!");

		// define query
		String query = """
				INSERT INTO employees(emp_id, emp_name, city, birthday, bonous, salary)VALUES(1002, 'Aung Aung', 'Yangon', '1999-12-11', 0.8, 200000);
				""";

		// execute query
		int nums = stm.executeUpdate(query);
		if (nums > 0)
			System.out.println("Success execute query");
		else
			System.out.println("Fail execute query!");
		
		// close connection
		con.close();
	}
}
