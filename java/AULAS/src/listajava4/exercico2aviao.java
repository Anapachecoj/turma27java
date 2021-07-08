package listajava4;

import java.util.Scanner;

import objeto.aviao;

public class exercico2aviao {
	
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		aviao aviao1 = new aviao();
		
		aviao1.empresa = "AZUL";
		aviao1.modelo = "BIMOTOR";
		aviao1.roda = 3; 
		aviao1.tipo = "PASSAGEIROS 15 LUGARES"; 
		aviao1.noAr = false; 
		aviao1.ligado = false; 
		aviao1.velocidade = 0; 
		
		// Agora vamos voar...
		
		aviao1.ligar();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		
		aviao1.decolando(); 
		aviao1.aumentarVelocidade(40);
		System.out.println("VELOCIDADE ATUAL: " + aviao1.velocidade + " NO AR " + aviao1.noAr +" LIGADO " + aviao1.ligado);
		
		aviao1.diminuirVelocidade(39);
		System.out.println("VELOCIDADE ATUAL: " + aviao1.velocidade + " NO AR " + aviao1.noAr +" LIGADO " + aviao1.ligado);
		
		aviao1.pousar();
		System.out.println("VELOCIDADE ATUAL: " + aviao1.velocidade + " NO AR " + aviao1.noAr +" LIGADO " + aviao1.ligado);
		
		aviao1.desligar(); 
		System.out.println("VELOCIDADE ATUAL: " + aviao1.velocidade + " NO AR " + aviao1.noAr +" LIGADO " + aviao1.ligado);
		
	}
}
