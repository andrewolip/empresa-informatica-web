package folha.generica;

public abstract class Funcionario {

	private String nome;
	private int codigo;

	protected abstract String cargo();

	protected abstract double salario();

	// private Empresa emp;

	// Constructor

	public Funcionario(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	// Methods
	
	public void gerarContraCheque() {
		exibir();
	}
	
	public void exibir() {
		System.out.println("C�digo: " + getCodigo());
		System.out.println("Nome: " + getNome());
		System.out.println("Cargo: " + cargo());
		System.out.println("Sal�rio: " + salario() + "\n");
	}

	// Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
