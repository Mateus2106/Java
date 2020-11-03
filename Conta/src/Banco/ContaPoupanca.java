package Banco;

public class ContaPoupanca {
	  private String titular;
	  private int numeroConta;
	  private int numeroAgencia;
	  private double saldo;

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
	    if(this.saldo >=valor){
	      this.saldo -=valor;
	      retorno = "Saque realizado com sucesso";
	    }
	    else{
	      retorno = "Saldo insuficiente para realizar a operação";
	    }
	    return retorno;
	  }
	}
