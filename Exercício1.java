package ExercíciosPortugol;

import java.util.Scanner;

public class Exercício1 
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, meses, dias, diasTotais;
		int soma;
		
		System.out.println("Quantos anos você tem: ");
		idade = ler.nextInt();
		
		System.out.println("Quantos meses você tem: ");
		meses = ler.nextInt();
		
		System.out.println("Quantos dias você tem: ");
		dias = ler.nextInt();
		
		diasTotais = 365*idade + 28*meses + dias;
		
		System.out.println("Você tem aproximadamente " + diasTotais + " de dias vividos");
	}
}
