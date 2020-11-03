package Exercicios;

import java.util.Scanner;

public class DuasMatrizes {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int[][] A = new int[4][6];
		int[][] B = new int[4][6];
		int[][] S = new int[4][6];
		int[][] D = new int[4][6];
		
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 5; colunas++)
			{
				System.out.print("Digite um numero para A["+linhas+"]["+colunas+"]:");
				A[linhas][colunas] = obterDados.nextInt();
			}
		}
		
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 5; colunas++)
			{
				System.out.print("Digite um numero para B["+linhas+"]["+colunas+"]:");
				B[linhas][colunas] = obterDados.nextInt();
			}
		}
		System.out.println("");
		
		System.out.print("Matriz S:");
		System.out.println("");
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 5; colunas++)
			{
				S[linhas][colunas] = A[linhas][colunas] + B[linhas][colunas];
				System.out.print(+S[linhas][colunas]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		System.out.println("Matriz D:");
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 5; colunas++)
			{
				D[linhas][colunas] = A[linhas][colunas] - B[linhas][colunas];
				System.out.print(+D[linhas][colunas]+" ");
			}
			System.out.println("");
		}
		
	}
}
