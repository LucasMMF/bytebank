
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta está na agência " + segundaConta.agencia);
		
		System.out.println("Igualando os objetos...");
		segundaConta.saldo = 300;
		System.out.println("Primeira conta possui saldo: " + primeiraConta.saldo
				+ ". Bem como a segunda conta agora também possui saldo: " + segundaConta.saldo);
		primeiraConta.agencia = 146;
		System.out.println("Primeira conta agora também possui agência: " + primeiraConta.agencia
				+ ". Bem como a segunda conta também possui agência: " + segundaConta.agencia);
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
