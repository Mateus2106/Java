package Exercicio2;

import java.util.Scanner;

import Exercicio1.Operacoes;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner obter = new Scanner(System.in);
		Operacoes op = new Operacoes();
		
		System.out.print("Digite o valor do lado do quadrado:");
		double num1 = obter.nextDouble();
		double resultado = op.quadrado(num1);
		System.out.println("A área total do quadrado é "+resultado);
	}
}
