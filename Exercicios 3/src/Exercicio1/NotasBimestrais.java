package Exercicio1;
import java.util.Scanner;

public class NotasBimestrais {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite sua primeira nota:");
		float primeiraNota = obterDados.nextFloat();
		System.out.print("Digite sua segunda nota:");
		float segundaNota = obterDados.nextFloat();
		System.out.print("Digite sua terceira nota:");
		float terceiraNota = obterDados.nextFloat();
		System.out.print("Digite sua quarta nota:");
		float quartaNota = obterDados.nextFloat();
		float media = (primeiraNota+segundaNota+terceiraNota+quartaNota)/4;
		System.out.println("Sua média é "+media);
	}
}
