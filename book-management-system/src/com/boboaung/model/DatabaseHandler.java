package com.boboaung.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

	private static Connection createConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bms", "root", "root");
		return con;
	}

	public static User loginUser(String username, String password) {
		User user = null;
		try (Connection con = createConnection()) {
			var query = "SELECT * FROM user WHERE username = ? AND password = ?";

			PreparedStatement pstm = con.prepareStatement(query);

			pstm.setString(1, username);
			pstm.setString(2, password);

			ResultSet result = pstm.executeQuery();

			if (result.next()) {
				user = new User();
				user.setId(result.getInt("id"));
				user.setUsername(username);
				user.setPassword(password);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return user;
	}

	public static void saveAuthor(Author author) throws Exception {
		try (Connection con = createConnection()) {
			var query = "INSERT INTO author(name, birthday, created_by, native_town)VALUES(?,?,?,?)";

			var pstm = con.prepareStatement(query);
			pstm.setString(1, author.getName());
			pstm.setDate(2, Date.valueOf(author.getBirthday()));
			pstm.setInt(3, author.getCreated_by().getId());
			pstm.setString(4, author.getNative_town());

			pstm.executeUpdate();
		} catch (Exception e) {
			throw e;
		}

	}

	public static List<Author> findAllAuthor() {
		List<Author> list = new ArrayList<>();

		try (Connection con = createConnection()) {
			var query = " select author.*, user.username from author, user where author.created_by = user.id ";

			var pstm = con.prepareStatement(query);

			var result = pstm.executeQuery();

			while (result.next()) {
				var author = new Author();
				author.setId(result.getInt("id"));
				author.setName(result.getString("name"));
				author.setNative_town(result.getString("native_town"));

				User created_user = new User();
				created_user.setId(result.getInt("created_by"));
				created_user.setUsername(result.getString("username"));

				author.setCreated_by(created_user);

				author.setBirthday(LocalDate.parse(result.getString("birthday")));
				list.add(author);

			}
		} catch (Exception e) {
		}
		return list;
	}

}
