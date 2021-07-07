package br.com.generation.aula02;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args)
	{
	Scanner entrada = new Scanner(System.in);
	
	double nota1, nota2, media;
	
	System.out.println("Digite a 1º nota: ");
	nota1 = entrada.nextDouble();
	
	System.out.println("Digite a 2º nota: ");
	nota2 = entrada.nextDouble();
	
	media = ((nota1 + nota2) / 2);
	
	if(media >= 6.0 && media <= 10.0)
	{
		System.out.println("\nAprovado: " + "\nMédia: " + media);
	}
	else if(media >= 3.0 && media <6.0)
	{
		System.out.println("\n Recuperação." + "\nMédia: " + media);
	}
	else if(media >= 0.0 &&  media < 3.0) {
		System.out.println("\n Reprovado." + "\nMédia: " + media);
	}
	else 
	{
		System.out.println("Essa média não existe");
	}
	
	
	
	

	}

}
