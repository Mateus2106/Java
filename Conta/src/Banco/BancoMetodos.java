package Banco;

import java.util.Scanner;

public class BancoMetodos {
  
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
  
  public static int procuraContaCorrrente(ContaCorrente[] contas, int iConta, int numeroConta, int numeroAgencia){
    int retorno = -1;
    for(int i=0;i<iConta&&retorno==-1;i++){
      if(contas[i].getNumeroAgencia() == numeroAgencia && contas[i].getNumeroConta() == numeroConta){
        retorno = i;
      }
    }
    return retorno;
  }
  public static int procuraContaPoupanca(ContaPoupanca[] contas, int iConta, int numeroConta, int numeroAgencia){
    int retorno = -1;
    for(int i=0;i<iConta&&retorno==-1;i++){
      if(contas[i].getNumeroAgencia() == numeroAgencia && contas[i].getNumeroConta() == numeroConta){
        retorno = i;
      }
    }
    return retorno;
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
          //contaPoupanca[iContaPopupanca] = new ContaPoupanca();
          //contaPoupanca[iContaPopupanca].setTitular(obter.next());
          break;
        case 'v':
        case 'V':
          System.out.println("Entre com o tipo de conta c - conta corrente e p - conta poupança");
          tipoConta = obter.next().charAt(0);
          System.out.println("Digite o número da conta: ");
          numeroConta = obter.nextInt();
          System.out.println("Digite o número da agência: ");
          numeroAgencia = obter.nextInt();
          if(tipoConta == 'c'){
            acheiConta = procuraContaCorrrente(contaCorrente, iContaCorrente, numeroConta, numeroAgencia);
            if(acheiConta>=0){
              System.out.println(contaCorrente[acheiConta].getSaldo());
            }
            else{
              System.out.println("Conta inexistente!");
            }
          }
          else if(tipoConta == 'p'){
            acheiConta = procuraContaPoupanca(contaPoupanca, iContaPopupanca, numeroConta, numeroAgencia);
            if(acheiConta>=0)
              System.out.println("O saldo da conta é "+contaPoupanca[acheiConta].saldo());
            else
              System.out.println("Cota inexistente");
          }
          break;
        case 's':
        case 'S':
          System.out.println("Entre com o tipo de conta c - conta corrente e p - conta poupança");
          tipoConta = obter.next().charAt(0);
          System.out.println("Digite o número da conta: ");
          numeroConta = obter.nextInt();
          System.out.println("Digite o número da agência: ");
          numeroAgencia = obter.nextInt();
          System.out.println("Digite o valor que deseja sacar ");
          valor = obter.nextDouble();
          if(tipoConta == 'c'){
            acheiConta = procuraContaCorrrente(contaCorrente, iContaCorrente, numeroConta, numeroAgencia);
            if(acheiConta>=0)
              System.out.println(contaCorrente[acheiConta].saque(valor));
            else
              System.out.println("Conta inexistente!");
          }
          else if(tipoConta == 'p'){
            acheiConta = procuraContaPoupanca(contaPoupanca, iContaPopupanca, numeroConta, numeroAgencia);
            if(acheiConta>=0)
              System.out.println(contaPoupanca[acheiConta].saque(valor));
            else
              System.out.println("Conta inexistente!");
          }
          break;
        case 'd':
        case 'D':
          System.out.println("Entre com o tipo de conta c - conta corrente e p - conta poupança");
          tipoConta = obter.next().charAt(0);
          System.out.println("Digite o número da conta: ");
          numeroConta = obter.nextInt();
          System.out.println("Digite o número da agência: ");
          numeroAgencia = obter.nextInt();
          System.out.println("Digite o valor que deseja depositar ");
          valor = obter.nextDouble();
          if(tipoConta == 'c'){
            acheiConta = procuraContaCorrrente(contaCorrente, iContaCorrente, numeroConta, numeroAgencia);
            if(acheiConta>=0)
              contaCorrente[acheiConta].depositar(valor);
            else
              System.out.println("Conta inexistente!");
          }
          else if(tipoConta == 'p'){
            acheiConta = procuraContaPoupanca(contaPoupanca, iContaPopupanca, numeroConta, numeroAgencia);
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