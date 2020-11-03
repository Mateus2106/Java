package Exercicio1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		for(int i = 0; i <= 100; i++)
		{
			if(i % 2 == 0)
				System.out.println(i);
		}
	}	
}