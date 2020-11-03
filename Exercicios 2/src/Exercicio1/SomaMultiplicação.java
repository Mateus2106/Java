package Exercicio1;

import java.util.Scanner;

public class SomaMultiplicação {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um número:");
		float x = obterDados.nextFloat();
		System.out.print("Digite outro número:");
		float y = obterDados.nextFloat();
		float soma = x + y;
		float multiplicacao = x * y;
		System.out.println("O resultado da soma é: "+soma);
		System.out.println("O resultado da multiplicação é: "+multiplicacao);
	}
}