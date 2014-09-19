package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/eiw", "root", "");
		}catch(SQLException sqle) {
			throw new RuntimeException(sqle);
		}
	}
}
