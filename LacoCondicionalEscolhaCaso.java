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
		
		System.out.println("Digite o 1� n�mero: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite a opera��o: ");
		operacao = entrada.next().charAt(0);
			
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextDouble();
		
		switch(operacao)
		{
		case'+':
			resultado = numero1 + numero2;
			System.out.println("A soma dos dois n�meros �: " + resultado);
		break;
		case '-':	
			resultado = numero1 + numero2;
			System.out.println("A subtra��o dos dois n�meros �: " + resultado);
		break;	
		case'*':
			resultado = numero1 * numero2;
			System.out.println("A multiplica��o dos dois n�meros �: " + resultado);
		break;
		case '/':	
			resultado = numero1 / numero2;
			System.out.println("A divis�o dos dois n�meros �: " + resultado);
		break;	
		default:
			System.out.println("A opera��o � inv�lida!");
		}
	}
}
