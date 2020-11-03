package Exercicio1;

public class Operacoes {
	public double soma(double n1, double n2) {
		return n1+n2;
	}
	
	public double subtracao(double n1, double n2) {
		return n1-n2;
	}
	
	public double multiplicacao(double n1, double n2) {
		return n1*n2;
	}
	
	public double divisao(double n1, double n2) {
		double resultado = 0;
		if(n2 != 0)
			resultado = n1/n2;
		return resultado;
	}
	
	public double exponenciacao(double n1) {
		return n1*n1;
	}
	
	public double quadrado(double n1) {
		return n1*n1;
	}
	
	public double circulo(double n1) {
		 return Math.PI * Math.pow(n1, 2);
	}
}
