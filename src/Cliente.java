
public class Cliente implements Autenticavel {
	private String 	nome;
	private String 	cpf;
	private String 	profissao;
	private int 	senha;
	
	// Métodos da classe
	@Override
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
		this.senha = senha;
	}
}
