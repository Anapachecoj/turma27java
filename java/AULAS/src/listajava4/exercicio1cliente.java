package listajava4;

import java.util.Scanner;

import objeto.cliente;

public class exercicio1cliente {
	public static void main (String [] args) {
		try (Scanner leia = new Scanner (System.in)) {
			cliente cliente1 = new cliente(); 
			
			System.out.println("Olá Cliente digite seu nome: ");
			cliente1.nome = leia.next(); 
			System.out.println("Digite seu sexo M, F, N: ");
			cliente1.sexo = leia.next().charAt(0);
			System.out.println("Digite seu ano de nascimento: ");
			cliente1.anoNascimento = leia.nextInt(); 
			
			System.out.println(" Cliente "  + cliente1.nome + " sua idade é: " + (2021 - cliente1.anoNascimento));
		}
	}
}
	
