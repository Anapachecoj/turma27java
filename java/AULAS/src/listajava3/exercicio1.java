package listajava3;

import java.util.Scanner;

public class exercicio1 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		
		int[] vetor = new int[5];
		int maior=0, num;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print ("Digite cinco n�meros inteiros:");
			num = (int) ler.nextInt(); 
			
			if  (num > maior ) {
				maior = num; 
				
			}
		
		}
		System.out.println("O maior n�mero digitado foi: " + maior);	
			
		
		
		
	}
}
