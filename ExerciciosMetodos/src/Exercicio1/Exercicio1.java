package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner obter = new Scanner(System.in);
		Operacoes op = new Operacoes();
		
		System.out.print("Digite qual a operação desejada entre + - * / ^ :");
		char operacao = obter.next().charAt(0);
		
		switch(operacao)
		{
			case '+' : {
				System.out.print("Digite o primeiro valor:");
				double num1 = obter.nextDouble();
				System.out.print("Digite o segundo valor:");
				double num2 = obter.nextDouble();
				double resultado = op.soma(num1, num2);
				System.out.println(+num1+" + "+num2+" = "+resultado);
			}break;
			case '-' : {
				System.out.print("Digite o primeiro valor:");
				double num1 = obter.nextDouble();
				System.out.print("Digite o segundo valor:");
				double num2 = obter.nextDouble();
				double resultado = op.subtracao(num1, num2);
				System.out.println(+num1+" - "+num2+" = "+resultado);
			}break;
			case '*' : {
				System.out.print("Digite o primeiro valor:");
				double num1 = obter.nextDouble();
				System.out.print("Digite o segundo valor:");
				double num2 = obter.nextDouble();
				double resultado = op.multiplicacao(num1, num2);
				System.out.println(+num1+" * "+num2+" = "+resultado);
			}break;
			case '/' : {
				System.out.print("Digite o primeiro valor:");
				double num1 = obter.nextDouble();
				System.out.print("Digite o segundo valor:");
				double num2 = obter.nextDouble();
				double resultado = op.divisao(num1, num2);
				System.out.println(+num1+" / "+num2+" = "+resultado);
			}break;
			case '^' : {
				System.out.print("Digite um valor:");
				double num1 = obter.nextDouble();
				double resultado = op.exponenciacao(num1);
				System.out.println("O resultado da exponenciação de "+num1+" é "+resultado);
			}break;
			default : {
				System.out.println("Erro, operação inválida!!");
			}
		}
	}
}
