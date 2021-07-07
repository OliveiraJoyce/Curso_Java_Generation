package br.com.generation.aula02;

import java.util.Scanner;

public class LacoCondicionalEscolhaCaso 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		double numero1, numero2;
		char operacao;
		double resultado = 0.0;
		
		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite a operação: ");
		operacao = entrada.next().charAt(0);
			
		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextDouble();
		
		switch(operacao)
		{
		case'+':
			resultado = numero1 + numero2;
			System.out.println("A soma dos dois números é: " + resultado);
		break;
		case '-':	
			resultado = numero1 + numero2;
			System.out.println("A subtração dos dois números é: " + resultado);
		break;	
		case'*':
			resultado = numero1 * numero2;
			System.out.println("A multiplicação dos dois números é: " + resultado);
		break;
		case '/':	
			resultado = numero1 / numero2;
			System.out.println("A divisão dos dois números é: " + resultado);
		break;	
		default:
			System.out.println("A operação é inválida!");
		}
	}
}
