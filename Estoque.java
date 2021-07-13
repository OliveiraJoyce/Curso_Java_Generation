package br.com.generation.exerciciocollection;

public class Estoque {

	//Variaveis 
	private String joias; 
	private double valor;
	
	//Construtor 
	public Estoque(String joias, double valor) {
		super();
		this.joias = joias;
		this.valor = valor;
	}

	public String getJoias() {
		return joias;
	}

	public void setJoias(String joias) {
		this.joias = joias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() 
	{
		return "{Joia: " + this.joias + "," + " R$ " + this.valor +"}";
	
	}
}