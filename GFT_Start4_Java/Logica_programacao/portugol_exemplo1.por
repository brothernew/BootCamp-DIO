//Função do Algoritmo: calcular a média
//Autor: ThiagoRP

programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,nota4,media
		cadeia aluno

		escreva("Digite o seu nome:")
		leia(aluno)
		escreva("Digite a nota 1:")
		leia(nota1)
		escreva("Digite a nota 1:")
		leia(nota2)
		escreva("Digite a nota 1:")
		leia(nota3)
		escreva("Digite a nota 1:")
		leia(nota4)

		media = (nota1+nota2+nota3+nota4)/4

		escreva("O aluno " + aluno + " obteve a média= " + media)
		//Verifica se a média é maior ou igual a 7
		se(media>=7) {
			escreva("\n" + "Parabéns!... você foi aprovado.")
		}
		//Exibição se média for menor que 7
		senao {
			escreva("\n" + "Você foi reprovado!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */