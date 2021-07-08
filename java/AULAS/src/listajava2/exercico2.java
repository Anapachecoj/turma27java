package listajava2;

import java.util.Scanner;
public class exercico2 {
	public static void main (String[] args ) {
		try (Scanner ler = new Scanner(System.in)) {
			int num, par = 0, impar = 0, neutro = 0, invalido = 0; 
			for (int contador = 1; contador <=10; contador ++) {
				System.out.println ("digite o dez números:");
				num = (int) ler.nextInt(); 
				
				if ( num > 0) {
					if (num %2==0) {
						par++;	
					}
					else   {
					impar++;
					}
				}
				else if (num ==0 ) {
					neutro++;
				}
				else {
					invalido++; 
				}
		}
			System.out.println ("Total de número pares: " + par );
			System.out.println ("Total de número impares: " + impar );
			System.out.println ("Total de número neutros: " + neutro );
			System.out.println ("Total de número inválidos: " + invalido );
			
		}
		
			
}
}

