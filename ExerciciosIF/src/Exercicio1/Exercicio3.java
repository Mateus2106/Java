package Exercicio1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o n�mero que voc� quer a tabuada:");
		int numero = obterDados.nextInt();
		int i = 1;
		while(i <= 10)
		{
			System.out.println(numero+" * "+i+" = "+(numero * i));
			i++;
		}
	}	
}