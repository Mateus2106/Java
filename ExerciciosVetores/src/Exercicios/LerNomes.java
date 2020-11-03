package Exercicios;

import java.util.Scanner;

public class LerNomes {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		String[] nomes = new String[10];
		int flag = 0;
		for(int i = 0; i <= 9; i++)
		{
			System.out.print("Digite um nome para o vetor nome["+i+"]:");
			nomes[i] = obterDados.next();
		}
		System.out.print("Digite um nome:");
		String nome = obterDados.next();
		for(int i = 0; i <= 9; i++)
		{
			if(nomes[i].equals(nome))
			{
				flag = 1;
			}
		}
		
		if(flag == 1)
		{
			System.out.print("ACHEI!");
		}
		else
		{
			System.out.print("NÃO ACHEI!");
		}
	}
}
