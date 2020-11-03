package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um número:");
		int numero = obterDados.nextInt();
		if(numero > 0)
			System.out.println("O número digitado é positivo");
		else if(numero == 0)
			System.out.println("O número digitado é nulo");
		else
			System.out.println("O número digitado é negativo");
	}	
}