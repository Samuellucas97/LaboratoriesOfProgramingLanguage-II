/**
 * @file      Forma.java
 * @brief     Contém a classe abstrata Forma
 * @author    Samuel Lucas de Moura Ferino
 * @since     17.04.2018
 * @version   0.0.1
 */ 

/**
 * @class    Forma
 */ 
public abstract class Forma{
  
  /**
   * @brief     Construtor padrão
   */ 
  protected Forma(){ }
  
  /**
   * @brief     Calcula a área da forma geométrica
   * @return    Área da forma geométrica
   */ 
  public abstract float calcularArea();
  
  /**
   * @brief     Calcula o perímetro da forma geométrica
   * @return    Perímetro da forma geométrica
   */ 
  public abstract float calcularPerimetro();
  
  /**
   * @brief     Imprime os atributos
   */ 
  public abstract void print();
}