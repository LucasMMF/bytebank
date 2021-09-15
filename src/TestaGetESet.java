
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1, 1);
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		// Agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		System.out.println(titularDaConta.getProfissao());
		System.out.println(paulo.getProfissao());
		System.out.println(conta.getTitular().getProfissao());
		
		titularDaConta.setProfissao("Professor");
		
		System.out.println(titularDaConta.getProfissao());
		System.out.println(paulo.getProfissao());
		System.out.println(conta.getTitular().getProfissao());
	}
}
