package Programas;

import java.util.Scanner;

import objeto.Pessoa;

public class CadFriends {

	public static void main (String [] args) {
		 
		Scanner leia = new Scanner (System.in); // instanciou um Scanner / telado
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa (); 
		
		System.out.println("Digite o nome: ");
		amigo1.nome = leia.next(); 
		System.out.println("Digite o sexo M, F, N: ");
		amigo1.sexo = leia.next().charAt(0);
		System.out.println("Digite seu ano de nascimento: ");
		amigo1.anoNascimento = leia.nextInt(); 
		
		System.out.println("Idade: "+ (2021 - amigo1.anoNascimento));
		
		System.out.println("Digite o nome: ");
		amigo2.nome = leia.next(); 
		System.out.println("Digite o sexo M, F, N: ");
		amigo2.sexo = leia.next().charAt(0);
		System.out.println("Digite seu ano de nascimento: ");
		amigo2.anoNascimento = leia.nextInt(); 
		
		System.out.println("Idade: "+ (2021 - amigo2.anoNascimento));
	 
	
		
	}

	}

