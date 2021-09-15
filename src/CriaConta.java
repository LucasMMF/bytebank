
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(1, 1);
		// primeiraConta.saldo = 200;
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		// primeiraConta.saldo += 100;
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1, 1);
		// segundaConta.saldo = 50;
		segundaConta.deposita(50);
		
		System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
		System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		
		System.out.println(segundaConta.getAgencia());
		
		segundaConta.setAgencia(146);
		System.out.println("Agora a segunda conta está na agência " + segundaConta.getAgencia());
		
		System.out.println("Igualando os objetos...");
		// segundaConta.saldo = 300;
		segundaConta.deposita(300);
		System.out.println("Primeira conta possui saldo: " + primeiraConta.getSaldo()
				+ ". Bem como a segunda conta agora também possui saldo: " + segundaConta.getSaldo());
		primeiraConta.setAgencia(146);
		System.out.println("Primeira conta agora também possui agência: " + primeiraConta.getAgencia()
				+ ". Bem como a segunda conta também possui agência: " + segundaConta.getAgencia());
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
