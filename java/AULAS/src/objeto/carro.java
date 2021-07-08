package objeto;

public class carro {
	public String marca;
	public String modelo;
	public String cor;
	public double potenciamotor; 
	public boolean ligado; 
	public int velocidade; 
	
	public void ligarCarro () {
		ligado = true; 
		System.out.println("Carro ligando...");
	}
	public void desligarCarro () {
		if (velocidade ==0) {
		ligado = false;
		System.out.println("Desligando Carro...");
		} else {
			System.out.println("Desacelerndo o Carro...");
		}
	}
	public void acelerandoCarro () {
		velocidade ++; 
	}
}
