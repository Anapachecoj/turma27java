package introducao;

import java.util.Scanner;

public class CadaAluno {
	public static void main (String[] args ) {
		Scanner ler= new Scanner(System.in);
		
		//String alunos [] = new String [4]; //0...3
		
		String alunos[] = {"JOAO", "MARCOS", "MARIA", "PEDRO"};
		
		alunos[3] = alunos[3] .toUpperCase();
		
		for (int x= 0; x<4; x++) {
			System.out.println(alunos[x]);
		}
	}
}
