package Exercicio1;

import java.util.Scanner;
 
class IdadePessoa {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o nome da primeira pessoa:");
		String nome = obterDados.next();
		System.out.print("Digite a idade da primeira pessoa:");
		int idade = obterDados.nextInt();
		System.out.print("Digite o nome da segunda pessoa:");
		String nome2 = obterDados.next();
		System.out.print("Digite a idade da segunda pessoa::");
		int idade2 = obterDados.nextInt();

		if(idade >= 0 && idade >= 0)
		{
			if(idade > idade2)
			{
				System.out.print(nome+" é mais velho que "+nome2+"!!");
			}
			if(idade2 > idade)
			{
				System.out.print(nome2+" é mais velho que "+nome+"!!");
			}
			if(idade == idade2)
			{
				System.out.print("Ambos tem a mesma idade!");
			}
		}
		else
		{
			System.out.print("Idade Inválida!!");
		}
	}
}
