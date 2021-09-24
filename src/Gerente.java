
// Gerente é um FuncionárioAutenticavel, Gerente herda da classe FuncionárioAutenticavel
// Assim podemos corrigir o problema da aula (commit) anterior.
// Gerente é Funcionário e assina contrato Autenticável
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	// Construtores
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	// Métodos da classe
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do GERENTE.");
		return super.getSalario();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	// Métodos setters
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
}
