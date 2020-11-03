package Exercicio1;
import java.util.Scanner;

public class ConverteMetros {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite a quantidade em metros:");
		float metros = obterDados.nextFloat();
		float centimetros = metros*100;
		System.out.println("A quantidade é "+centimetros+" centímetros");
	}
}
