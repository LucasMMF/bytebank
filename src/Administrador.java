
// Administrador é Funcionário e assina contrato Autenticável
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	// Métodos da classe
	@Override
	public double getBonificacao() {
		return 50;
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
