
public class TesteContas {

	public static void main(String[] args) {
		
		Conta conta = new ContaPoupanca(1337, 23334);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas é: " + Conta.getTotal());
		
		ContaCorrente cc = new ContaCorrente(1111, 1111);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 2222);
		cp.deposita(200.00);
		
		
		cc.transfere(10.00, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
