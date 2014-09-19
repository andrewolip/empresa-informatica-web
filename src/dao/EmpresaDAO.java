package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import folha.informatica.EmpresaInformatica;

public class EmpresaDAO {

	private Connection connection;
	private PreparedStatement stmt;

	public EmpresaDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void save(EmpresaInformatica empresa) {
		String sql = "INSERT INTO empresa(nome) VALUES(?)";

		try {
			this.stmt = this.connection.prepareStatement(sql);
			this.stmt.setString(1, empresa.getNome());
			this.stmt.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				this.stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void update(EmpresaInformatica empresa) {
		String sql = "UPDATE empresa SET nome=? WHERE id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, empresa.getNome());
			stmt.setLong(2, empresa.getId());

			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public EmpresaInformatica find(Long id) {
		String sql = "SELECT id, nome FROM empresa where id=?";
		EmpresaInformatica empresa = null;
		try {
			this.stmt = this.connection.prepareStatement(sql);
			this.stmt.setLong(1, id);
			ResultSet rs = this.stmt.executeQuery();

			while(rs.next()) {
				empresa = new EmpresaInformatica();
				empresa.setId(rs.getLong("id"));
				empresa.setNome(rs.getString("nome"));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				this.stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return empresa;
	}

	public void remove(EmpresaInformatica empresa) {
		String sql = "DELETE FROM empresa WHERE id=?";

		try {
			this.stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, empresa.getId());
			this.stmt.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public List<EmpresaInformatica> findAll() {
		List<EmpresaInformatica> empresas = null;
		try {
			empresas = new ArrayList<EmpresaInformatica>();
			this.stmt = connection
					.prepareStatement("SELECT id, nome FROM empresa");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				EmpresaInformatica empresa = new EmpresaInformatica();
				empresa.setId(rs.getLong("id"));
				empresa.setNome(rs.getString("nome"));

				empresas.add(empresa);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				this.stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return empresas;
	}

}
