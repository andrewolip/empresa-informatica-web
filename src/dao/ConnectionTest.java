package dao;

import java.sql.SQLException;
import java.util.List;

import controller.EmpresaBO;
import folha.informatica.EmpresaInformatica;

public class ConnectionTest {

	public void remove() {
		EmpresaInformatica empresa = new EmpresaInformatica();
		empresa.setId(1l);
		empresa.setNome("HSBC");

		EmpresaBO empresaBO = new EmpresaBO();
		empresaBO.remove(empresa);
	}

	public void update() {
		EmpresaInformatica empresa = new EmpresaInformatica();
		empresa.setNome("HSBC");
		empresa.setId(1L);

		EmpresaBO empresaBO = new EmpresaBO();
		empresaBO.update(empresa);
	}

	public void list() {
		EmpresaInformatica empresa = new EmpresaInformatica();
		empresa.setNome("HSBC");

		EmpresaBO empresaBO = new EmpresaBO();

		List<EmpresaInformatica> empresas = empresaBO.findAll();

		for (EmpresaInformatica empresaInformatica : empresas) {
			System.out.println("ID: " + empresaInformatica.getId());
			System.out.println("NOME: " + empresaInformatica.getNome() + "\n");
		}
	}

	public static void main(String[] args) throws SQLException {

		// testando metodo FIND
		ConnectionTest teste = new ConnectionTest();
		
		EmpresaBO empresaBO = new EmpresaBO();
		System.out.println(empresaBO.find(2L).getNome());
		
	}
}
