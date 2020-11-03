package Exercicios;

import java.util.Scanner;

public class LerVetores {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite a quantidade de números a serem lidos:");	
		int quantidade = obterDados.nextInt();
		if(quantidade > 0 && quantidade <= 10)
		{
			int[] A = new int[quantidade];
			int[] B = new int[quantidade];
			int[] Soma = new int[quantidade];
			for(int i = 0; i < quantidade; i++)
			{
				System.out.print("Digite o valor para A["+i+"]:");
				A[i] = obterDados.nextInt();
			}
			for(int i = 0; i < quantidade; i++)
			{
				System.out.print("Digite o valor para B["+i+"]:");
				B[i] = obterDados.nextInt();
			}
			for(int i = 0; i < quantidade; i++)
			{
				Soma[i] = A[i] + B[i];
				System.out.println("Valor da Soma["+i+"]:"+Soma[i]);
			}
		}
		else
		{
			System.out.print("A quantidade digitada é inválida!!");
		}
	}
}

