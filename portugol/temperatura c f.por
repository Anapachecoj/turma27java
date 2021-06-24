programa
{
	
	funcao inicio()
	{
		cadeia nome
		real temperaturaC

		
		escreva("oi qual seu nome? ")
		leia ( nome )
		escreva (" qual e a temperatura em graus celsios? ") 
		leia (temperaturaC)
		temperaturaC = (temperaturaC* 1.8) + 32
		//temperaturaC - (temperaturaC-32) /1.8
		escreva (nome + " sua temperatura em farenheits é: "+ temperaturaC)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */