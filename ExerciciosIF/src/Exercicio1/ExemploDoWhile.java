package Exercicio1;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println(numero);
			numero++;
		}while(numero <= 10);
		
		numero = 0;
		do {
			System.out.println(numero);
			numero++;
		}while(numero < 0);
	}	
}