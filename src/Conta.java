
public abstract class Conta {
	
	protected double 	saldo;
	private int 		agencia = 42;
	private int 		numero;
	private Cliente 	titular;
	private static int 	total;
	
	// Construtores
	public Conta(int agencia, int numero) {
		total++;
		// System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}
	
	// Métodos de Conta
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	// Métodos getters
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public Cliente getTitular() {
			return this.titular;
		}
		
		public static int getTotal() {
			return Conta.total;
		}
		
		// Métodos setters
		public void setAgencia(int agencia) {
			if (agencia <= 0) {
				System.out.println("Não pode valor menor ou igual a 0.");
				return;
			}
			this.agencia = agencia;
		}
		
		public void setNumero(int numero) {
			if (numero <= 0) {
				System.out.println("Não pode valor menor ou igual a 0.");
				return;
			}
			this.numero = numero;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
}
