
// Gerente é um FuncionárioAutenticavel, Gerente herda da classe FuncionárioAutenticavel
// Assim podemos corrigir o problema da aula (commit) anterior.
public class Gerente extends FuncionarioAutenticavel {
	
	// Construtores
	public Gerente() {
		
	}
	
	// Métodos da classe
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do GERENTE.");
		return super.getSalario();
	}
	
}
