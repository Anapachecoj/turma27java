programa
{
	
	funcao inicio()
	{
		real kilo, excesso, multa 
		escreva (" Quantos quilos o tomate pesa? ")
		leia (kilo)
		se (kilo >50 ){
			excesso = kilo - 50 
			multa = excesso * 4 
			escreva ("o seu excesso de peso é " + excesso + " kilos. \n portanto sua multa a ser paga é " + multa)
		}
		senao {
			escreva (" sua compra não excedeu o valor de peso. \n")
			escreva (" portanto a sua multa é 0.0")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */