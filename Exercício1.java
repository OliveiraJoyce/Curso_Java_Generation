package Exerc�ciosPortugol;

import java.util.Scanner;

public class Exerc�cio1 
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, meses, dias, diasTotais;
		int soma;
		
		System.out.println("Quantos anos voc� tem: ");
		idade = ler.nextInt();
		
		System.out.println("Quantos meses voc� tem: ");
		meses = ler.nextInt();
		
		System.out.println("Quantos dias voc� tem: ");
		dias = ler.nextInt();
		
		diasTotais = 365*idade + 28*meses + dias;
		
		System.out.println("Voc� tem aproximadamente " + diasTotais + " de dias vividos");
	}
}
