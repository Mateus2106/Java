package Exercicio1;

import java.util.Scanner;

public class ExemploIF {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		int numero = obterDados.nextInt();
		if(numero > 10)
			System.out.println("O n�mero digitado � maior que 10");
		else if(numero == 10)
			System.out.println("O n�mero digitado � 10");
		else
			System.out.println("O n�mero digitado � menor que 10");
	}	
}