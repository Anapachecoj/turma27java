package Programas;

import java.util.Scanner;

import objeto.Pessoa;
import objeto.frontloko;

public class nivelescolar {

	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		Pessoa aluno1 = new Pessoa ();
		System.out.println("Ol� Alune digite seu nome: ");
		aluno1.nome= leia.next();
		
		System.out.println("Digite o ano de nascimento: ");
		aluno1.anoNascimento= leia.nextInt();
		
		if (aluno1.calcularIdade() >=21) {
			System.out.println("Ol� alune " + aluno1.nome + " voc� tem " + (2021 -aluno1.anoNascimento) + " anos de idade " + " e est� no Ensino Superior" );
		} else if (aluno1.calcularIdade() >=17) {
			System.out.println("Ol� alune " + aluno1.nome + " voc� tem " + (2021 -aluno1.anoNascimento) + " anos de idade " + " e est� no Ensino M�dio" );
		} else {
			System.out.println("Ol� alune " + aluno1.nome + " voc� tem " + (2021 -aluno1.anoNascimento) + " anos de idade " + " e est� no Ensino Fundamental" );
		}
	}

	
}
