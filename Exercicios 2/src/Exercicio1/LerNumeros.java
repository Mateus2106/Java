package Exercicio1;

import java.util.Scanner;

public class LerNumeros {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um número inteiro:");
		int x = obterDados.nextInt();
		System.out.print("Digite outro número inteiro:");
		int y = obterDados.nextInt();
		double a = Math.pow(x,y);
		int b = x * y;
		double c = (float) 1 / x;
		int d = y + x / 2;
		int e = x - y;
		int f = x * (-1);
		System.out.println("Letra A = "+a);
		System.out.println("Letra B = "+b);
		System.out.println("Letra C = "+c);
		System.out.println("Letra D = "+d);
		System.out.println("Letra E = "+e);
		System.out.println("Letra F = "+f);
	}
}