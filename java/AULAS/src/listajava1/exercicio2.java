package listajava1;

import java.util.Scanner;

public class exercicio2 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		int num1, num2, num3; 
		System.out.println ("digite num1");
		num1 = ler.nextInt();
		
		System.out.println ("digite num2");
		num2 = ler.nextInt();
		
		System.out.println ("digite num3");
		num3 = ler.nextInt();
	
		if (num1 == num2 && num2 ==num3) {
			System.out.printf (" %d - %d - %d", num1, num2, num3);
		}
		else if (num1 >=  num2 && num2 >= num3) {
			System.out.printf (" %d - %d - %d", num3, num2, num1);
		}
		else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
			System.out.printf (" %d - %d - %d", num2, num3, num1);
		}
		else if (num2 >= num1 && num2 >=num3 && num3 >= num1) {
			System.out.printf (" %d - %d - %d", num1, num3, num2);
	}
		
		}
	}

