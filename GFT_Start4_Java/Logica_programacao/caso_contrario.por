programa
{
	
	funcao inicio()
	{
		escreva("Escolha uma das opções: 1 - Abrir Netflix 2 - Abrir Amazon Prime 3 - Abrir HBO GO 4 - Sair")
		inteiro menu = 0
		escreva("\n" + "Sua opção: ")
		leia(menu)

		escolha (menu)
		{
		caso 1:
		escreva("Opção 1 escolhida -> Abrindo Netflix !")
		pare

		caso 2:
		escreva("Opção 2 escolhida -> Abrindo Amazon Prime !")
		pare

		caso 3:
		escreva("Opção 3 escolhida -> Abrindo HBO GO !")
		pare

		caso 4:
		escreva("Opção 4 escolhida -> Saindo do programa...")
		pare

		caso contrario:
		escreva ("Você deve escolher uma das opções: 1, 2, 3 ou 4")
		}		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */