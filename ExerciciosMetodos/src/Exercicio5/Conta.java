package Exercicio5;

public class Conta {
	String[] nomeP = new String[20];
	int[] numeroP = new int[20];
	String[] nomeC = new String[20];
	int[] numeroC = new int[20];
	double[] saldoC = new double[20];
	double[] saldoP = new double[20];
	double[] limiteC = new double[20];
	double[] depositoP = new double[20];
	double[] titularP = new double[20];
	double[] titularC = new double[20];
	int correnteI;
	int poupancaI;
	
	//Corrente
	
	void definirPosicaoC(int setPosicao) {
		correnteI = setPosicao;
	}
	
	public String obterNomeC() {
		return nomeC[correnteI];
	}
	
	void definirNomeC(String setNomeC) {
		nomeC[correnteI] = setNomeC;
	}
	
	public int numeroC() {
		return numeroC[correnteI];
	}
	
	void definirNumeroC(int setNumeroC) {
		numeroC[correnteI] = setNumeroC;
	}
	
	public double saldoC() {
		return saldoC[correnteI];
	}
	
	void definirSaldoC(double definirSaldoC) {
		saldoC[correnteI] = definirSaldoC;
	}
	
	public double limiteC() {
		return limiteC[correnteI];
	}
	
	void difinirLimiteC(double definirLimiteC) {
		limiteC[correnteI] = definirLimiteC;
	}
	
	public double titularC() {
		return titularC[correnteI];
	}
	
	void definirTitularC(double definirTitularC) {
		titularC[correnteI] = definirTitularC;
	}
	
	//Poupança
	
	void definirPosicaoP(int setPosicao) {
		poupancaI = setPosicao;
	}
	
	public String obterNomeP() {
		return nomeP[poupancaI];
	}
	
	void definirNomeP(String setNomeP) {
		nomeP[poupancaI] = setNomeP;
	}
	
	public int numeroP() {
		return numeroP[poupancaI];
	}
	
	void definirNumeroP(int setNumeroP) {
		numeroP[poupancaI] = setNumeroP;
	}
	
	public double depositoP() {
		return depositoP[poupancaI];
	}
	
	void definirDepositoP(double definirDepositoP) {
		depositoP[poupancaI] = definirDepositoP;
	}	
	
	public double titularP() {
		return titularP[correnteI];
	}
	
	void definirTitularP(double definirTitularP) {
		titularP[correnteI] = definirTitularP;
	}
	
	public double saldoP() {
		return saldoP[correnteI];
	}
	
	void definirSaldoP(double definirSaldoP) {
		saldoP[correnteI] = definirSaldoP;
	}
}
