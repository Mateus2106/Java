package Exercicio1;
import java.util.Scanner;

public class LerNumero {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		int numero = obterDados.nextInt();
		System.out.println("O n�mero informado foi "+numero);
	}
}


