//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
			
			System.out.print("Digite os números: ");
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
			System.out.println("O total de números pares é: " + par + "\nO total de números ímpares é: "+ impar);
			
	}
}
