package Exercicios;

import java.util.Scanner;

public class MultiplicarDiagonal {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int[][] inteiros = new int[4][4];	
		
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 3; colunas++)
			{
				System.out.print("Digite um número para inteiros["+linhas+"]["+colunas+"]:");
				inteiros[linhas][colunas] = obterDados.nextInt();
			}
		}
		
		System.out.print("Digite um número inteiro:");
		int inteiro = obterDados.nextInt();
		
		inteiros[0][0] = inteiros[0][0] * inteiro;
		inteiros[1][1] = inteiros[1][1] * inteiro;
		inteiros[2][2] = inteiros[2][2] * inteiro;
		inteiros[3][3] = inteiros[3][3] * inteiro;	
		
		System.out.println("");
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 3; colunas++)
			{
				System.out.print(+inteiros[linhas][colunas]+" ");
			}
			System.out.println("");
		}
	}
}
