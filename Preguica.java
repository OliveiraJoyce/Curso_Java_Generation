package br.com.generation.exerciciopolimorfismo;

import java.util.Scanner;

public class Preguica implements Animal
{

	@Override
	public void classe() {
		System.out.println("Classe Mamifero");
		
	}

	@Override
	public void nome() {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		System.out.println("Nome: ");
		nome = ler.next();
					
	}

	@Override
	public void som() {
		System.out.println("A preguiça emite um som");
		
	}

}
