package Exercicios;

import java.util.Scanner;

public class programaMes {
	public static void main(String[] args) {
		Scanner obterDados = new Scanner(System.in);
		System.out.println("Digite o nome do m�s:");
		String mes = obterDados.next();
		switch(mes) 
		{
			case "janeiro" : 
				System.out.println("Este m�s corresponde ao n�mero 1");
				break;
			case "fevereiro" : 
				System.out.println("Este m�s corresponde ao n�mero 2");
				break;
			case "mar�o" : 
				System.out.println("Este m�s corresponde ao n�mero 3");
				break;
			case "abril" : 
				System.out.println("Este m�s corresponde ao n�mero 4");
				break;
			case "maio" : 
				System.out.println("Este m�s corresponde ao n�mero 5");
				break;
			case "junho" : 
				System.out.println("Este m�s corresponde ao n�mero 6");
				break;
			case "julho" : 
				System.out.println("Este m�s corresponde ao n�mero 7");
				break;
			case "agosto" : 
				System.out.println("Este m�s corresponde ao n�mero 8");
				break;
			case "setembro" : 
				System.out.println("Este m�s corresponde ao n�mero 9");
				break;
			case "outubro" : 
				System.out.println("Este m�s corresponde ao n�mero 10");
				break;
			case "novembro" : 
				System.out.println("Este m�s corresponde ao n�mero 11");
				break;
			case "dezembro" : 
				System.out.println("Este m�s corresponde ao n�mero 12");
				break;
			default :
				System.out.println("Este m�s � inv�lido!!");
		}
	}	
}