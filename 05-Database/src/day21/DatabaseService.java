package day21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {
	public static Connection createConnection() throws SQLException {
		String url = "jdbc:mariadb://localhost:3306/testing_java";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

	public static void save(String item_name, float price) throws SQLException {
		Connection con = createConnection();
		var query = "INSERT INTO products (p_name, p_price)VALUES(?, ?);";

		PreparedStatement pStm = con.prepareStatement(query);

		pStm.setString(1, item_name);
		pStm.setFloat(2, price);

		// execute
		pStm.executeUpdate();
		closeConnection(con);
	}

	public static void update(int p_id, String item_name, float price) throws SQLException {
		Connection con = createConnection();

		var query = "UPDATE products SET p_name = ?, p_price = ? WHERE p_id = ?";

		PreparedStatement pStm = con.prepareStatement(query);

		pStm.setString(1, item_name);
		pStm.setFloat(2, price);
		pStm.setInt(3, p_id);

		// execute
		pStm.executeUpdate();
		closeConnection(con);
	}

	public static void deleteById(int id) throws SQLException {
		Connection con = createConnection();
		var query = "DELETE FROM products WHERE p_id = ?";
		PreparedStatement pStm = con.prepareStatement(query);
		pStm.setInt(1, id);
		pStm.executeUpdate();
		closeConnection(con);
	}

	public static void deleteAll() throws SQLException {
		Connection con = createConnection();
		var query = "DELETE FROM products";
		PreparedStatement pStm = con.prepareStatement(query);
		pStm.executeUpdate();
		closeConnection(con);
	}

	public static void closeConnection(Connection con) throws SQLException {
		if (con != null)
			con.close();
	}

	public static List<Product> findAll() {
		List<Product> data = new ArrayList<>();

		try (Connection con = createConnection()) {
			var query = "SELECT * FROM products";
			PreparedStatement pStm = con.prepareStatement(query);

			ResultSet rs = pStm.executeQuery();
			rs.next();

		} catch (Exception e) {
			e.getStackTrace();
		}

		return data;
	}
}
