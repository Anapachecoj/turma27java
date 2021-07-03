package lista2;

import java.util.Scanner;

public class exercicio5 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		double indicepoluicao;
		System.out.println ("qual o indice de poluição?");
		indicepoluicao = (double) ler.nextInt();
		if (indicepoluicao < 0.3) {
			System.out.println ("sua empresa está dentro da norma");
			
		}
		else if (indicepoluicao >= 0.3 & indicepoluicao < 0.4){
			System.out.println (" as empresas do grupo 1 precisam suspender suas atividades! ");
	}
		else if (indicepoluicao >= 0.4 & indicepoluicao < 0.5) {
			System.out.println (" as empresas do grupo 1 e 2 precisam suspender as atividades! ");
		}
		else {
			System.out.println (" todas as empresas ´precisam suspender as atividades");
		}
	}

}

