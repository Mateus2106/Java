package Exercicios;

import java.util.Scanner;

public class VetorInvertido {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] inverso = new int[10];
		int a = 0;
		for(int i = 0; i <= 9; i++)
		{
			System.out.print("Informe o valor de numeros["+i+"]:");
			numeros[i] = obterDados.nextInt();
		}
		for(int i = 9; i >= 0; i--)
		{
			inverso[i] = numeros[a];
			a++;
		}
		for(int i = 0; i <= 9; i++)
		{
			System.out.println("Valor de numeros["+i+"]:"+numeros[i]);
		}
		for(int i = 0; i <= 9; i++)
		{
			System.out.println("Valor de numeros inverso["+i+"]:"+inverso[i]);
		}
	}
}
