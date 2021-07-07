package ExercíciosPortugol;

import java.util.Scanner;

public class Exercicio4
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Insira o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("Insira o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("Insira o valor de C: ");
		c = ler.nextDouble();
		
		r = Math.pow((a + b),2.0);
		
		s = Math.pow((b + c), 2.0);
		
		d = (r + s) / 2;
		
		
		System.out.println("Resultado da expressão  D é: " + d );
	
		
	}
}
