
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		// primeiraConta.saldo = 300;
		primeiraConta.deposita(300);
		
		System.out.println("Saldo da primeira: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
		
		// segundaConta.saldo += 100;
		segundaConta.deposita(100);
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getSaldo());
		
		if (primeiraConta == segundaConta) {
			System.out.println("É a mesma conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
