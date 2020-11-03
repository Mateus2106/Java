package Exercicio1;

import java.util.Scanner;

public class AreaPerimetro {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite a medida de um dos lados do quadrado:");
		float lado = obterDados.nextFloat();
		float area = lado * lado;
		float perimetro = lado * 4;
		System.out.println("A área do quadrado é: "+area);
		System.out.println("O perímetro do quadrado é: "+perimetro);
	}
}