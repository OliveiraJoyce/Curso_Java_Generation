package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, maiorN;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = entrada.nextInt();
		  if(n1>n2 && n1>n3) { //num1 = 100 num2 = 50 num3 = 80
	            if(n2>n3) {
	                System.out.println("A ordem crescente dos n�meros �: " + n3 + ", " + n2 + " e " + n1 + ".");
	            }
	            else if(n3>n2) {
	                System.out.println("A ordem crescente dos n�meros �: " + n2 + ", " + n3 + " e " + n1 + ".");
	            }
	        }

	        else if(n2>n1 && n2>n3) { //num1 = -20 num2 = 90 num3 = 20
	            if(n1>n3) {
	                System.out.println("A ordem crescente dos n�meros �: " + n3 + ", " + n1 + " e " + n2 + ".");
	            }
	            else if(n3>n1) {
	                System.out.println("A ordem crescente dos n�meros �: " + n1 + ", " + n3 + " e " + n2 + ".");
	            }
	        }

	        else if(n3>n1 && n3>n2) { // num1 = 5 num2 = 30 num3 = 200
	            if(n1>n2) {
	                System.out.println("A ordem crescente dos n�meros �: " + n2 + ", " + n1 + " e " + n3 + ".");
	            }
	            else if(n2>n1) {
	                System.out.println("A ordem crescente dos n�meros �: " + n1 + ", " + n2 + " e " + n3 + ".");
	            }
	        }

	    }
	}