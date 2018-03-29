/**
 * @file      Veiculo.java
 * @brief     Contém a classe Veiculo e a implementação de seus métodos   
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /**
  * @class  Veiculo
  */
public class Veiculo{
  
  /// ATRIBUTOS
  
  /**<  Marca do veículo */
  private String marca;
  /**<  Modelo do veículo */
  private String modelo;
  /**<  Número da placa do veículo */
  private String numeroDaPlaca;
  
  /// MÉTODOS
  
  /**
   * @brief Construtor padrão
   */ 
  public Veiculo(){
    marca = new String();
    modelo = new String();
    numeroDaPlaca = new String();
  }
  /**
   * @brief   Construtor parametrizado
   * @param   marca         Marca do veículo
   * @param   modelo        Modelo do veículo
   * @param   numeroDaPlaca Número da placa do veículo
   */ 
  public Veiculo(String marca, String modelo, String numeroDaPlaca){
    this.marca = new String(marca);
    this.modelo = new String(modelo);
    this.numeroDaPlaca = new String(numeroDaPlaca);
  }
  
  /**
   * @brief   Método get do atributo marca
   * @param   marca   Marca do veículo
   */ 
  public String getMarca(){ return marca; }
    
  /**
   * @brief   Método get do atributo modelo
   * @param   modelo   Modelo do veículo
   */ 
  public String getModelo(){ return modelo; }
  
  /**
   * @brief   Método get do atributo numeroDaPlaca
   * @param   numeroDaPlaca   Número da placa do veículo
   */ 
  public String getNumeroDaPlaca(){ return numeroDaPlaca; }
  
  public void setMarca(String marca){this.marca= marca;}
  public void setModelo(String modelo){this.modelo = modelo;}
  public void setNumeroDaPlaca(String numeroDaPlaca){ this.numeroDaPlaca = numeroDaPlaca; }
  
}