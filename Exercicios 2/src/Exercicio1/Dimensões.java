package Exercicio1;

import java.util.Scanner;

public class Dimensões {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.print("Digite o comprimento da cozinha:");
		float comprimento = obterDados.nextFloat();
		System.out.print("Digite a largura da cozinha:");
		float largura = obterDados.nextFloat();
		System.out.print("Digite a altura da cozinha:");
		float altura = obterDados.nextFloat();
		System.out.print("Digite area ocupada pelas portas e janelas:");
		float portasJanelas = obterDados.nextFloat();
		float area1 = altura * largura;
		float area2 = altura * comprimento;
		float area3 = area1 + area2;
		float area = area3 - portaJanelas;
		float cozinha = area / (1,5 * 1,5);
	}
}