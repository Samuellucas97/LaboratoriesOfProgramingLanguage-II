/**
 * @file    Carro.java
 * @brief   Contém a classe Carro além de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
 /**
  * @class  Carro
  */ 
public class Carro extends ProdutoDuravel{
  
  /// ATRIBUTO
  /**<  Placa do carro */  
  private String placa;
  /**<  Cor do carro */
  private String cor;
  
  /// MÉTODO
  
  /**
   * @brief Construtor padrão
   */ 
  public Carro(){
    super();
    placa = new String();
    cor = new String();
  }
  
  /**
   * @brief Construtor parametrizado
   * @param   nome                  Nome do modelo do carro
   * @param   preco                 Preço do carro
   * @param   marca                 Marca do carro
   * @param   descricao             Descrição do carro
   * @param   dataDeFabricao        Data de fabricação do carro
   * @param   materialPredominante  Material predominante que compõem o carro
   * @param   durabilidade          Durabilidade do carro
   * @param   placa                 Placa do carro
   * @param   cor                   Cor do carro
   */ 
   public Carro(
     String nome, double preco, String marca, 
    String descricao, String dataDeFabricao, String materialPredominante, String durabilidade, 
    String placa, String cor){
      super( nome, preco, marca, 
      descricao,dataDeFabricao, 
      materialPredominante, durabilidade);
      this.placa = new String(placa);
      this.cor = new String(cor);
    }
  /**
   * @brief   Método get do atributo placa 
   * @return  Placa do carro
   */ 
  public String getPlaca(){ return placa; }
  
  /**
   * @brief   Método get do atributo cor
   * @return  Cor do carro
   */ 
  public String getCor(){ return cor; }

  /**
   * @brief   Método set do atributo placa
   * @param   placa   Placa do carro  
   */ 
  public void setPlaca(String placa){ this.placa = placa; }
  
  /**
   * @brief   Método set do atributo cor
   * @param   cor     Cor do carro
   */ 
  public void setCor(String cor){ this.cor = cor; }
  
}