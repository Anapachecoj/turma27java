package listajava4;

import java.util.Scanner;

import objeto.funcionario;

public class exercicio4funcionario {
	public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
		funcionario funcionario1 = new funcionario();
		
		
		System.out.println("OL� FUNION�RIO(A) DIGITE SEU C�DIGO DE ENTRADA: ");
		funcionario1.codigo = leia.nextInt() ;
		System.out.println("FUNCION�RIO "  + funcionario1.codigo + " SEU SAL�RIO ESSE M�S � NO VALOR DE 5000" );
	}

	
		
}

