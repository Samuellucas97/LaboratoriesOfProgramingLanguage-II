/**
 * @file      Moto.java
 * @brief     Contém a classe Moto e a implementação de seus métodos   
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /**
 * @class   Moto
 */ 
public class Moto extends Veiculo{
  
  /// ATRIBUTOS
  
  /**<  Tipo da partida da moto [Manual ou Elétrica]*/
  private String tipoDaPartida;
  /**<  Quantidade de cilindradas que a moto possui*/
  private double cilindradas;
  
  /// MÉTODOS
  
  /** 
   * @brief   Construtor padrão
   */ 
  public Moto(){
    super();
    tipoDaPartida = new String();
    cilindradas = 0;
  }
    
  /** 
   * @brief   Construtor parametrizado
   * @param   marca         Marca do veículo
   * @param   modelo        Modelo do veículo
   * @param   numeroDaPlaca Número da placa do veículo
   * @param   tipoDaPartida Tipo de partida da Moto
   * @param   cilindradas   Quantidade de cilindradas
   */ 
  public Moto(String marca, String modelo, String numeroDaPlaca, String tipoDaPartida, double cilindradas){
    super(marca, modelo, numeroDaPlaca);
    this.tipoDaPartida = new String(tipoDaPartida);
    this.cilindradas = cilindradas;
  }
  
  /**
   * @brief   Método get do atributo tipoDaPartida
   * @return  Tipo de partida da moto
   */ 
  public String getTipoDePartida(){ return tipoDaPartida; }
  
  /**
   * @brief   Método get do atributo cilindradas
   * @return  Quantidade de cilindradas da moto
   */
  public double getCilindradas(){ return cilindradas; }
  
  /**
   * @brief   Método set do atributo tipoDaPartida
   * @param   tipoDaPartida Tipo de partida da moto
   */ 
   public void setTipoDaPartida(String tipoDaPartida){ this.tipoDaPartida = tipoDaPartida; }
   
  /**
   * @brief   Método set do atributo cilindradas
   * @return  cilindradas Quantidade de cilindradas da moto
   */
  public void setCilindradas(double cilindradas){ this.cilindradas = cilindradas; }
  
}