package Exercicio1;

import java.util.Scanner;

public class JornadaTrabalho {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o total de horas trabalhadas em um m�s:");
		int horas = obterDados.nextInt();
		System.out.print("Digite o sal�rio do funcion�rio por hora:");
		int salario = obterDados.nextInt();
		
		if(horas > 160)
		{
			int horasExtras = horas - 160;
			int salarioExtra = (horasExtras * salario) / 2;
			salario = salario * horas;
			salario = salario + salarioExtra;
			System.out.print("O s�lario total do funcion�rio � "+salario);
		}
		else
		{
			salario = salario * horas;
			System.out.print("O s�lario total do funcion�rio � "+salario);
		}
	}
}
