package Exercicio1;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o raio do circulo:");
		float raio = obterDados.nextFloat();
		double area = raio*raio*Math.PI;
		System.out.println("A �rea do c�rculo � "+area);
	}
}

