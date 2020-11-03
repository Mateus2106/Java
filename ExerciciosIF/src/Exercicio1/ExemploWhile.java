package Exercicio1;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int numero = 0;
		while(numero <= 100)
		{
			System.out.println(numero);
			numero++;
		}
	}	
}