package listajava1;

import java.util.Scanner;

public class exercico3 {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		int idade, contatdor= 0 ; 
		System.out.println ("Digite sua idade:");
		idade = ler.nextInt(); 
		 if (idade >= 18) {
			System.out.println ("sua idade é: " + idade + " então você se enconta na fase adulta!");
			
		}
		 else if (idade < 10) {
				System.out.println ("sua fase não se encontra no sistema ");
			}
		else if (idade >= 15) {
			System.out.println ("sua idade é: " + idade + " então você se enconta na fase juvenil!");
		}
		else if (idade >= 10 ) {
			System.out.println ("sua idade é: " + idade + " então você se enconta na fase infantil!");
		
			
		}
		
	}
	}

