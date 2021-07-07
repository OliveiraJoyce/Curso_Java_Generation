/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03While 
{

	public static void main(String[] args) 
	{
		   Scanner ler = new Scanner(System.in);
		   int idade = 0, menor = 0 , maior = 0; 
		   
		   while( idade != -99)
		   {
			   System.out.println("Digite sua idade: ");
			   idade = ler.nextInt();
			   
			   if( idade >0 && idade< 21)
			   { menor++;
			   	System.out.println("Menor de 21 anos");
			   }
			   else if ( idade > 50)
			   {
				   maior++;
				   System.out.println("Maior de 50 anos");
			   }
			   else 
			   {
				   System.out.println("Fora da contagem");
			   }
		   }
		   	System.out.println("O total de menores de 21 anos é: " + menor);
		   	System.out.println("O total de maiores de 50 anos é: " + maior);
	}
}
