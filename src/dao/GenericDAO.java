package dao;

import java.sql.Connection;
import java.util.List;

public abstract class GenericDAO<T> {

	protected Connection connection;

	public GenericDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public abstract void save(T t);
	
	public abstract void update(T t);
	
	public abstract T find(Long id);
	
	public abstract void remove(T t);
	
	public abstract List<T> findAll();

}
