package Exercicios;

import java.util.Scanner;

public class VetorAX {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int[] A = new int[10];
		int[] M = new int[10];
		System.out.print("Informe o valor de X:");
		int X = obterDados.nextInt();
		for(int i = 0; i <= 9; i++)
		{
			System.out.print("Informe o valor de A["+i+"]:");
			A[i] = obterDados.nextInt();
		}
		for(int i = 0; i <= 9; i++)
		{
			M[i] = A[i]*X;
			System.out.println("O valor de M["+i+"]:"+M[i]);
		}
	}
}
