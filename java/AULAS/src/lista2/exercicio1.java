package lista2;

import java.util.Scanner;

public class exercicio1 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		double kilo, excesso, multa;
		System.out.println ("quantos kilos o tomate pesa?");
		kilo = ler.nextDouble(); 
		if (kilo >50 ) {
			excesso = kilo - 50; 
					multa = excesso * 4;
					System.out.println (" o seu excesso de peso � " + excesso +  " kilos portanto sua multa a ser paga � " + multa);
		}
		else {
			System.out.println (" sua compra n�o excedeu o valor de peso. \n");
			System.out.println (" portanto a sua multa � 0.0");
		}
	}
}
