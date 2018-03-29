/**
 * @file    ProdutoDuravel.java
 * @brief   Contém a classe ProdutoDuravel além de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
/**
 * @class ProdutoDuravel
 */
public class ProdutoDuravel extends Produto{
  
  /// ATRIBUTOS
  /**<  Material predominante no produto durável */
  private String materialPredominante;
  /**< durabilidade do produto durável */
  private String durabilidade;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ProdutoDuravel(){
    super();
    this.materialPredominante = new String();
    this.durabilidade = new String();
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   nome                  Nome do modelo do produto durável
   * @param   preco                 Preço do produto durável
   * @param   marca                 Marca do produto durável
   * @param   descricao             Descrição do produto durável
   * @param   dataDeFabricacao      Data de fabricação do produto durável
   * @param   materialPredominante  Material predominante no produto durável
   */ 
  public ProdutoDuravel( String nome, double preco, String marca, 
    String descricao, String dataDeFabricacao, String materialPredominante, String durabilidade){
    super( nome, preco, marca, descricao, dataDeFabricacao);
    this.materialPredominante = new String(materialPredominante);
    this.durabilidade = new String(durabilidade);
  }
  
  /**
   * @brief   Método get do atributo materialPredominante
   * @return  Material predominante que compõem o produto durável
   */ 
  public String getMaterialPredominante(){ return materialPredominante; }
  
  /**
   * @brief   Método get do atributo durabilidade
   * @return  Durabilidade do produto durável
   */ 
  public String getDurabilidade(){ return durabilidade; }
  
  /**
   * @brief   Método set do atributo materialPredominante
   * @param   materialPredominante  Material predominante que compõem o produto durável
   */ 
  public void setMaterialPredominante(String materialPredominante){ 
    this.materialPredominante = materialPredominante; 
  }
  
  /**
   * @brief   Método set do atributo durabilidade
   * @return  durabilidade  Durabilidade do produto durável
   */ 
  public void setDurabilidade(String durabilidade){ 
    this.durabilidade = durabilidade; 
  }
  
}