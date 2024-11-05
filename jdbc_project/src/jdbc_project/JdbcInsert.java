package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3306/biswa_db";
			String user = "root";
			String password = "root@mysql";
			Connection con = DriverManager.getConnection(URL, user, password);
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?)");
			ps.setInt(1, 101);
			ps.setString(2, "Biswa");
			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("Data Inserted Success!");
		} catch (ClassNotFoundException | SQLException e) {

		}
	}
}
