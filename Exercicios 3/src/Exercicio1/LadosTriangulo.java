package Exercicio1;

import java.util.Scanner;

public class LadosTriangulo {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o valor do primeiro lado do tri�ngulo:");
		double primeiro = obterDados.nextDouble();
		System.out.print("Digite o valor do segundo lado do tri�ngulo:");
		double segundo = obterDados.nextDouble();
		System.out.print("Digite o valor do terceiro lado do tri�ngulo:");
		double terceiro = obterDados.nextDouble();
		if(primeiro != 0 && segundo != 0 && terceiro != 0)
		{
			if(primeiro <= (segundo + terceiro) && segundo <= (primeiro + terceiro) && terceiro <= (primeiro + segundo))
			{
				if(primeiro == segundo && segundo == terceiro)
				{
					System.out.print("Este � um tri�ngulo Equil�tero!");
				}
				if((primeiro == segundo && segundo != terceiro) || (primeiro == terceiro && terceiro != segundo) || (segundo == terceiro && terceiro != primeiro))
				{
					System.out.print("Este � um tri�ngulo Is�sceles!");
				}
				if(primeiro != segundo && segundo != terceiro && primeiro != terceiro)
				{
					System.out.print("Este � um tri�ngulo Escaleno!");
				}
			}
			else
			{
				System.out.print("Os valores digitados n�o formam um tri�ngulo!");
			}
		}
		else
		{
			System.out.print("Os valores n�o podem ser igual a 0!");
		}
	}
}
