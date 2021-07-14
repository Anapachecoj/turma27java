package aplicacao;

import java.util.Scanner;

import Entidade.Conta;
import Entidade.ContaEspecial;

public class Testebank {

		public static void main (String [] args) {
	 Scanner leia= new Scanner(System.in);
			
			ContaEspecial ce1= new ContaEspecial (5, "ANA", 15);
		 Conta cli1 = new Conta (34, "ARIEL");
		 double valor;
		 
		 
		 System.out.println("Cliente : " + ce1.getNomeCliente());
		 System.out.println(" Saldo atual: R$"+ce1.getSaldo());
		 System.out.println("Digite o valor do crédito:");
		 valor= leia.nextDouble();
		 
		 ce1.credito(100);
		 System.out.println("Saldo atual: R$"+ce1.getSaldo());
		 ce1.debito(200);
		 System.out.println("Saldo atual: R$"+ce1.getSaldo());
	}
		
}
