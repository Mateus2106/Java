package Exercicio1;

import java.util.Scanner;

public class NotaAluno {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite sua primeira nota:");
		double primeira = obterDados.nextDouble();
		System.out.print("Digite sua segunda nota:");
		double segunda = obterDados.nextDouble();
		System.out.print("Digite sua terceira nota:");
		double terceira = obterDados.nextDouble();
		double media = (primeira + segunda + terceira) / 3;
		
		if(media > 0)
		{
			if(media >= 7)
			{
				System.out.print("Aluno aprovado!");
			}
			if(media >=5 && media < 7)
			{
				System.out.print("Aluno em recuperação!");
			}
			if(media < 5)
			{
				System.out.print("Aluno reprovado!");
			}
		}
		else
		{
			System.out.print("You burro man!");
		}
	}
}
