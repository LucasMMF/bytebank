
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new ContaPoupanca(1, 1);
		// contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(100);
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.getSaldo());
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.getSaldo());
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new ContaCorrente(1, 1);
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if (sucessoTransferencia) {
			System.out.println("TransferĂȘncia efetuada com sucesso.");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoPaulo.getSaldo());
	}
}
