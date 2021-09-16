
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(1, 1);
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
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.00);
		
		Designer d = new Designer();
		d.setSalario(2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}
