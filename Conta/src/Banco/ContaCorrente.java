package Banco;

public class ContaCorrente {
	  private String titular;
	  private int numeroConta;
	  private int numeroAgencia;
	  private double saldo;
	  private double limiteConta;

	  public double getSaldo() {
	    return saldo;
	  }

	  public void setSaldo(double saldo) {
	    this.saldo = saldo;
	  }

	  public double getLimiteConta() {
	    return limiteConta;
	  }

	  public void setLimiteConta(double limiteConta) {
	    this.limiteConta = limiteConta;
	  }

	  public String getTitular() {
	    return titular;
	  }

	  public void setTitular(String titular) {
	    this.titular = titular;
	  }

	  public int getNumeroConta() {
	    return numeroConta;
	  }

	  public void setNumeroConta(int numeroConta) {
	    this.numeroConta = numeroConta;
	  }

	  public int getNumeroAgencia() {
	    return numeroAgencia;
	  }

	  public void setNumeroAgencia(int numeroAgencia) {
	    this.numeroAgencia = numeroAgencia;
	  }
	  
	  public void depositar(double valor){
	    this.saldo+=valor;
	  }
	  
	  public double saldo(){
	    return this.saldo;
	  }
	  
	  public String saque(double valor){
	    String retorno;
	    if(this.saldo+this.limiteConta>=valor) { 
	      this.saldo -=valor;
	      retorno = "Saque realizado com sucesso";
	    }
	    else{
	      retorno = "Não ha saldo e nem limite suficiente para realizar o saque";
	    }
	    return retorno;
	  }
	}
