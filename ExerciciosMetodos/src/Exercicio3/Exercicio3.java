package Exercicio3;

import java.util.Scanner;

import Exercicio1.Operacoes;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner obter = new Scanner(System.in);
		Operacoes op = new Operacoes();
		
		System.out.print("Digite o valor do raio do circulo:");
		double raio = obter.nextDouble();
		double resultado = op.circulo(raio);
		System.out.println("A área total do circulo é "+resultado);
	}
}
