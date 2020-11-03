package Exercicios;

import java.util.Scanner;

public class programaMes {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.println("Digite o nome do mês:");
		String mes = obterDados.next();
		switch(mes) 
		{
			case "janeiro" : 
				System.out.println("Este mês corresponde ao número 1");
				break;
			case "fevereiro" : 
				System.out.println("Este mês corresponde ao número 2");
				break;
			case "março" : 
				System.out.println("Este mês corresponde ao número 3");
				break;
			case "abril" : 
				System.out.println("Este mês corresponde ao número 4");
				break;
			case "maio" : 
				System.out.println("Este mês corresponde ao número 5");
				break;
			case "junho" : 
				System.out.println("Este mês corresponde ao número 6");
				break;
			case "julho" : 
				System.out.println("Este mês corresponde ao número 7");
				break;
			case "agosto" : 
				System.out.println("Este mês corresponde ao número 8");
				break;
			case "setembro" : 
				System.out.println("Este mês corresponde ao número 9");
				break;
			case "outubro" : 
				System.out.println("Este mês corresponde ao número 10");
				break;
			case "novembro" : 
				System.out.println("Este mês corresponde ao número 11");
				break;
			case "dezembro" : 
				System.out.println("Este mês corresponde ao número 12");
				break;
			default :
				System.out.println("Este mês é inválido!!");
		}
	}	
}