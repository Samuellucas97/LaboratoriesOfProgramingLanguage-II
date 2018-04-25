/**
 * @file      Circulo.java
 * @brief     Contém a classe Circulo
 * @author    Samuel Lucas de Moura Ferino
 * @since     17.04.2018
 * @version   0.0.1
 */ 

/**
 * @class     Circulo
 */ 
public class Circulo extends Forma{
  
  /// ATRIBUTO
  
  /**<  Raio do círculo */
  private float raio;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Circulo(){
    super();
    raio = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   raio  Raio do círculo
   */ 
  public Circulo(float raio){
    this.raio = raio;
  }
  
  /**
   * @brief     Método get do atributo raio
   * @return    Raio do círculo
   */ 
  public float getRaio(){ return raio; }
  
  /**
   * @brief     Método set do atributo raio
   * @param     raio  Raio do círculo
   */ 
  public void setRaio(float raio){ this.raio = raio; }
  
  /**
   * @brief     Calcula a área do círculo
   * @return    Área do círculo
   */ 
  public float calcularArea(){ return (float)( Math.PI*Math.pow(raio,2) ); }
  
  /**
   * @brief     Calcula o perímetro do círculo
   * @return    Perímetro do círculo
   */ 
  public float calcularPerimetro(){ return (float)(2*Math.PI*(double)raio); }

  /**
   * @brief     Imprime os atributos
   */ 
  public void print(){
    
    System.out.println( "\nRaio: " + getRaio() +
                        "\nArea: " + calcularArea() + 
                        "\nPerimetro: " + calcularPerimetro() );
  }
  
}