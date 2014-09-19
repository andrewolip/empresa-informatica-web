package folha.informatica;

import java.io.Serializable;

import folha.generica.Empresa;

public class EmpresaInformatica extends Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	// Methods

	public EmpresaInformatica(String nome) {
		super(nome);
	}
	
	public EmpresaInformatica(){}

	public boolean inserirProgramador(Programador p) {
		return inserirFuncionario(p);
	}

	public boolean inserirAnalista(Analista a) {
		return inserirFuncionario(a);
	}

	public boolean inserirGerente(Gerente g) {
		return inserirFuncionario(g);
	}

	public boolean inserirDiretor(Diretor d) {
		return inserirFuncionario(d);
	}
}
