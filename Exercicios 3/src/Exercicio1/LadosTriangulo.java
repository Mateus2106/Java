package Exercicio1;

import java.util.Scanner;

public class LadosTriangulo {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o valor do primeiro lado do triângulo:");
		double primeiro = obterDados.nextDouble();
		System.out.print("Digite o valor do segundo lado do triângulo:");
		double segundo = obterDados.nextDouble();
		System.out.print("Digite o valor do terceiro lado do triângulo:");
		double terceiro = obterDados.nextDouble();
		if(primeiro != 0 && segundo != 0 && terceiro != 0)
		{
			if(primeiro <= (segundo + terceiro) && segundo <= (primeiro + terceiro) && terceiro <= (primeiro + segundo))
			{
				if(primeiro == segundo && segundo == terceiro)
				{
					System.out.print("Este é um triângulo Equilátero!");
				}
				if((primeiro == segundo && segundo != terceiro) || (primeiro == terceiro && terceiro != segundo) || (segundo == terceiro && terceiro != primeiro))
				{
					System.out.print("Este é um triângulo Isósceles!");
				}
				if(primeiro != segundo && segundo != terceiro && primeiro != terceiro)
				{
					System.out.print("Este é um triângulo Escaleno!");
				}
			}
			else
			{
				System.out.print("Os valores digitados não formam um triângulo!");
			}
		}
		else
		{
			System.out.print("Os valores não podem ser igual a 0!");
		}
	}
}
