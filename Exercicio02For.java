//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02For 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int par= 0, impar =0, numeroDigitado;
		
		for(int n = 0; n < 10; n++)
		{
			
			System.out.print("Digite os n�meros: ");
			numeroDigitado= entrada.nextInt();
		
			
			if( numeroDigitado % 2 == 0) 
			{
				par++;
			}
			else
			{
				impar++;
			}
				
		}
			System.out.println("O total de n�meros pares �: " + par + "\nO total de n�meros �mpares �: "+ impar);
			
	}
}
