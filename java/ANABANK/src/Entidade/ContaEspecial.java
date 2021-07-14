package Entidade;

public class ContaEspecial extends Conta {
	
	private double limite;

	public ContaEspecial(int numero, String nome, double limite) {
		super();
		this.limite = limite;
	}
		//Construtor
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	} 
	
	
	
}
