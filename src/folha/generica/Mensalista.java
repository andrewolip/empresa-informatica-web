package folha.generica;

public abstract class Mensalista extends Funcionario {

	private double salarioMensal;
	
	protected abstract double comissao();
	
	// Constructor
	
	public Mensalista(String nome, int codigo, double salarioMensal) {
		super(nome, codigo);
		this.salarioMensal = salarioMensal;
	}
	
	
	// Methods
	
	protected double salario() {
		System.out.println("Comissào: R$ " + salarioMensal * comissao());
		return salarioMensal + salarioMensal * comissao();
	}


	// Getters and Setters
	
	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
}
