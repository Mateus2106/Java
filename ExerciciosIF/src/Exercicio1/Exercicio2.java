package Exercicio1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um n�mero equivalente ao dia da semana:");
		int numero = obterDados.nextInt();
		switch(numero)
		{
			case 1 : 
				System.out.println("Domingo");
				break; 
			case 2 : 
				System.out.println("Segunda-Feira");
				break;
			case 3 : 
				System.out.println("Ter�a-Feira");
				break;
			case 4 : 
				System.out.println("Quarta-Feira");
				break; 
			case 5 : 
				System.out.println("Quinta-Feira");
				break; 
			case 6 : 
				System.out.println("Sexta-Feira");
				break; 
			case 7 : 
				System.out.println("S�bado");
				break; 
			default : 
				System.out.println("O n�mero digitado � inv�lido!!"); 
		}
		if(numero >= 2 && numero <= 6)
		{
			System.out.println("Dia �3til");
		}
		else
			System.out.println("Fim de semana");
	}	
}