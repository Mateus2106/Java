package Exercicio1;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o valor da base do triângulo:");
		float base = obterDados.nextFloat();
		System.out.print("Digite o valor da altura do triângulo:");
		float altura = obterDados.nextFloat();
		float area = base * altura / 2;
		System.out.println("A área do triângulo é: "+area);
	}
}