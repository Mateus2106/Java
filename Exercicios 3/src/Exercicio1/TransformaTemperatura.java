package Exercicio1;

import java.util.Scanner;

public class TransformaTemperatura {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite a temperatura em graus Fahrenheit:");
		float fahrenheit = obterDados.nextFloat();
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("A temperatura em celsius é: "+celsius);
	}
}