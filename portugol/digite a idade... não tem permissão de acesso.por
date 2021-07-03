programa
{
	
	funcao inicio()
	{
	inteiro idade
	inteiro  contador=0

		escreva (" Digite sua idade: ")
		leia (idade)
		
		enquanto (idade <18) {
			escreva ("você não tem permissão para acessar\n")
			escreva ("Digite novamente ")
			
			leia (idade)
			contador++
			se (contador>=2){

				 escreva (" continue tentando... ")
				 pare 
			} 
					
			
		}
			
			se (contador==0){
		     escreva (" Parábens agora que você é cringe tem total acesso")
		     
			}
			senao {
				escreva (" você ainda é um bebe ")
			}
		

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */