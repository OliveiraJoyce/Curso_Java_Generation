/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/
package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05DoWhile
{
	public static void main(String[] args)
	{

		Scanner ler = new Scanner(System.in);
		int numero = 0, soma = 0;
		
		do
		{ 
			System.out.println("Informe um numero para soma (para finalizar a soma digite 0)");
			numero = ler.nextInt();
			soma+= numero;
		}
		
		while( numero != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
		soma = ler.nextInt();
		
	}

}
