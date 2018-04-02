/**
 * @file      Personagem.java
 * @brief     Contém a classe Personagem com a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     01.04.2018
 * @version   0.0.1
 */
 
/**
 * @class     Personagem
 */ 
public class Personagem{
  
  /// ATRIBUTOS 
  
  /**<  */
  protected double hp;
  protected double forca;
  protected double defesa;
  protected double critico;
  protected double localizacao;
  protected String nome;
  
  /// MÉTODOS
  
  public Personagem(){
    hp = 0;
    forca = 0;
    defesa = 0;
    critico = 0;
    localizacao = 0;
    nome = new String();
  }
  
  public Personagem(double hp, double forca, double defesa, double critico
                    double localizacao, String nome){
    this.hp = hp;
    this.forca = forca;
    this.defesa = defesa;
    this.critico = critico;
    this.localizacao = localizacao;
    this.nome = new String(nome);
  }
  
  public void movimentarPeloMapa(){
      
  }
  
}