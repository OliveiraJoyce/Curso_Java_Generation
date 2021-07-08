package br.com.generation.exercicios;

public class ObjetoEx1
{
	public static void main(String[] args)
	{
		//Instacia -> Criação do objeto
	
		ClienteEx1 Cliente1 = new ClienteEx1();
		ClienteEx1 Cliente2 = new ClienteEx1();
	
				
		//add valores  aos atributos
		Cliente1.nome = "Joana";
		Cliente1.idade = 40;
		Cliente1.sexo = "F";
		
		Cliente2.nome = "Patricia";
		Cliente2.idade = 23;
		Cliente2.sexo = "F";
	
		//Chamamento -> de métodos
		Cliente1.provou();
		Cliente1.pagou();
		Cliente1.comprou();
		
		Cliente2.provou();
		Cliente2.naoComprou();

		//Imprimir
		
		System.out.println( Cliente1.nome);
		System.out.println(Cliente2.nome);
	
	}
}