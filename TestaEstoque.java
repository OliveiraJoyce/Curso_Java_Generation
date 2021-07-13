package br.com.generation.exerciciocollection;

import java.util.ArrayList;

public class TestaEstoque {

		public static void main(String[] args) {
			Estoque a = new Estoque("Anel", 20.5);
			Estoque b = new Estoque("Brincos", 10.7);
			Estoque c = new Estoque("Colar", 15.89);
			Estoque d = new Estoque("Diamante", 100.99);
			
			ArrayList<Estoque> produtos = new ArrayList<>();
			
			produtos.add(a);
			produtos.add(b);
			produtos.add(c);
			produtos.add(d);
			
			System.out.println(produtos);
			System.out.println("\n");
			
			produtos.remove(c);
			System.out.println(produtos);
			
			
			
		}
}
