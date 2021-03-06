
/**
 * @file      Europeu.java
 * @brief     Contém a classe Europeu com a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     01.04.2018
 * @version   0.0.1
 */
 
 /// PACOTE (BIBLIOTECA) USADO 
 import java.util.Random;
 
/**
 * @class   Europeu
 */ 
public class Europeu extends Castelo{
  
  /// ATRIBUTOS
  
  /**<  Número de paladinos */
  protected int numPaladinos;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão 
   */ 
  public Europeu(){
    super();
    numPaladinos = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   defesas       Pontos de defesa do castelo europeu
   * @param   localizacao   Localização do castelo europeu
   * @param   pontosVida    Quantidade de pontos de vida do castelo europeu
   * @param   nome          Nome do castelo europeu
   * @param   numPaladinos  Número de paladinos no castelo europeu
   */ 
  public Europeu(double defesas, double localizacao, 
                 double pontosVida, String nome, int numPaladinos){
    super(defesas, localizacao, pontosVida, nome);
    this.numPaladinos = numPaladinos;
  }
  
  /**
   * @brief   Mostra os valores contidos nos campos da classe. Além disso,
   *          se pontosVida == 0, então mostra também uma mensagem indicando
   *          que o castelo foi destruído.
   */ 
  public void mostrarSituacao(){
    
    System.out.println("Numero de paladinos: "  + numPaladinos);
    super.mostrarSituacao();
                         
  }
  
  /**
   * @brief   Verifica se há soldados. Caso haja, sorteia aleatoriamente, para
   *          que sejam eliminados entre 2 a 5 soldados. No entanto, se não
   *          houver soldados, chama o esse mesmo método da super classe (Mãe). 
   * @param   dano  Dano infligido
   */ 
  public void ataque(double dano){
    
    /// CASO HAJA ALGUM SAMURAI
    if(numPaladinos > 0){
      Random gerador = new Random();
      
      ///   OBSERVE QUE O GERADOR SERÁ UM INTEIRO ENTRE 0 E 3 PORÉM
      /// JÁ QUE É SOMADO MAIS 2 ESSE INTERVALO RANDÔMICO SERÁ ENTRE 2 E 5
      numPaladinos = numPaladinos - (gerador.nextInt(4) + 2);
    }
    else{
      super.ataque(dano);
    }
  }

  
}