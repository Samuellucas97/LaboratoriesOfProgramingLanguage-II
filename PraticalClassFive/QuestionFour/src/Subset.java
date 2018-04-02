/** 
 * @file      Subset.java
 * @brief     Contém a classe Subset e a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino 
 * @since     31.03.2018
 * @version   0.0.4
 */ 

/// PACOTE (BIBLIOTECA) USADO
import java.util.ArrayList;

/**
 * @class     Subset
 */ 
public class Subset{
  
  /// ATRIBUTOS
  
  /**<        Sequência de inteiros a ser analisada */
  private ArrayList<Integer> sequencia;
  
  /// MÉTODOS 
  
  /**
   * @brief   Construtor parametrizado
   * @param   sequencia   Sequência a ser analisada
   */ 
  public Subset(ArrayList<Integer> sequencia ){
    this.sequencia = new ArrayList<Integer>(sequencia);
  }
  
  /**
   * @brief   Imprime uma subsequência de tamanho 1 que possui o somatório de 
   *          seus elementos igual a x
   * @param   valorBuscado    Valor a ser buscado como resultado do somatório  
   *          da subsequência
   */
  private boolean arrayTamanhoUm(int valorBuscado){
    /**<      Encontrou a sequência */
    boolean encontrouASubSequencia = false;
      
    System.out.println();
    for(int j = 0; j < sequencia.size(); ++j){
      if(sequencia.get(j) == valorBuscado){
        System.out.println(" "+ sequencia.get(j));
        encontrouASubSequencia = true;
      }  
    }
    
    ///   CASO TENHA ENCONTRADO AO MENOS UMA SUBSEQUÊNCIA VÁLIDA, 
    /// RETORNA TRUE, SE NÃO FALSE
    if(encontrouASubSequencia)
      return true;
    else   
      return false;
      
  }
  
  /**
   * @brief   Imprime uma subsequência a qual possui o somatório de 
   *          seus elementos igual a x
   * @param   valorBuscado    Valor a ser buscado como resultado do somatório  
   *          da subsequência
   * @param   tamanho         Tamanho da subsequência a ser analisada
   * @param   count           Quantidade de iterações necessárias
   */
  private boolean arrayTamanhoN(int valorBuscado, int tamanho, int count){

    ///   CASO BASE          ---------------------------------------------
    if(tamanho == 1)
    {
      return arrayTamanhoUm(valorBuscado);
    }
    
    /**<  Total da soma */
    int totalDaSoma = 0;
    
    for(int i = 0; i < count; ++i ){
      for(int j = 0; j < tamanho; ++j){
        totalDaSoma = totalDaSoma + sequencia.get(j+i);
      }
     
      if(totalDaSoma == valorBuscado){
        System.out.println();
        for(int k = 0; k < tamanho; ++k){
          System.out.print(" " + sequencia.get(k+i) + " ");  
        }  
        System.out.println();
      }
      totalDaSoma = 0;
    }

    return arrayTamanhoN(valorBuscado, tamanho-1, ++count);
  }     

  /**
   * @brief   Imprime uma subsequência a qual possui o somatório de 
   *          seus elementos igual a x
   * @param   x   Valor a ser buscado como resultado do somatório da 
   *          subsequência
   */
  public void subsetSum(int x){
    arrayTamanhoN(x, sequencia.size(), 1);
  }

}