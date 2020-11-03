package Exercicio1;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		for(int i = 0; i <= 10; i++)
		{
			System.out.println(i);
		}
		System.out.println("For decrescente");
		for(int i = 10; i >= 0; i--)
		{
			System.out.println(i);
		}
	}	
}