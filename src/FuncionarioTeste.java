
public class FuncionarioTeste {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 = Funcionário comum; 1 = Gerente; 2 = Diretor
	private int senha;
	
	// Construtores
	public FuncionarioTeste() {
		
	}
	
	// Métodos da classe
	public double getBonificacao() {
		// Este modo de programar deve ser evitado!
		if (this.tipo == 0) { // Funcionário comum
			return this.salario *0.1;
		} else if (this.tipo == 1) { // Gerente
			return this.salario;
		} else { // Diretor
			return this.salario + 1000;
		}
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
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
	
	public int getTipo() {
		return this.tipo;
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
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
