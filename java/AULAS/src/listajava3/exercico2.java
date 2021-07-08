package listajava3;

import java.util.Scanner;

public class exercico2 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		
		int[] vetor= new int [10];
		int maiorpontuacao=0, somapontuacao=0, media=0, contador=0;
	
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor do lançamento: ");
			vetor [i] =  ler.nextInt(); 
			somapontuacao += vetor[i];
			media = somapontuacao /10;
			 if (vetor[i] > maiorpontuacao) {
				 maiorpontuacao = vetor [i];
			 }
		
			
		}
		for (int i = 0; i < 10; i++ ) {
			if (maiorpontuacao == vetor[i]) {
				contador++;
			}
		}
		System.out.println("O valor da sua soma é: " + somapontuacao);
		System.out.println("a maior ocorrência é: " + maiorpontuacao + " sendo a numeração: " + contador );
		System.out.println("A média dos lançamentos é: " + media);
	}
	
}
