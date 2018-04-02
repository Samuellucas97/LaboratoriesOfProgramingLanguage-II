/**
 * @file      Castelo.java
 * @brief     Contém a classe Castelo com a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     01.04.2018
 * @version   0.0.1
 */
 
/**
 * @class     Castelo
 */ 
public class Castelo{
  
  /// ATRIBUTOS

  /**<   Pontos de defesas do Castelo */
  protected double defesas;
  /**<   Localização do castelo */
  protected double localizacao;
  /**<   Quantidade de pontos de vida do castelo */
  protected double pontosVida;
  /**<   Nome do castelo */
  protected String nome;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Castelo(){
    defesas = 0;
    localizacao = 0;
    pontosVida = 0;
    nome = new String();
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   defesas       Pontos de defesa do Castelo
   * @param   localizacao   Localização do castelo
   * @param   pontosVida    Quantidade de pontos de vida do castelo  
   * @param   nome          Nome do castelo
   */ 
  public Castelo(double defesas, double localizacao, 
                 double pontosVida, String nome){
    this.defesas = defesas;
    this.localizacao = localizacao;
    this.pontosVida = pontosVida;
    this.nome = new String(nome);
  }
    
  /**
   * @brief   Mostra os valores contidos nos campos da classe. Além disso,
   *          se pontosVida == 0, então mostra também uma mensagem indicando
   *          que o castelo foi destruído.
   */ 
  public void mostrarSituacao(){
    
    System.out.println("Nome: "               + nome +
                       "\nPontos de defesa: " + defesas + 
                       "\nLocalizacao: "      + localizacao + 
                       "\nPontos de vida: "   + pontosVida);
      
    if( pontosVida <= 0){
      System.out.println("\n\nO CASTELO FOI DESTRUIDO!");
    }    
                         
  }
  
  /**
   * @brief   Verifica se há pontos de defesa. Caso haja o reduz 
   *          senão, reduz os pontos de vida  
   * @param   dano  Dano infligido
   */ 
  public void ataque(double dano){
    /// O DANO INFLIGIDO FOI MENOR QUE AS DEFESAS
    if(dano < defesas){
      defesas = defesas - dano;
    }
    /// O DANO INFLIGIDO FOI IGUAL AS DEFESAS    
    else if( dano == defesas){
      defesas = 0;
    }
    ///   O DANO INFLIGIDO FOI MAIOR QUE AS DEFESAS PORÉM 
    /// O DANO MENOS AS DEFESAS FOI MENOR QUE OS PONTOS DE VIDA
    else if(dano > defesas && (dano-defesas) < pontosVida){
      pontosVida = pontosVida - dano - defesas;
      defesas = 0;
    }
    ///   O DANO INFLIGIDO FOI IGUAL OU MAIOR QUE AS DEFESAS E OS 
    /// PONTOS DE VIDA SOMADOS JUNTOS 
    else{
      defesas = 0;
      pontosVida = 0;
    } 
  }
  
}