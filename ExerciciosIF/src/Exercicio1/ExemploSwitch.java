package Exercicio1;

import java.util.Scanner;

public class ExemploSwitch {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		int numero = obterDados.nextInt();
		switch(numero)
		{
			case 1 : System.out.println("O n�mero � 1");break; 
			case 2 : System.out.println("O n�mero � 2");break;
			case 3 : System.out.println("O n�mero � 3");break; 
			default : System.out.println("O n�mero n�o � 1, 2 ou 3"); 
		}
	}	
}