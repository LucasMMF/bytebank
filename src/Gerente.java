
// Gerente é um FuncionárioAutenticavel, Gerente herda da classe FuncionárioAutenticavel
// Assim podemos corrigir o problema da aula (commit) anterior.
// Gerente é Funcionário e assina contrato Autenticável
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	// Construtores
	public Gerente() {
		
	}
	
	// Métodos da classe
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do GERENTE.");
		return super.getSalario();
	}
	
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// Métodos setters
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
