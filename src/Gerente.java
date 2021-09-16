
// Gerente é um Funcionário, Gerente herda da classe Funcionário
// Assim podemos corrigir o problema da aula (commit) anterior.
public class Gerente extends Funcionario {
	
	private int senha;
	
	// Construtores
	public Gerente() {
		
	}
	
	// Métodos da classe
	public double getBonificacao() {
		return super.salario;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// Métodos getters
	public int getSenha() {
		return this.senha;
	}
	
	// Métodos setters
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
