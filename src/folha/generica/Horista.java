package folha.generica;

public abstract class Horista extends Funcionario {

	private double valorHora;
	private int numeroHoras;
	
	// Constructor
	
	public Horista(String nome, int codigo, double valorHora, int numeroHoras) {
		super(nome, codigo);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	
	// Methods
	
	protected double salario() {
		return valorHora * numeroHoras;
	}
	
	
	


	// Getters and Setters

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
}
