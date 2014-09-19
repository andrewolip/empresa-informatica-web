package folha.informatica;

import java.io.Serializable;

import folha.generica.Mensalista;

public class Gerente extends Mensalista implements Serializable {

	private static final long serialVersionUID = 1L;

	// Constructor

	public Gerente(String nome, int codigo, double salarioMensal) {
		super(nome, codigo, salarioMensal);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double comissao() {
		return 0.10;
	}

	@Override
	protected String cargo() {
		return "Gerente";
	}
}
