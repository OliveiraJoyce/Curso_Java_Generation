package br.com.generation.aula02;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
	
		int n1, n2, n3, maiorN;
		
		System.out.println("Digite o 1º número: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		n3 = entrada.nextInt();
		
		if((n1 > n2) &&  (n1 > n3))
		{
			System.out.println(" O numero: " + n1 + " é o maior numero");
		}
		else if((n2 > n1) &&  (n2 > n3))
		{
			System.out.println(" O numero: " + n2 + " é o maior numero");
		}
		else if((n3 > n1) &&  (n3 > n2))
		{
			System.out.println(" O numero: " + n3 + " é o maior numero");
		}
		if((n1 == n2) &&  (n2 == n3))
		{
			System.out.println(" Os numeros são todos iguais a: " + n1);
		}
		


	}

}
