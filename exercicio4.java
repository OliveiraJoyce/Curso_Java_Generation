package br.com.generation.aula02;

import java.util.Scanner;

public class exercicio4 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int impar, par, numero;
		
		System.out.println(" Digite um número: ");
		numero = entrada.nextInt();
		
		if( numero % 2 == 0 )
		{
			System.out.println("Este número é par");
			System.out.println("\nA raiz quadrada é: " + Math.sqrt(numero));
		}
		
		else
		{
			System.out.println("Este número é impar");
			System.out.println("\nO numero: " + numero + " elevado ao quadrado " + Math.pow(numero,2));
		}
	}
}
