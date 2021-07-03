programa
{
	
	funcao inicio()
	{
		inteiro num 
		escreva ("digite um numero inteiro:") 
		leia (num) 

          se (num <0) {
          escreva ( num + " é um numero negativo, não é possivel calcular entre impar ou par" )  
          }
		senao se (num == 0) {
			escreva (num +" é neuto")
		}
		senao se (num % 2 == 0 ) {
		escreva (num + " é par \n")
		}
		senao {
			escreva(num + " é impar \n") 
		}
		escreva (" Fim do programa \n ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */