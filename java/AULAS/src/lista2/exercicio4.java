package lista2;

import java.util.Scanner;

public class exercicio4 {
	public static void main (String[] args ) {
		int num;
		Scanner ler= new Scanner(System.in);
		System.out.println ("Digite um numero inteiro:");
		num = ler.nextInt();
		if (num < 0 ) {
			System.out.println (num + " � um numero negativo, n�o � possivel culcular entre impar ou par");
		}
		else if (num == 0 ){
			System.out.println (num + " � neutro ");
		}
		else if (num % 2 == 0 ) {
		System.out.println (num + " � par \n");
		}
		else {
			System.out.println (num +" � impar \n:");
		}
	}
}
