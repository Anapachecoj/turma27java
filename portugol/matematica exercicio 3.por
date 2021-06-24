programa
{
	
	funcao inicio()
	
	{
		inteiro tempoevento
		inteiro horas, minutos, segundos

		 //entradas
		escreva ("Digite os segundos do evento: ")
		leia (tempoevento)
		
		//processamento
		horas = tempoevento / 3600
		minutos=  (tempoevento %3600) / 60
		segundos = (tempoevento% 3600) % 60
		//saidas
		escreva (" Horas: " +horas+ "\n" )
		escreva ( " minutos: " +minutos+ "\n" )
		escreva (" segundos:" +segundos+ "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */