package Banco;

import java.util.Scanner;

public class Banco {
  
  public static ContaCorrente novaContaCorrente(){
    Scanner obter = new Scanner(System.in);
    System.out.println("Entre com o nome do titular: ");
    String nome = obter.next();
    System.out.println("Entre com o número da conta: ");
    int numeroConta = obter.nextInt();
    System.out.println("Entre com o número da agência: ");
    int numeroAgencia = obter.nextInt();
    System.out.println("Entre com o limite de conta: ");
    double limiteConta = obter.nextDouble();
    ContaCorrente conta = new ContaCorrente();
    conta.setTitular(nome);
    conta.setNumeroAgencia(numeroAgencia);
    conta.setNumeroConta(numeroConta);
    conta.setLimiteConta(limiteConta);
    return conta;
  }
  public static ContaPoupanca novaContaPoupanca(){
    Scanner obter = new Scanner(System.in);
    System.out.println("Entre com o nome do titular: ");
    String nome = obter.next();
    System.out.println("Entre com o número da conta: ");
    int numeroConta = obter.nextInt();
    System.out.println("Entre com o número da agência: ");
    int numeroAgencia = obter.nextInt();
    System.out.println("Entre com o depoisito inicial: ");
    double saldoInicial = obter.nextDouble();
    ContaPoupanca conta = new ContaPoupanca();
    conta.setTitular(nome);
    conta.setNumeroAgencia(numeroAgencia);
    conta.setNumeroConta(numeroConta);
    conta.depositar(saldoInicial);
    return conta;
  }
   
  public static void main(String[] args) {
    ContaCorrente[] contaCorrente = new ContaCorrente[10];
    ContaPoupanca[] contaPoupanca = new ContaPoupanca[10];
    int iContaCorrente = 0, iContaPopupanca = 0;
    Scanner obter = new Scanner(System.in);
    char opcao;
    do{
      System.out.println("Selecione uma opção");
      System.out.println("Criar conta corrente c ");
      System.out.println("Criar conta poupança p ");
      System.out.println("Verificar saldo conta v");
      System.out.println("Realizar saque s");
      System.out.println("Realizar um deposito d");
      System.out.println("Sair e");
      opcao = obter.next().charAt(0);
      ContaCorrente contaCorrenteAux = new ContaCorrente();
      ContaPoupanca contaPoupancaAux = new ContaPoupanca();
      char tipoConta;
      int numeroConta;
      int numeroAgencia;
      int acheiConta = 0;
      double valor;
      
      switch(opcao){
        case 'c':
        case 'C':
          contaCorrente[iContaCorrente++] = novaContaCorrente();
          break;
        case 'p':
        case 'P':
          contaPoupanca[iContaPopupanca++] = novaContaPoupanca();
          break;
        case 'v':
        case 'V':
          System.out.println("Entre com o tipo de conta c - conta corrente e p - conta c poupança");
          tipoConta = obter.next().charAt(0);
          System.out.println("Digite o número da conta: ");
          numeroConta = obter.nextInt();
          System.out.println("Digite o número da agência: ");
          numeroAgencia = obter.nextInt();
          if(tipoConta == 'c'){
            acheiConta = -1;
            for(int i=0;i<iContaCorrente&&acheiConta==-1;i++){
              if(contaCorrente[i].getNumeroAgencia() == numeroAgencia 
                      && contaCorrente[i].getNumeroConta() == numeroConta){
                contaCorrenteAux = contaCorrente[i];
                acheiConta = i;
              }
            }
            if(acheiConta>=0){
              System.out.println(contaCorrente[acheiConta].getSaldo());
            }
            else{
              System.out.println("Conta inexistente!");
            }
          }
          else if(tipoConta == 'p'){
            acheiConta = -1;
            for(int i=0;i<iContaPopupanca&&acheiConta==-1;i++){
              if(contaPoupanca[i].getNumeroAgencia() == numeroAgencia 
                      && contaPoupanca[i].getNumeroConta() == numeroConta){ 
              }
            }
            if(acheiConta>=0)
              System.out.println("O saldo da conta é "+contaPoupanca[acheiConta].saldo());
            else
              System.out.println("Cota inexistente");
          }
          break;
        case 's':
        case 'S':
          System.out.println("Entre com o tipo de conta c - conta corrente e p - conta cpoupança");
          tipoConta = obter.next().charAt(0);
          System.out.println("Digite o número da conta: ");
          numeroConta = obter.nextInt();
          System.out.println("Digite o número da agência: ");
          numeroAgencia = obter.nextInt();
          System.out.println("Digite o valor que deseja sacar ");
          valor = obter.nextDouble();
          if(tipoConta == 'c'){
            acheiConta = -1;
            for(int i=0;i<iContaCorrente&&acheiConta==-1;i++){
              if(contaCorrente[i].getNumeroAgencia() == numeroAgencia 
                      && contaCorrente[i].getNumeroConta() == numeroConta){
                acheiConta = i;
              }
            }
            if(acheiConta>=0)
              System.out.println(contaCorrente[acheiConta].saque(valor));
            else
              System.out.println("Conta inexistente!");
          }
          else if(tipoConta == 'p'){
            acheiConta = -1;
            for(int i=0;i<iContaPopupanca&&acheiConta==-1;i++){
              if(contaPoupanca[i].getNumeroAgencia() == numeroAgencia 
                      && contaPoupanca[i].getNumeroConta() == numeroConta){
                acheiConta = i;
              }
            }
            if(acheiConta>=0)
              System.out.println(contaPoupanca[acheiConta].saque(valor));
            else
              System.out.println("Conta inexistente!");
          }
          break;
        case 'd':
        case 'D':
          System.out.println("Entre com o tipo de conta c - conta corrente e p - conta cpoupança");
          tipoConta = obter.next().charAt(0);
          System.out.println("Digite o número da conta: ");
          numeroConta = obter.nextInt();
          System.out.println("Digite o número da agência: ");
          numeroAgencia = obter.nextInt();
          System.out.println("Digite o valor que deseja depositar ");
          valor = obter.nextDouble();
          if(tipoConta == 'c'){
            acheiConta = -1;
            for(int i=0;i<iContaCorrente&&acheiConta==-1;i++){
              if(contaCorrente[i].getNumeroAgencia() == numeroAgencia 
                      && contaCorrente[i].getNumeroConta() == numeroConta){
                acheiConta = i;
              }
            }
            if(acheiConta>=0)
              contaCorrente[acheiConta].depositar(valor);
            else
              System.out.println("Conta inexistente!");
          }
          else if(tipoConta == 'p'){
            acheiConta = -1;
            for(int i=0;i<iContaPopupanca&&acheiConta==-1;i++){
              if(contaPoupanca[i].getNumeroAgencia() == numeroAgencia 
                      && contaPoupanca[i].getNumeroConta() == numeroConta){
                acheiConta = i;
              }
            }
            if(acheiConta>=0)
              contaPoupanca[acheiConta].depositar(valor);
            else
              System.out.println("Conta inexistente!");
          }
          break;
      }
    }
    while(opcao != 'e');
  }
}