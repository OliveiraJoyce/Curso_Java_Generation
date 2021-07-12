package br.com.generation.aula02;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int infantil, junvenil, adulto, idade;
		
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		
		if( idade >=10 && idade <=14)
		{
		System.out.println("Sua categoria é infantil");
		}
		else if( idade >=15 && idade <=17)
		{
		System.out.println("Sua categoria é juvenil");
		}
		else if ( idade >=18 && idade <=25)
		{
		System.out.println("Sua categoria é adulto");
		}
		else 
		{
			System.out.println("Você não se encaixa em nenhuma categoria");
		}
		
	
	}
}
