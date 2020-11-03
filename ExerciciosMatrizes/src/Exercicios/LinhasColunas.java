package Exercicios;

import java.util.Scanner;

public class LinhasColunas {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int[][] G = new int[3][3];
		int[] SL = new int[3];
		int[] SC = new int[3];
		
		for(int linhas = 0; linhas <= 2; linhas++)
		{
			for(int colunas = 0; colunas <= 2; colunas++)
			{
				System.out.print("Digite um numero para G["+linhas+"]["+colunas+"]:");
				G[linhas][colunas] = obterDados.nextInt();
				if(linhas == 0)
					SL[0] = SL[0] + G[linhas][colunas];
				if(linhas == 1)
					SL[1] = SL[1] + G[linhas][colunas];
				if(linhas == 2)
					SL[2] = SL[2] + G[linhas][colunas];
				if(colunas == 0)
					SC[0] = SC[0] + G[linhas][colunas];
				if(colunas == 1)
					SC[1] = SC[1] + G[linhas][colunas];
				if(colunas == 2)
					SC[2] = SC[2] + G[linhas][colunas];
			}
		}
		
		System.out.print("Soma das linhas: ");
		for(int i = 0; i <= 2; i++)
		{
			System.out.print(+SL[i]+" ");
		}
		
		System.out.println("");
		
		System.out.print("Soma das colunas: ");
		for(int i = 0; i <= 2; i++)
		{
			System.out.print(+SC[i]+" ");
		}
	}
}
