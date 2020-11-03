package Exercicios;

import java.util.Scanner;

public class ElementosVetores {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int[] inteirosteste = new int[100];
		int[] inteiros = new int[100];
		int i = 0;
		int condicao = 1;
		int tamanho = 0;
		do{
			System.out.print("Digite os elementos do vetor:");	
			inteirosteste[i] = obterDados.nextInt();
			if(inteirosteste[i] >= 0)
			{
				if(inteirosteste[i] != 0)
					inteiros[i] = inteirosteste[i];
				condicao = inteirosteste[i];
				tamanho++;
				i++;
			}
			if(tamanho == 100)
				condicao = 0;
		}while(condicao != 0);
		
		for(i = 0; i < tamanho - 1; i++)
		{
			System.out.println("Elemento da posição "+i+":"+inteiros[i]);
		}
	}
}
