package day9assignment.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(Driver.class.getName());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root", "divanshu");
		return connection;
	}

}
