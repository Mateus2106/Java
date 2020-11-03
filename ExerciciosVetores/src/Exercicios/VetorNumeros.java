package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class VetorNumeros {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		Random gerador = new Random();
		int[] numeros = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int a = 0;
		int b = 0;
				
		for(int i = 0; i <= 19; i++)
		{
			numeros[i] = gerador.nextInt(100);
		}
		for(int i = 0; i <= 19; i++)
		{
			if(numeros[i] % 2 == 0)
			{
				par[a] = numeros[i];
				a++;
			}
			else
			{
				impar[b] = numeros[i];
				b++;
			}
		}
		for(int i = 0; i <= 19; i++)
		{
			System.out.println("O valor de numeros["+i+"]:"+numeros[i]);
		}
		for(int i = 0; i <= a - 1; i++)
		{
			System.out.println("O valor par["+i+"]:"+par[i]);
		}
		for(int i = 0; i <= b - 1; i++)
		{
			System.out.println("O valor impar["+i+"]:"+impar[i]);
		}
		
	}
}
