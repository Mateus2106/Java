package Exercicio1;

import java.util.Scanner;

public class ExemploSwitch {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um número:");
		int numero = obterDados.nextInt();
		switch(numero)
		{
			case 1 : System.out.println("O número é 1");break; 
			case 2 : System.out.println("O número é 2");break;
			case 3 : System.out.println("O número é 3");break; 
			default : System.out.println("O número não é 1, 2 ou 3"); 
		}
	}	
}