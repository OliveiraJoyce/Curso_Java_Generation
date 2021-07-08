package br.com.generation.exercicios;

public class ObjetoEx2 
{
		public static void main(String[] args) 
		{
			AviaoEx2 aviao1 = new AviaoEx2();
			
			aviao1.tipoAeronave = "Beeing 787";
			aviao1.tipoClasse = "Executiva";
			aviao1.rota = "Internacional";
			aviao1.numeroAeronave = 33;
			
			aviao1.voar();
			aviao1.pousar();
			
			System.out.println(aviao1.tipoAeronave);
			System.out.println(aviao1.tipoClasse);
			System.out.println(aviao1.rota);
			System.out.println(aviao1.numeroAeronave);
			
			
			
		}
}
