package Exercicio1;

import java.util.Scanner;

public class JornadaTrabalho {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o total de horas trabalhadas em um mês:");
		int horas = obterDados.nextInt();
		System.out.print("Digite o salário do funcionário por hora:");
		int salario = obterDados.nextInt();
		
		if(horas > 160)
		{
			int horasExtras = horas - 160;
			int salarioExtra = (horasExtras * salario) / 2;
			salario = salario * horas;
			salario = salario + salarioExtra;
			System.out.print("O sálario total do funcionário é "+salario);
		}
		else
		{
			salario = salario * horas;
			System.out.print("O sálario total do funcionário é "+salario);
		}
	}
}
