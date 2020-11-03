package Exercicio1;

import java.util.Scanner;

public class HorasTrabalhadas {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora:");
		float salarioHora = obterDados.nextFloat();
		System.out.print("Quantas horas você tem trabalhadas no mês:");
		float horasTrabalhadas = obterDados.nextFloat();
		float salarioMes = salarioHora*horasTrabalhadas;
		System.out.println("Seu sálario em um mês é: "+salarioMes);
	}
}