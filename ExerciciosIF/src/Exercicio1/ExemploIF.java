package Exercicio1;

import java.util.Scanner;

public class ExemploIF {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um número:");
		int numero = obterDados.nextInt();
		if(numero > 10)
			System.out.println("O número digitado é maior que 10");
		else if(numero == 10)
			System.out.println("O número digitado é 10");
		else
			System.out.println("O número digitado é menor que 10");
	}	
}