package Exercicios;

import java.util.Scanner;

public class LerInteiros {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int[][] D = new int[2][3];
		int flag = 0;
		int colunat = 0;
		int linhat = 0;
		for(int linhas = 0; linhas <= 1; linhas++)
		{
			for(int colunas = 0; colunas <= 2; colunas++)
			{
				System.out.print("Digite um numero para D["+linhas+"]["+colunas+"]:");
				D[linhas][colunas] = obterDados.nextInt();
			}
		}
		System.out.print("Digite um numero inteiro para X:");
		int X = obterDados.nextInt();
		for(int linhas = 0; linhas <= 1; linhas++)
		{
			for(int colunas = 0; colunas <= 2; colunas++)
			{
				if(X == D[linhas][colunas])
				{
					flag++;
					colunat = colunas;
					linhat = linhas;
				}
			}
		}
		if(flag == 1)
		{
			System.out.print("O valor de X existe na posição ["+linhat+"]["+colunat+"] da matriz!!");
		}
		else if(flag == 0)
		{
			System.out.print("O valor de X não existe na matriz!!");
		}
		else
		{
			System.out.print("O valor de X existe "+flag+" vezes na matriz!!");
		}
	}
}
