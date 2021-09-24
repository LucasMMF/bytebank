
public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		AcaoBolsa acao = new AcaoBolsa();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);
		calc.registra(acao);
		
		System.out.println("O total de imposto arrecadado é: " + calc.getTotalImposto());

	}

}
