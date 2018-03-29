/**
 * @file	Prova.java
 * @brief	Contém a classe Prova e a implementação de seus métodos 
 * @author	Samuel Lucas de Moura Ferino
 * @since	28.03.2018
 * @version	0.0.3
 */

/**
 * @class	Prova
 */	  
public class Prova{
  
  /// ATRIBUTOS
  
  /**<  Parte 1 de 2 da nota */
  private double notaParte1;
  /**<  Parte 2 de 2 da nota */
  private double notaParte2;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão 
   */ 
  public Prova(){
    notaParte1 = 0;
    notaParte2 = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   notaParte1  Parte 1 de 2 da nota
   * @param   notaParte2  Parte 2 de 2 da nota
   */
  public Prova(double notaParte1, double notaParte2){
    this.notaParte1 = notaParte1;
    this.notaParte2 = notaParte2;
  }
  
  /**
   * @brief   Método get do atributo notaParte1
   * @return  Parte 1 de 2 da nota
   */ 
  public double getNotaParte1(){
    return notaParte1;
  }
  
  /**
   * @brief   Método get do atributo notaParte2
   * @return  Parte 2 de 2 da nota
   */
   public double getNotaParte2(){
    return notaParte2;
  }
  
  /**
   * @brief   Calcula a nota total da prova através de média aritmética
   *  @return Nota final na prova
   */ 
  public double calcularNotaTotal(){
    double media = ( notaParte1 + notaParte2 )/2;
    
    if( media > 10 )
      return 10.0;
    
    return media;  
  }
}
