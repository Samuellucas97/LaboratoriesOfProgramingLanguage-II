/**
 * @file      Quadrado.java
 * @brief     Contém a classe Quadrado
 * @author    Samuel Lucas de Moura Ferino
 * @since     17.04.2018
 * @version   0.0.1
 */ 

/**
 * @class     Retangulo
 */ 
public class Quadrado extends Retangulo{
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Quadrado(){
    
    super(0,0);
    
  } 
  
  /**
   * @brief   Construtor parametrizado
   * @param   lado    Lado do quadrado
   */ 
  public Quadrado(float lado){
    
    super(lado, lado);
    
  } 

}

