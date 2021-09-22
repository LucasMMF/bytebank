
// O conceito de um Funcionário é um conceito abstrato
// por tanto não devemos ter objetos concretos instanciados deste conceito.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// Construtores
	public Funcionario() {
		
	}
	
	// Métodos da classe
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	// Métodos getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	// Métodos setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
