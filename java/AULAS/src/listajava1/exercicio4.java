package listajava1;

import java.util.Scanner;

public class exercicio4 {
	public static void main (String[] args ) {
		Scanner red = new Scanner(System.in);
		int  num; 
		System.out.println ("Digite um numero inteiro:");
		num = red.nextInt(); 
		
		if ((num % 2) == 0 ) {
		System.out.printf (num + " � par e sua raiz quadrada �: %.2f\n");
		}
		else {
			System.out.printf (num +" � impar e seu quadrado � %.2f\n:");
		}
	}
}
