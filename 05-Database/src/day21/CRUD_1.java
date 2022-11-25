package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD_1 {
	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/testing_java";
		String username = "root";
		String password = "root";

		try (Scanner sc = new Scanner(System.in)) {
			Connection con = DriverManager.getConnection(url, username, password);

			// get user input
			System.out.print("Enter item name : => ");
			String inp_name = sc.nextLine();
			System.out.print("Enter item price : => ");
			float inp_price = Float.parseFloat(sc.nextLine());

			// save to database method 1
//			saveToDBMethod1(con, inp_name, inp_price);

			// method 2
			saveToDBMethod2(con, inp_name, inp_price);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void saveToDBMethod2(Connection con, String inp_name, float inp_price) throws SQLException {
		var query = "INSERT INTO products(p_name, p_price)values('" + inp_name + "'," + inp_price + ");";
		// create prepare statement
		PreparedStatement pst = con.prepareStatement(query);

		// execute
		pst.executeUpdate();
		System.out.println("Success added item to Database!");

	}

	private static void saveToDBMethod1(Connection con, String inp_name, float inp_price) throws SQLException {
		var query = "INSERT INTO products(p_name, p_price)values('" + inp_name + "'," + inp_price + ");";
		System.out.println(query);

		// create prepare statement
		Statement st = con.createStatement();

		// execute
		st.executeUpdate(query);
		System.out.println("Success added item to Database!");

	}

}
