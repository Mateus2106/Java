package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		int numero = obterDados.nextInt();
		if(numero > 0)
			System.out.println("O n�mero digitado � positivo");
		else if(numero == 0)
			System.out.println("O n�mero digitado � nulo");
		else
			System.out.println("O n�mero digitado � negativo");
	}	
}