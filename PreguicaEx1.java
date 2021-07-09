package br.com.generation.ExercicioHeranca;

public class PreguicaEx1 extends AnimalEx1
{
	
	private String escala;

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}
	
	void pendurar()
	{
		System.out.println("Preguiça pendurando..");
	}
}
