package Exercicios;

import java.util.Random;

public class MatrizSoma {
	public static void main(String[] args) {
		Random generator = new Random();
		int[][] Soma = new int[4][4];
		int Soma1 = 0;
		int Soma2 = 0;
		int Soma3 = 0;
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 3; colunas++)
			{
				Soma[linhas][colunas] = generator.nextInt(100);
				Soma3 = Soma3 + Soma[linhas][colunas];
			}
		}
		
		for(int colunas = 0; colunas <= 3; colunas++)
		{
			Soma1 = Soma1 + Soma[2][colunas];
		}
		
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			Soma2 = Soma2 + Soma[linhas][1];
		}
		
		for(int linhas = 0; linhas <= 3; linhas++)
		{
			for(int colunas = 0; colunas <= 3; colunas++)
			{
				System.out.print(+Soma[linhas][colunas]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("A soma de toda a linha 3 é: "+Soma1);
		System.out.println("A soma de toda a coluna 2 é: "+Soma2);
		System.out.println("A soma de todos os elementos da matriz é: "+Soma3);
	}
}
