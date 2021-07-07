package ExercíciosPortugol;

import java.util.Scanner;

public class Exercicio7 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, E, f, x, y;
		
	System.out.println("Digite o valor de a: ");
	a = ler.nextDouble();
	
	System.out.println("Digite o valor de b: ");
	b = ler.nextDouble();
	
	System.out.println("Digite o valor de c: ");
	c = ler.nextDouble();
	
	System.out.println("Digite o valor de d: ");
	d = ler.nextDouble();
	
	System.out.println("Digite o valor de E: ");
	E = ler.nextDouble();
	
	System.out.println("Digite o valor de f: ");
	f = ler.nextDouble();
	
	x = ((c * E) - (b * f)) / ((a *E) - (b *d));
	
	y = ((a * f) - (c * d)) / ((a *E) - (b *d));
	
	System.out.println("Valor de x é: " + x);
	System.out.println("Valor de y é:" + y);
	
	}

}
