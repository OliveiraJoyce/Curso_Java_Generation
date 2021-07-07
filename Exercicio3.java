package ExercíciosPortugol;

import java.util.Scanner;

public class Exercicio3
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, minutos, horas, horasResto;
		
		System.out.println("Insira o tempo total, em segundos, do evento: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		horasResto = segundos % 3600;
		minutos = horasResto / 60;
		segundos = horasResto % 60;
		
		System.out.println("O evento durou " + horas + " horas " + minutos 
					+ " minutos " + segundos + " segundos");
							
	}

}
