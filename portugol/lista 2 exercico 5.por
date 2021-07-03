programa
{
	
	funcao inicio()
	{
		real indicepoluicao 
		escreva (" digite o indice de poluição: ")
		leia (indicepoluicao)
		se (indicepoluicao < 0.3) {
			escreva ("sua empresa está dentro da norma")
		}
		senao se (indicepoluicao >= 0.3 e indicepoluicao < 0.4) {
			escreva (" as empresas do grupo 1 precisam suspender suas atividades! ")
		}
		senao se (indicepoluicao >= 0.4 e indicepoluicao < 0.5)
		{
		escreva 	(" as empresas do grupo 1 e 2 precisam suspender as atividades! ")
		}
		senao {
			escreva (" todas as empresas ´precisam suspender as atividades") 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */