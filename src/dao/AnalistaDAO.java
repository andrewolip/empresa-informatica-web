package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AnalistaDAO {
	private Connection connection;
	private PreparedStatement stmt;

	public AnalistaDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}



}
