package Exercicio1;

import java.util.Scanner;

public class AreaPerimetro {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite a medida de um dos lados do quadrado:");
		float lado = obterDados.nextFloat();
		float area = lado * lado;
		float perimetro = lado * 4;
		System.out.println("A �rea do quadrado �: "+area);
		System.out.println("O per�metro do quadrado �: "+perimetro);
	}
}