package lista2;

import java.util.Scanner;

public class exercicio4 {
	public static void main (String[] args ) {
		int num;
		Scanner ler= new Scanner(System.in);
		System.out.println ("Digite um numero inteiro:");
		num = ler.nextInt();
		if (num < 0 ) {
			System.out.println (num + " é um numero negativo, não é possivel culcular entre impar ou par");
		}
		else if (num == 0 ){
			System.out.println (num + " é neutro ");
		}
		else if (num % 2 == 0 ) {
		System.out.println (num + " é par \n");
		}
		else {
			System.out.println (num +" é impar \n:");
		}
	}
}
