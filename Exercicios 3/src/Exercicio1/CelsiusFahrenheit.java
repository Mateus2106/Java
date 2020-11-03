package Exercicio1;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		int flag = 0;
		
		while(flag == 0)
		{
			System.out.println("Você deseja converter graus Celcius ou Fahrenheit?");
			System.out.println("Digite 1 para converter em Farenheit!");
			System.out.println("Digite 2 para converter em Celcius!");
			int tipo = obterDados.nextInt();
			if(tipo == 1)
			{
				System.out.println("Digite a temperatura que quer converter em Fahrenheit:");
				int celcius = obterDados.nextInt();
				double resultadoF = 1.8 * celcius + 32;
				System.out.println("Você escolheu converter graus Celcius para Fahrenheit!");
				System.out.println("O resultado é "+resultadoF);
				break;
			}
			if(tipo == 2)
			{
				System.out.println("Digite a temperatura que quer converter em Celcius:");
				int fahrenheit = obterDados.nextInt();
				double resultadoC = (fahrenheit - 32) / 1.8;
				System.out.println("Você escolheu converter graus Fahrenheit para Celcius!");
				System.out.println("O resultado é "+resultadoC);
				break;
			}
			else
			{
				System.out.println("Código errado!!");
			}
		}
		
	}
}