package listajava2;

import java.util.Scanner;
public class exercico3 {
public static void main (String[]args) {
	try (Scanner ler = new Scanner(System.in)) {
		int contador= 0, idade= 0, contador2=0;
		while (idade<= 99 && idade>= 0 ) {
			System.out.println ("Digite sua idade: ");
			idade= (int) ler.nextInt(); 
		if (idade <21 ) {
			contador++;
			
		}
		if (idade>50 && idade<100) {
			contador2++;
		}
		}
		System.out.println("Pesoas com mais de 21 anos:" + contador);
		System.out.println("Pessoas com mais de 50 anos:" + contador2);
	}
}
}
