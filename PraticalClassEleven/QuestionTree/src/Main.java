/**
 * @file      Main.java
 * @brief     Contém a classe Main com a os teste das classes Castelo, Europeu
 * @author    Samuel Lucas de Moura Ferino
 * @since     01.04.2018
 * @version   0.0.1
 */
 
/**
 * @class     Main
 */ 
class Main {
  public static void main(String[] args) {
    
    /// TESTANDO
    
    Castelo a = new Castelo(320, 3.1, 100, "Dover");
    a.mostrarSituacao();
    System.out.println();
    
    Europeu b = new Europeu(820, 4.1, 200, "Alnwick", 2);
    b.mostrarSituacao();
    System.out.println();
  }
}