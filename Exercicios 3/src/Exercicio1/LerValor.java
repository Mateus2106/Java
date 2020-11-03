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
				System.out.print("O dobro de A é "+a);
				System.out.print("O dobro de B é "+b);
				System.out.print("O dobro de C é "+c);
			}
			default : System.out.print("O valor de i é inválido!!");
		}
	
	}
}
