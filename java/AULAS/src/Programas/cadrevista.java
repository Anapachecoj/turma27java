package Programas;

import java.util.Scanner;

import objeto.Pessoa;

public class cadrevista {
public static void main (String[] args) {
	
	Scanner leia = new Scanner (System.in);
	Pessoa cliente1 = new Pessoa ();
	System.out.println("Digite seu nome: ");
	cliente1.nome= leia.next();
	System.out.println("Digite o ano de nascimento: ");
	cliente1.anoNascimento = leia.nextInt();
	
	if (cliente1.calcularIdade() >= 18) {
		System.out.println("Você é maior de idade portanto tem total acesso as revistas");
	} else {
		System.out.println("Proibido conteudo menor de 18 anos!!!");
	}
	

}
}
