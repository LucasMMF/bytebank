
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new ContaPoupanca(1, 1);
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		// Proibido:
		// conta.saldo = conta.saldo - 101;
		System.out.println(conta.getSaldo());
	}
}
