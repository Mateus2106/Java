package Exercicio1;

import java.util.Scanner;

public class SomaMultiplica��o {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		float x = obterDados.nextFloat();
		System.out.print("Digite outro n�mero:");
		float y = obterDados.nextFloat();
		float soma = x + y;
		float multiplicacao = x * y;
		System.out.println("O resultado da soma �: "+soma);
		System.out.println("O resultado da multiplica��o �: "+multiplicacao);
	}
}