package objeto;

public class Conta {

		public int numero;
	
		public  double saldo;
		public double limite; 
	
		//construtor
		public Conta (int numero) {
			this.numero = numero; 
		}
		public Conta (int numero, double saldo) {
			this.numero = numero; 
			this.saldo = saldo; 
			
		}
		public Conta (int numero, double saldo, double limite) {
			this.numero = numero; 
			this.saldo = saldo; 
			this.limite = limite;
		}
	// encapsulamento 
		

		
		public void sacar () {
			
		}
		public void depositar() {
			
		}
		public void imprimirExtrato() {
			
		}
}
