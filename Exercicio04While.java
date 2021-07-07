/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04While 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int entrevistados = 0, pessoaCalma = 0, mulherNervosa = 0, homemAgressivo = 0, outrosCalmo = 0, maior = 0, menor = 0; 
		int idade, sexo, humor; 
		
		while(entrevistados <2)
		{
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.print("Qual seu sexo: 1- Feminino 2- Masculino 3- Outros ");
			sexo = ler.nextInt();
			
			System.out.print("Você se considera uma pessoa: 1- Calma(o)  2- Nervosa(o) 3- Agressiva(o) ");
			humor = ler.nextInt();
			
			entrevistados++;
			
			if( humor == 1)
			{
				pessoaCalma++;
			}
			else if ( sexo == 1 && humor == 2) 
			{
				mulherNervosa++;
			}
			else if (sexo == 2 && humor == 3)
			{
				homemAgressivo++;
			}
			else if (sexo == 3 && humor == 1)
			{
				outrosCalmo++;
			}
			else if ( idade > 40 && humor == 2)
			{
				maior++;
			}
			else if (idade < 18 && humor == 1)
			{
				menor++;
				
			}
			
		}
		System.out.println("O número de pessoas calmas " +  pessoaCalma);
		System.out.println("O número de mulheres nervosas " + mulherNervosa);
		System.out.println("O número de homens agressivos " + homemAgressivo);
		System.out.println("O número de outros calmos " + outrosCalmo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos " + maior);
		System.out.println("O número de pessoas calmas com menos de 18 anos " +  menor);
	
			
	}
}
