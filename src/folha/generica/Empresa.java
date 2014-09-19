package folha.generica;

import java.util.ArrayList;
import java.util.List;

import utils.ValidaCodigoException;

public class Empresa {

	private Long id;
	private String nome;

	public List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	// Constructor

	public Empresa(String nome) {
		super();
		this.nome = nome;
	}

	public Empresa() {
	}

	// Methods

	public void gerarFolha() {
		for (Funcionario f : funcionarios) {
			f.gerarContraCheque();
		}

	}

	public void exibirFuncionario(int codigo) {

	}

	public boolean inserirFuncionario(Funcionario f) {
		if (funcionarios.size() > 0) {
			for (Funcionario funcionario : funcionarios) {
				if (funcionario.getCodigo() != f.getCodigo()) {
					this.funcionarios.add(f);
					break;
				} else {
					throw new ValidaCodigoException();
				}
			}
		} else {
			this.funcionarios.add(f);
		}
		return true;
	}

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
