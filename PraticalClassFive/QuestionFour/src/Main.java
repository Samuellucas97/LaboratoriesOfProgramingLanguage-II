/** 
 * @file      Main.java
 * @brief     Contém a classe Main com alguns testes da classe Subset
 * @author    Samuel Lucas de Moura Ferino 
 * @since     31.03.2018
 * @version   0.0.4
 */ 

/// PACOTE (BIBLIOTECA) USADO
import java.util.ArrayList;

/**
 * @class     Main
 */ 
class Main {
  public static void main(String[] args) {
    
    /// TESTANDO 
    
    /**<      Sequência a ser analisada */
    ArrayList<Integer> sequencia = new ArrayList<Integer>();
    sequencia.add(4);
    sequencia.add(2);
    sequencia.add(3);
    sequencia.add(5);
    sequencia.add(1);
    sequencia.add(0);

    System.out.print("Sequencia: ");
    for(int i: sequencia){
      System.out.print(i + " ");
    }  
    System.out.println();
    
    Subset a = new Subset(sequencia);
    a.subsetSum(9);

  }
}


/**                       - EXEMPLO: SEQUÊNCIA (4,2,3,5,1,0)
  
  4 2 3 5 1 0             - Sequência de tamanho = 6 precisa de 1  iterações
  
  4 2 3 5 1               - Sequência de tamanho = 5 precisa de 2 iterações
  2 3 5 1 0
   
  4 2 3 5                 - Sequência de tamanho = 4 precisa de 3  iterações
  2 3 5 1
  3 5 1 0
  
  4 2 3                   - Sequência de tamanho = 3 precisa de 4 iterações  
  2 3 5
  3 5 1
  5 1 0
  
  4 2                     - Sequência de tamanho = 2 precisa de 5 iterações
  2 3
  3 5
  5 1
  1 0
  
  4                       - Sequência de tamanho = 1 precisa de 6 iterações
  2   
  3   
  5   
  1    
  9
*/