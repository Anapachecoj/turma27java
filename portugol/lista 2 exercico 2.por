programa
{
	
	funcao inicio()
	{
		real codigodofuncionario, horastrabalhadas,horaextra, salario, salarioextra, salariototal
		escreva (" Qual seu código da empresa? ")
		leia (codigodofuncionario)
		escreva (" Qual a quantidade de horas trabalhadas? ")
		leia (horastrabalhadas) 
		
		se (horastrabalhadas <= 50) {
			//salario = 500
			salarioextra = 0.0 
			salariototal = horastrabalhadas * 10
			escreva("seu salario é igual " + salariototal)
			escreva (" seu salario extra é "+  salarioextra)
 	
		}
		
		senao { 
			salario = 500
			horaextra = horastrabalhadas - 50
			salarioextra = horaextra * 20 
			salariototal = salario + salarioextra
			escreva (" funcionário(a) " + codigodofuncionario)
			escreva (" o seu salario é igual a " + salario )
			escreva (" seu salário extra é igual " + salarioextra)
			escreva (" o seu salario total é " +salariototal)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */