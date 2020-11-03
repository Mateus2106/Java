package Exercicio1;
import java.util.Scanner;

public class LerNumero {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = obterDados.nextInt();
		System.out.println("O número informado foi "+numero);
	}
}


