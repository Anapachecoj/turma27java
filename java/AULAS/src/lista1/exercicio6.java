package lista1;

import java.util.Scanner;

public class exercicio6 {
	public static void main (String[] args ) {
		double d,x1,x2,y1,y2;
		Scanner ler= new Scanner(System.in); 
		System.out.println ("escreva o valor de x1 :");
		x1 = ler.nextDouble();
		System.out.println ("escreva o valor de x2 :");
		x2 = ler.nextDouble();
		System.out.println ("escreva o valor de y1 :");
		y1 = ler.nextDouble();
		System.out.println ("escreva o valor de y2 :");
		y2 = ler.nextDouble();
		//d= Matematica.raiz((Matematica.potencia((x2-x1),2)) + (Matematica.potencia((y2-y1),2)),2);
		d=  Math.sqrt (Math.pow((x2-x1),2)) + (Math.pow ((y2-y1),2) );
		System.out.println ("A distancia de D é igual a "+d);
}
}