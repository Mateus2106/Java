package Exercicio1;

import java.util.Scanner;

public class HorasTrabalhadas {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Quanto voc� ganha por hora:");
		float salarioHora = obterDados.nextFloat();
		System.out.print("Quantas horas voc� tem trabalhadas no m�s:");
		float horasTrabalhadas = obterDados.nextFloat();
		float salarioMes = salarioHora*horasTrabalhadas;
		System.out.println("Seu s�lario em um m�s �: "+salarioMes);
	}
}