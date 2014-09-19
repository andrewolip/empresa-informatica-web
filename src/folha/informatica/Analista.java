package folha.informatica;

import java.io.Serializable;

import folha.generica.Horista;

public class Analista extends Horista implements Serializable {

	private static final long serialVersionUID = 1L;

	// Constructor

	public Analista(String nome, int codigo, double valorHora, int numeroHoras) {
		super(nome, codigo, valorHora, numeroHoras);
	}

	@Override
	protected String cargo() {
		return "Analista";
	}
}