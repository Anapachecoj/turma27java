programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
	//variaveis
	inteiro valordigitado=0
	inteiro totalsomatorio=0
	real media=0.0
	real totalvaloreslidos=0.0
	caracter op
	
	 
	//entradas  //processamentos
	enquanto (valordigitado>=0){
		escreva (" Digite um valor positivo, ou negativo para sair: ")
	leia (valordigitado)
		se(valordigitado>=0){
		totalsomatorio += valordigitado
		totalvaloreslidos++
		
		}


	
	}
	
	media = totalsomatorio / totalvaloreslidos
	
	//saidas
	escreva ("\n total somatorio:" + totalsomatorio)
	escreva ("\n Total de numeros lidos: " +totalvaloreslidos)
	escreva (" programa finalizado ")
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */