package br.com.generation.aula02;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args)
	{
	Scanner entrada = new Scanner(System.in);
	
	double nota1, nota2, media;
	
	System.out.println("Digite a 1� nota: ");
	nota1 = entrada.nextDouble();
	
	System.out.println("Digite a 2� nota: ");
	nota2 = entrada.nextDouble();
	
	media = ((nota1 + nota2) / 2);
	
	if(media >= 6.0 && media <= 10.0)
	{
		System.out.println("\nAprovado: " + "\nM�dia: " + media);
	}
	else if(media >= 3.0 && media <6.0)
	{
		System.out.println("\n Recupera��o." + "\nM�dia: " + media);
	}
	else if(media >= 0.0 &&  media < 3.0) {
		System.out.println("\n Reprovado." + "\nM�dia: " + media);
	}
	else 
	{
		System.out.println("Essa m�dia n�o existe");
	}
	
	
	
	

	}

}
