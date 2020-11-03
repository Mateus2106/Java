package Exercicio1;

import java.util.Scanner;

public class IdentificarDados {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite a idade do conveniado:");
		int idade = obterDados.nextInt();
		
		if(idade >= 0)
		{
			if(idade < 10)
			{
				System.out.print("O conveniado deverá pagar $180 pelo plano de saúde!");
			}
			if(idade >= 10 && idade <= 30)
			{
				System.out.print("O conveniado deverá pagar $150 pelo plano de saúde!");
			}
			if(idade > 30 && idade <= 60)
			{
				System.out.print("O conveniado deverá pagar $195 pelo plano de saúde!");
			}
			if(idade > 60)
			{
				System.out.print("O conveniado deverá pagar $230 pelo plano de saúde!");
			}
		}
		else
		{
			System.out.print("Idade inválida!!");
		}
	}
}
