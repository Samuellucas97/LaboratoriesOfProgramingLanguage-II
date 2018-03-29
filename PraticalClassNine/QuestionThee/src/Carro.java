/**
 * @file      Carro.java
 * @brief     Contém a classe Moto e a implementação de seus métodos   
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /**
 * @class   Carro
 */ 
public class Carro extends Veiculo{
  
  /// ATRIBUTOS
  
  /**<  Potencia do motor do carro */
  private int potenciaDoMotor;
  /**<  Quantidade de portas do carro */
  private int quantidadeDePortas;
  
  /// MÉTODOS
  
  /** 
   * @brief   Construtor padrão
   */ 
  public Carro(){
    super();
    potenciaDoMotor = 0;
    quantidadeDePortas = 0;
  }
    
  /** 
   * @brief   Construtor parametrizado
   * @param   marca         Marca do veículo
   * @param   modelo        Modelo do veículo
   * @param   numeroDaPlaca Número da placa do veículo
   * @param   potenciaDoMotor Potência do motor do carro
   * @param   quantidadeDePortas   Quantidade de portas
   */ 
  public Carro(String marca, String modelo, String numeroDaPlaca, int potenciaDoMotor, int quantidadeDePortas){
    super(marca, modelo, numeroDaPlaca);
    this.potenciaDoMotor = potenciaDoMotor;
    this.quantidadeDePortas = quantidadeDePortas;
  }
  
  /**
   * @brief   Método get do atributo potenciaDoMotor
   * @return  Potência do motor do carro
   */ 
  public int getPotenciaDoMotor(){ return potenciaDoMotor; }
  
  /**
   * @brief   Método get do atributo quantidadeDePortas
   * @return  Quantidade de portas do carro
   */
  public int getQuantidadeDePortas(){ return quantidadeDePortas; }
  
  /**
   * @brief   Método set do atributo potenciaDoMotor
   * @param   potenciaDoMotor Potência do motor do carro
   */ 
   public void setPotenciaDoMotor(int potenciaDoMotor){ this.potenciaDoMotor = potenciaDoMotor; }
   
  /**
   * @brief   Método set do atributo quantidadeDePortas
   * @return  quantidadeDePortas Quantidade de portas do carro
   */
  public void setQuantidadeDePortas(int quantidadeDePortas){ this.quantidadeDePortas = quantidadeDePortas; }
  
}