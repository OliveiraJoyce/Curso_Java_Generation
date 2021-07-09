package br.com.generation.ExercicioHeranca;

import java.util.Scanner;

public class TestaTodosEx1
{

	public static void main(String[] args)
	{
		
		
		CachorroEx1 cachorro = new CachorroEx1();
		CavaloEx1 cavalo = new CavaloEx1();
		PreguicaEx1 preguica = new PreguicaEx1();
		
		cachorro.setClasse("Mamifero");
		cachorro.setNome("Tiana");
		cachorro.setIdade(4);
		cachorro.setSom("Latir");
		cachorro.setCorrer("Corre");
		
		
		cavalo.setClasse("Mamifero");
		cavalo.setNome("Spirit");
		cavalo.setIdade(10);
		cavalo.setSom("Relincha");
		cavalo.setCorrer("Galopar");
		
		preguica.setClasse("Mamifero");
		preguica.setNome("Pri");
		preguica.setIdade(8);
		preguica.setSom("Não identificado");
		preguica.setEscala("Escala");
		
	
		System.out.println("====Dados Animal====");
		System.out.println("Classe: " + cachorro.getClasse());
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade() + " anos");
		System.out.println("Qual som o animal faz: " + cachorro.getSom());
		System.out.println("Este animal: " + cachorro.getCorrer());
		
		System.out.println("\n====Dados Animal====");
		System.out.println("Classe: " + preguica.getClasse());
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade()+ " anos");
		System.out.println("Qual som o animal faz: " + preguica.getSom());
		System.out.println("Este animal: " + preguica.getEscala());
		
		System.out.println("\n====Dados Animal====");
		System.out.println("Classe: " + cavalo.getClasse());
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade() + " anos");
		System.out.println("Qual som o animal faz: " + cavalo.getSom());
		System.out.println("Este animal: " + cavalo.getCorrer());
		
	}

}
