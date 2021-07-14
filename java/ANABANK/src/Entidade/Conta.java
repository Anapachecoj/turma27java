package Entidade;

public class Conta {
	private int numero; 
	private String nomeCliente; 
	private double saldo;
	
	//CONSTRUTOR
	
	public Conta() {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

		public Conta(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	//ENCAPSULAMENTO - GETTERS AND SETTER 
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public double getSaldo() {
		return saldo;
	}

/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	} 
	*/
	//METODOS
	
	public void credito (double valorCredito) {
		
		this.saldo = this.saldo + valorCredito;
		
	}
	
	public void debito (double valorDebito) {
		
		this.saldo = this.saldo - valorDebito; 
		
	}

}
