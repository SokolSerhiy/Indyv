package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleConnection {

	private static final SingleConnection INSTANCE = new SingleConnection();
	
	private Connection connection;

	private SingleConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1987");
		} catch (SQLException e) {
			connection = null;
		}
	}

	public static SingleConnection getInstance() {
		return INSTANCE;
	}

	public Connection getConnection() {
		return connection;
	}
	
	public void close(){
		try {
			connection.close();
		} catch (SQLException e) {
		}
	}
}
