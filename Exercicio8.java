package ExercíciosPortugol;

import java.util.Scanner;

public class Exercicio8
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		double valorFabrica, valorJuros, valorFinal;
		
		System.out.println("Informa o valor de fábrica: ");
		valorFabrica = ler.nextDouble();
		
		valorJuros = valorFabrica * 73 / 100;
		valorFinal = valorFabrica + valorJuros;
		
		System.out.println("O valor do produto para o consumidor é de: " + valorFinal);
	}

}
