/**
 * @file    Main.java
 * @brief   Contém a class Main onde é testada as demais classes
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */

/**
 * @class   Main
 */ 
class Main {
  public static void main(String[] args) {
    
    Deposito makro = new Deposito();
    
    System.out.println("O deposito Makro esta vazio? " + makro.naoHaProdutos() + "\n");
    
    if(makro.produtoComMaiorValor() == null){
      System.out.println("Ja que nao ha elemento, nao existe maior elemento\n");
    }
    
    
   makro.adicionandoProduto(new Pizza("Frango com catupiry", 
                                       20, "Habib's",
                                       "Famosa pizza de frango de catupiry!",
                                       "20.08.2018",
                                       "03.08.2018",
                                       "alimenticio",
  "Molho, mussarela, frango desfiado, catupiry e oregano" 
                                     )
                           );
    System.out.println("Ha " + makro.quantidadeDeProdutos() + " produto(s), atualmente, no deposito" );
  }
}