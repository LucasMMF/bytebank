
public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2222, 3333);
		SeguroDeVida sv = new SeguroDeVida();
		AcaoBolsa ab = new AcaoBolsa();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.calculaImposto(cc);
		ci.calculaImposto(sv);
		ci.calculaImposto(ab);
		
		System.out.println("O total de imposto arrecadado é: " + ci.getTotal());

	}

}
