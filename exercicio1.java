package br.com.generation.aula02;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
	
		int n1, n2, n3, maiorN;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = entrada.nextInt();
		
		if((n1 > n2) &&  (n1 > n3))
		{
			System.out.println(" O numero: " + n1 + " � o maior numero");
		}
		else if((n2 > n1) &&  (n2 > n3))
		{
			System.out.println(" O numero: " + n2 + " � o maior numero");
		}
		else if((n3 > n1) &&  (n3 > n2))
		{
			System.out.println(" O numero: " + n3 + " � o maior numero");
		}
		if((n1 == n2) &&  (n2 == n3))
		{
			System.out.println(" Os numeros s�o todos iguais a: " + n1);
		}
		


	}

}
