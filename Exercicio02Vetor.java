package ExerciciosVetorMatriz;

import java.util.Scanner;

public class Exercicio02Vetor
{

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int [] lancamento =  new int [10];
		int soma= 0, maiorLancamento = 0;  
		double media = 0.0;
		
		int i, cont = 0 ;
		
		
		for( i =0; i <= 9; i++)
		{
			System.out.println("Digite o valor de lançamento: ");
			
			lancamento[i] = entrada.nextInt();
			soma+= lancamento[i];
			media= soma / 10;
		
		if( lancamento[i] > maiorLancamento)
		{
			maiorLancamento = lancamento[i];
			cont = 0; 
			
		}
		if( lancamento[i] == maiorLancamento )
		{
			cont++;
		}
		}	
		System.out.println("A média dos lançamentos é: " + media);
		System.out.println("A maior pontuação apareceu " + cont + " vezes");
	}

}
