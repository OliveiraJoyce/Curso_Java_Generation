/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
*atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

package ExerciciosVetorMatriz;

import java.util.Scanner;

public class Exercicio01Vetor 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		int [] pontuacao =  new int [5];
		int maiorPontuacao = 0;
		
		int i;
		
		System.out.println("Digite a pontuação da atividade: ");
		//Adiciona valores no vetor
		for(i = 0; i <pontuacao.length ; i++)
		{
			pontuacao[i] = entrada.nextInt();		
		if(pontuacao[i] > maiorPontuacao)
		{
			maiorPontuacao = pontuacao[i];
		}
				
		}
		//Coletando os valores do vetor 
		for(i = 0; i < pontuacao.length; i++)
		{
			System.out.println(pontuacao[i]);
		}
		System.out.println(" A maior pontuação é: " + maiorPontuacao);
		

		}
}