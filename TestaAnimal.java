package br.com.generation.exerciciopolimorfismo;

public class TestaAnimal
{
	public static void main(String[] args)
	{
		Animal a = new Cachorro();
		
		System.out.println("===CACHORRO===");
		
		a = new Cachorro();
		a.classe();
		a.nome();
		a.som();
		System.out.println("\n");
		
		a = new Cavalo();
		System.out.println("===CAVALO===");
		
		a.classe();
		a.nome();
		a.som();
		System.out.println("\n");
		
		a= new Preguica();
		System.out.println("===PREGUIÇA===");
		
		a.classe();
		a.nome();
		a.som();
		
		
	}
}
