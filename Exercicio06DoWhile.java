package br.com.generation.exercicios;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
*final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
*0(zero).(DO...WHILE)*/ 

public class Exercicio06DoWhile 
{

		public static void main(String[] args)
		{
			Scanner entrada = new Scanner(System.in);
			int numero = 0, multiplos= 0, soma=0 ;
			
									
			do
			{
				System.out.print("Digite oum n�mero: ");
				numero = entrada.nextInt();
				
				if( numero % 3 == 0 && numero != 0)
				{
					multiplos++;
					soma+= numero;
				}
			}
				
			while(numero != 0);

			System.out.println("Media multiplos de 3: " + soma / multiplos);
		}
}