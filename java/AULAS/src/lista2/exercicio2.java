package lista2;

import java.util.Scanner;

public class exercicio2 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		double codigodofuncionario, horastrabalhadas,horaextra, salario, salarioextra, salariototal;
		System.out.println ("qual o seu codigo da empresa?");
		codigodofuncionario = ler.nextDouble(); 
		System.out.println ("qual a quantidade de horas trabalhadas?");
		horastrabalhadas = ler.nextDouble();
		if (horastrabalhadas <= 50) {
			//salario = 500;
			salarioextra = 0.0; 
			salariototal = horastrabalhadas * 10;
			System.out.println ("seu salario � igual " + salariototal);
			System.out.println (" seu salario extra � "+  salarioextra);
		}
		else {
			salario = 500;
					horaextra = horastrabalhadas - 50;
					salarioextra = horaextra * 20; 
					salariototal = salario + salarioextra;
					System.out.println ("funcion�rio(a) " + codigodofuncionario);
					System.out.println (" o seu salario � igual a "+  salario);
					System.out.println (" seu sal�rio extra � igual " + salarioextra);
					System.out.println (" o seu salario total � " +salariototal);
		}
	}
}
