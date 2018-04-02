/**
 * @file      MapaDoJogo.java
 * @brief     Contém a classe MapaDoJogo com a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     01.04.2018
 * @version   0.0.1
 */
 
/**
 * @class     MapaDoJogo
 */ 
public class MapaDoJogo{
  
  /// ATRIBUTOS
  
  /**<  Tabuleiro do jogo */
  private char tabuleiro[][];
  /**<  Tamanho do tabuleiro */
  private int tamanhoDoTabuleiro;
  
  /// MÉTODOS
  
  /**
   * @brief     Constroi o tabuleiro inicializando com 0 
   */ 
  public MapaDoJogo(int tamanhoDoTabuleiro){
    this.tamanho = tamanho;
    tabuleiro = char int [tamanho][tamanho];
    
    /// INICIALIZANDO O TABULEIRO(MATRIZ) COM TODAS AS POSIÇÕES COM 0
    for(int i = 0; i < tamanho; ++i){
      for(int j = 0; j < tamanho; ++j){
        tabuleiro[i][j] = '0';
      }
    } 
    
  }
  
  
}