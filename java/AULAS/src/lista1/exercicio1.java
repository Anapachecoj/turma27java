package lista1;

import java.util.Scanner;

public class exercicio1 {
	public static void main (String[] args ) {
		double nota1, nota2, nota3, pond;
		Scanner ler= new Scanner(System.in);
		System.out.println ("Digite sua 1° nota:");
		nota1 = ler.nextDouble();
		System.out.println (" Digite sua 2° nota:");
		nota2= ler.nextDouble();
		System.out.println (" Digite sua 3° nota: ");
		nota3= ler.nextDouble();
		pond= (2*nota1 + 3*nota2 + 5*nota3)/10;
		System.out.println (" Sua nota final é:" + pond);
	}
}
