/**
 * @file      Samurai.java
 * @brief     Contém a classe Samurai com a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     01.04.2018
 * @version   0.0.1
 */
 
/**
 * @class     Samurai
 */ 
public class Samurai extends Personagem{
  
  /// ATRIBUTOS 
  
  /**<  */
  protected boolean gritoKiaiMaiorUsado;
  
  /// MÉTODOS
  
  public Samurai(){
    super();
    gritoKiaiMaiorUsado = false;
  }
  
  public Samurai(double hp, double forca, double defesa, double critico
                    double localizacao, String nome){
    if(hp > 7 && forca > 4 &&  defesa > 8 && localizacao > 5 && !nome.equals("") ){
      super(hp, forca, defesa, critico, localizacao, nome);
      gritoKiaiMaiorUsado = false;
    }else{
      Samurai();
    }
    
  }
  
  public void movimentarPeloMapa(){
      
  }
  public boolean atacarPaladino(Paladino paladino){}
  public boolean atacarCasteloEuropeu(Europeu castelo){
    castelo.ataque(forca);
  }
  
}