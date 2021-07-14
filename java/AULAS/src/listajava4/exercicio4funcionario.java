package listajava4;

import java.util.Scanner;

import objeto.funcionario;

public class exercicio4funcionario {
	public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
		funcionario funcionario1 = new funcionario();
		
		
		System.out.println("OLÁ FUNIONÁRIO(A) DIGITE SEU CÓDIGO DE ENTRADA: ");
		funcionario1.codigo = leia.nextInt() ;
		System.out.println("FUNCIONÁRIO "  + funcionario1.codigo + " SEU SALÁRIO ESSE MÊS É NO VALOR DE 5000" );
	}

	
		
}

