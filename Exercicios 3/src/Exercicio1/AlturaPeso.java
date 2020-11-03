package Exercicio1;

import java.util.Scanner;

public class AlturaPeso {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Qual a sua altura:");
		float altura = obterDados.nextFloat();
		System.out.print("Qual o seu peso:");
		float peso = obterDados.nextFloat();
		double IMC = peso/(altura*altura);
		System.out.println("Seu IMC é: "+IMC);
	}
}