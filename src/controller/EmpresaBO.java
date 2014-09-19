package controller;

import java.util.List;

import dao.EmpresaDAO;
import folha.informatica.EmpresaInformatica;

public class EmpresaBO {
	
	private EmpresaDAO empresaDAO = new EmpresaDAO();
	
	public void save(EmpresaInformatica empresa) {
		this.empresaDAO.save(empresa);
	}
	
	public void update(EmpresaInformatica empresa){
		this.empresaDAO.update(empresa);
	}
	
	public EmpresaInformatica find(Long id) {
		return this.empresaDAO.find(id);
	}
	
	public List<EmpresaInformatica> findAll() {
		return this.empresaDAO.findAll();
	}
	
	public void remove(EmpresaInformatica empresa) {
		this.empresaDAO.remove(empresa);
	}
}
