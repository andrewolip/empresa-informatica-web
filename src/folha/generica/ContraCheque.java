package folha.generica;

public class ContraCheque {
	
	private String nome;
	private double salario;
	private int codigo;
	private String cargo;
	
	
	//Constructor
	
	public ContraCheque(String nome, double salario, int codigo, String cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.codigo = codigo;
		this.cargo = cargo;
	}

	
	// Getters and Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
