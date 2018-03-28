/**
 * @file      Main.java
 * @brief     Contém a classe Main
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1
 */ 

/**
 * @class   Main
 */ 
class Main {
  public static void main(String[] args) {
    boolean operacaoConfirmada;
    
    ///   TESTES
    
    System.out.println("\nInicio dos testes...\n\n");
  
    System.out.println("\nTestando a classe ContaBancaria...\n\n");
    ContaBancaria novaConta = new ContaBancaria("Samuel", 17804, 250.5);
    System.out.println(novaConta.toString());
    
    operacaoConfirmada = novaConta.depositar(300);
  
    /// CASO TENHA SIDO EFETUADO UM DEPÓSITO, HAVERÁ UMA IMPRESSÃO DOS DADOS NA TELA
    if(operacaoConfirmada){
      System.out.println("\n\n"+ novaConta.toString());
    }
  
    operacaoConfirmada = novaConta.sacar(270);
    
    /// CASO TENHA SIDO EFETUADO UM SAQUE, HAVERÁ UMA IMPRESSÃO DOS DADOS NA TELA
    if(operacaoConfirmada){
      System.out.println("\n\n"+ novaConta.toString());
    }
    
    System.out.println("\nTestando a classe ContaEspecial...\n\n");

    ContaEspecial novaConta2 = new ContaEspecial("Ferino", 92804, 7000.5, 2000.1);
    System.out.println(novaConta2.toString());
    
    operacaoConfirmada = novaConta2.depositar(300);
  
    /// CASO TENHA SIDO EFETUADO UM DEPÓSITO, HAVERÁ UMA IMPRESSÃO DOS DADOS NA TELA
    if(operacaoConfirmada){
      System.out.println("\n\n"+ novaConta2.toString());
    }
  
    operacaoConfirmada = novaConta2.sacar(7800);
    
    /// CASO TENHA SIDO EFETUADO UM SAQUE, HAVERÁ UMA IMPRESSÃO DOS DADOS NA TELA
    if(operacaoConfirmada){
      System.out.println("\n\n"+ novaConta2.toString());
    }
    
    System.out.println("\nTestando a classe ContaPoupanca...\n\n");


    ContaPoupanca novaConta3 = new ContaPoupanca("Fee", 98804, 20000.5, 20);
    System.out.println(novaConta3.toString());
    
    operacaoConfirmada = novaConta3.calculaNovoSaldo(30);
    
    if(operacaoConfirmada){
      System.out.println("\n\n"+ novaConta3.toString());
    }
    
    System.out.println("\nTestando a classe Banco...\n");

    Banco bradesco = new Banco();
    bradesco.add(novaConta);
    bradesco.add(novaConta2);
    bradesco.add(novaConta3);
    
    bradesco.imprime();
  
    bradesco.remove(98804);    

    bradesco.imprime();
    
    System.out.println("\nFim dos testes... ");
  }
}
