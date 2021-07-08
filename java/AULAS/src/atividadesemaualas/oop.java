package atividadesemaualas;

import java.util.Scanner;

public class oop {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		String nome;
		String sexo;
		int idade;  
		System.out.println("informe seu nome: ");
		nome =  ler.toString();
		
		System.out.println("infome seu sexo, M masculino, F feminino, N neutro:");
		sexo =  ler.nextchar(); 
		System.out.println("informe seu ano de nascimento: ");
		idade =  ler.nextInt();
		
		System.out.println("informe sua idade: ");
		System.out.println("Ola senhore,o seu sexo é " + sexo + " O seu nome é " + nome + " sua idade é de %d anos" );
		
		
	}
}
