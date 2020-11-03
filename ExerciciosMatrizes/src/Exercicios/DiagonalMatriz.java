package Exercicios;

import java.util.Random;

public class DiagonalMatriz {
	public static void main(String[] args) {
		Random generator = new Random();
		int[][] matriz = new int[10][10];
		int[] diagonal = new int[10];
		
		for(int linhas = 0; linhas <= 9; linhas++)
		{
			for(int colunas = 0; colunas <= 9; colunas++)
			{
				matriz[linhas][colunas] = generator.nextInt(10);
			}
		}
		
		System.out.println("");
		for(int linhas = 0; linhas <= 9; linhas++)
		{
			for(int colunas = 0; colunas <= 9; colunas++)
			{
				System.out.print(+matriz[linhas][colunas]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for(int i = 0; i <= 9; i++)
		{
			diagonal[i] = matriz[i][i];
		}
		
		System.out.println("Os valores da diagonal são:");
		for(int i = 0; i <= 9; i++)
		{
			System.out.print(+diagonal[i]+" ");
		}
	}
}
