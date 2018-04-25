/**
 * @file      Retangulo.java
 * @brief     Contém a classe Retangulo
 * @author    Samuel Lucas de Moura Ferino
 * @since     17.04.2018
 * @version   0.0.1
 */ 

/**
 * @class     Retangulo
 */ 
public class Retangulo extends Forma{
  
  /// ATRIBUTOS
  
  /**<  Lado do retângulo */
  private float lado;
  /**<  Atura do retângulo */
  private float altura;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Retangulo(){
    
    super();
    
    lado = 0;
    altura = 0;
    
  } 
  
  
  /**
   * @brief   Construtor parametrizado
   * @param   lado    Lado do retângulo
   * @param   altura  Altura do retângulo
   */ 
  public Retangulo(float lado, float altura){
    
    super();
    
    this.lado = lado;
    this.altura = altura;
    
  } 
  
  /**
   * @brief     Método get do atributo lado
   * @return    Lado do retângulo
   */ 
  public float getLado(){ return lado; }
  
  /**
   * @brief     Método get do atributo altura
   * @return    Altura do retângulo
   */ 
  public float getAltura(){ return altura; }

  /**
   * @brief     Método set do atributo lado
   * @param     lado  Lado do retângulo
   */ 
  public void setLado(float lado){ this.lado = lado; }
  
  /**
   * @brief     Método set do atributo altura
   * @param     altura  Altura do retângulo
   */ 
  public void setAltura(float altura){ this.altura = altura; }
  
  /**
   * @brief     Calcula a área da forma geométrica
   * @return    Área da forma geométrica
   */ 
  public float calcularArea(){ return lado*altura; }
  
  /**
   * @brief     Calcula o perímetro da forma geométrica
   * @return    Perímetro da forma geométrica
   */ 
  public float calcularPerimetro(){ return (lado*2+altura*2); }
  
  /**
   * @brief     Imprime os atributos
   */ 
  public void print(){
    
    System.out.println( "\nLado: "      + getLado() +
                        "\nAltura: "    + getAltura() +
                        "\nArea: "      + calcularArea() + 
                        "\nPerimetro: " + calcularPerimetro() );
  }

}

