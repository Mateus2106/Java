package Exercicio1;

import java.util.Scanner;

public class LerValor {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o valor de i:");
		int i = obterDados.nextInt();
		System.out.print("Digite o valor de a:");
		int a = obterDados.nextInt();
		System.out.print("Digite o valor de b:");
		int b = obterDados.nextInt();
		System.out.print("Digite o valor de c:");
		int c = obterDados.nextInt();
		
		switch(i)
		{
			case 1 : {
				
			}
			case 2 : {
				
			}
			case 3 : {
				a = a + a;
				b = b + b;
				c = c + c;
				System.out.print("O dobro de A � "+a);
				System.out.print("O dobro de B � "+b);
				System.out.print("O dobro de C � "+c);
			}
			default : System.out.print("O valor de i � inv�lido!!");
		}
	
	}
}
