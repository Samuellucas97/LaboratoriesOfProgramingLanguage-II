

/**
 * @file      Japones.java
 * @brief     Contém a classe Japones com a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     01.04.2018
 * @version   0.0.1
 */
 
 /// PACOTE (BIBLIOTECA) USADO 
 import java.util.Random;
 
/**
 * @class     Japones
 */ 
public class Japones extends Castelo{
  
  /// ATRIBUTOS
  
  /**<  Número de samurais */
  protected int numSamurais;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão 
   */ 
  public Japones(){
    super();
    numSamurais = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   defesas       Pontos de defesa do castelo japonês
   * @param   localizacao   Localização do castelo japonês
   * @param   pontosVida    Quantidade de pontos de vida do castelo japonês
   * @param   nome          Nome do castelo japonês
   * @param   numSamurais   Número de paladinos no castelo japonês
   */ 
  public Japones(double defesas, double localizacao, 
                 double pontosVida, String nome, int numSamurais){
    super(defesas, localizacao, pontosVida, nome);
    this.numSamurais = numSamurais;
  }
  
  /**
   * @brief   Mostra os valores contidos nos campos da classe. Além disso,
   *          se pontosVida == 0, então mostra também uma mensagem indicando
   *          que o castelo foi destruído.
   */ 
  public void mostrarSituacao(){
    
    System.out.println("Numero de samurais: "  + numSamurais);
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
    if(numSamurais > 0){
      Random gerador = new Random();
      
      ///   OBSERVE QUE O GERADOR SERÁ UM INTEIRO ENTRE 0 E 3 PORÉM
      /// JÁ QUE É SOMADO MAIS 2 ESSE INTERVALO RANDÔMICO SERÁ ENTRE 2 E 5
      numSamurais = numSamurais - (gerador.nextInt(4) + 2);
    }
    else{
      super.ataque(dano);
    }
  }
  
}