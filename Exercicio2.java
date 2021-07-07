package ExercíciosPortugol;

import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int anos, idade = 0, meses = 0, dias= 0, diasTotais = 0;
		
		System.out.println("Informe sua idade em dias: ");
		diasTotais = ler.nextInt();
		
		anos = diasTotais / 365;
		meses = diasTotais % 365 / 28;
		dias = diasTotais % 365 / 28;
				
		System.out.println("Você tem: " + anos + " anos " + meses + " meses e "
							 + dias + " dias de vida");
		
	
	}
}
