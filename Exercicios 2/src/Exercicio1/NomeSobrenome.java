package Exercicio1;
import java.util.Scanner;

public class NomeSobrenome {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite seu nome:");
		String nome = obterDados.next();
		System.out.print("Digite seu sobrenome:");
		String sobrenome = obterDados.next();
		System.out.println("Bem vindo "+nome+" "+sobrenome);
	}
}
