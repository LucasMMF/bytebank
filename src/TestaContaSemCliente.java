
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.setTitular(new Cliente()); // Sem isso dá o famoso nurupo, NullPointerException
		System.out.println(contaDaMarcela.getTitular());
		
		 // nurupo
		 // gah!
		contaDaMarcela.getTitular().nome = "Marcela";
		System.out.println(contaDaMarcela.getTitular().nome);
	}
}
