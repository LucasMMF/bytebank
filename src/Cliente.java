
// Cliente é/assina contrato Autenticável
public class Cliente implements Autenticavel {
	private String 				nome;
	private String 				cpf;
	private String 				profissao;
	private AutenticacaoUtil 	autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	// Métodos da classe
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	// Métodos getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	// Métodos setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
