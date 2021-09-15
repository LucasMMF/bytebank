
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(1, 1);
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.setTitular(new Cliente()); // Sem isso dá o famoso nurupo, NullPointerException
		System.out.println(contaDaMarcela.getTitular());
		
		 // nurupo
		 // gah!
		contaDaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaDaMarcela.getTitular().getNome());
	}
}
