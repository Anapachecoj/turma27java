package listajava1;

import java.util.Scanner;

public class exercico1 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		int num1,num2, num3, maior; 
		System.out.println ("digite o num1:");
		num1 = (int) ler.nextInt();
		System.out.println ("digite o num2:");
		num2 = (int) ler.nextInt();
		System.out.println ("digite o num3:");
		num3 = (int) ler.nextInt();
		 if (num1> num2) {
			maior = num1; 
			System.out.println (num1 + " � o maior numero" );
		}
		else if (num2> num3) {
			maior = num2;  
			System.out.println (num2 + " � o maior n�mero");
		}
		else {
			System.out.println (num3 + " � o maior n�mero");
		}
			
	}
}
