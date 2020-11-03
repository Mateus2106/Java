package Exercicio1;

import java.util.Scanner;

public class CalculadoraLuciana {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite um valor inteiro:");
		int x = obterDados.nextInt();
		System.out.print("Digite outro valor inteiro:");
		int y = obterDados.nextInt();
		System.out.print("Digite a operação desejada:");
		char operador = obterDados.next().charAt(0);
		
		if(operador == '+')
		{
			double resultado = x + y;
			System.out.print("A resposta é "+resultado);
		}
		if(operador == '-')
		{
			double resultado = x - y;
			System.out.print("A resposta é "+resultado);
		}
		if(operador == '*')
		{
			double resultado = x * y;
			System.out.print("A resposta é "+resultado);
		}
		if(operador == '/')
		{
			double resultado = x / y;
			System.out.print("A resposta é "+resultado);
		}
	}
}
