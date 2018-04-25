/**
 * @file      Main.java
 * @brief     Contém a classe Main e alguns testes com a classe Calculadora
 * @author    Samuel Lucas de Moura Ferino
 * @since     24.04.2018
 * @version   0.0.3
 */ 
 
/**
 * @class     Main
 */ 
class Main {
  public static void main(String[] args) {
  
    Calculadora hp = new Calculadora();
  
    System.out.println(
      "**********************TESTANDO***************************\n");
    
    
    hp.operacao();
    
    hp.imprimirHistorico();
    
  }
}