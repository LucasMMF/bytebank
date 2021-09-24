
public class CalculadorImposto {
	
	private double total;
	
	public void calculaImposto(Tributavel tri) {
		this.total += tri.getValorImposto();
	}
	
	public double getTotal() {
		return this.total;
	}
	
}
