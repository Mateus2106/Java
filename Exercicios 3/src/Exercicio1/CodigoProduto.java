package Exercicio1;

import java.util.Scanner;

public class CodigoProduto {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.println("|-------------------|-----------------|");
		System.out.println("| C�digo do produto | Nome do produto |");
		System.out.println("|         1         | 	  Caderno     |");
		System.out.println("|         2         |      L�pis      |");
		System.out.println("|         3         |     Borracha    |");
		System.out.println("|   Qualquer outro  |     Diversos    |");
		System.out.println("|-------------------|-----------------|");
		System.out.print("Digite o c�digo do produto conforme a tabela:");
		int codigo = obterDados.nextInt();
		switch(codigo)
		{
			case 1 : System.out.print("O produto que corresponde ao c�digo digitado � o caderno!");break;
			case 2 : System.out.print("O produto que corresponde ao c�digo digitado � o l�pis!");break;
			case 3 : System.out.print("O produto que corresponde ao c�digo digitado � a borracha!");break;
			default : System.out.print("O produto que corresponde ao c�digo digitado s�o diversos!");
		}
	}
}
