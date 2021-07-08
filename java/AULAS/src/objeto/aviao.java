package objeto;

public class aviao {
	//ATRIBUTOS
	public String empresa;
	public String modelo;
	public String tipo; 
	
	public int roda; 
	public int asa; 
	public int velocidade; 
	
	public double potenciamotor;
	
	public boolean noAr;
	public boolean ligado; 
	
	public void ligar () {
		ligado= true;
	}
	public void desligar () {
		ligado= false;
	}
	
	public void decolando () {
	for(int x=1; x>10; x++) {
		aumentarVelocidade();
	}
	noAr= true; 
	}
	public void pousar () {
		for(int x=1; x<=10; x++) {
			diminuirVelocidade();
		}
		noAr= false;
	}
	public void aumentarVelocidade() {
		velocidade++;
	}
	public void aumentarVelocidade(int acrescimo) {
		velocidade = velocidade + acrescimo;
	}
	public void diminuirVelocidade() {
		velocidade--; 
	}
	public void diminuirVelocidade(int descrecimo) {
		velocidade-= descrecimo;
	}
	
}
