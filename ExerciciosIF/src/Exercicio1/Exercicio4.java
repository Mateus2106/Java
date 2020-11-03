package Exercicio1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.print("Digite um número:");
			numero = obterDados.nextInt();
		}while(numero<=10);
		
	}	
}