/**
 * @file    ProdutoDuravel.java
 * @brief   Contém a classe abstrata ProdutoDuravel 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
/**
 * @class ProdutoDuravel
 */
public abstract class ProdutoDuravel extends Produto{
  
  /// ATRIBUTOS
  
  /**<  Material predominante no produto durável */
  private String materialPredominante;
  /**<  Durabilidade do produto durável */
  private String durabilidade;
  /**<  Há Avaria no produto durável */
  private boolean avaria;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ProdutoDuravel(){
    super();
    this.materialPredominante = new String();
    this.durabilidade = new String();
    this.avaria = new String();
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   id                    ID do produto durável
   * @param   nome                  Nome do modelo do produto durável
   * @param   preco                 Preço do produto durável
   * @param   marca                 Marca do produto durável
   * @param   descricao             Descrição do produto durável
   * @param   dataDeFabricacao      Data de fabricação do produto durável
   * @param   materialPredominante  Material predominante no produto durável
   * @param   avaria                Avaria do produto durável
   */ 
  public ProdutoDuravel( int id, String nome, double preco, String marca, String descricao, String dataDeFabricacao, String materialPredominante, String durabilidade, String  avaria){
    super( id, nome, preco, marca, descricao, dataDeFabricacao);
    this.materialPredominante = new String(materialPredominante);
    this.durabilidade = new String(durabilidade);
    this.avaria = new String(avaria);
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
   * @brief   Método get do atributo avaria
   * @return  Avaria do produto durável
   */ 
  public String getAvaria(){ return avaria; }
  
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
  
  /**
   * @brief   Método set do atributo avaria
   * @return  avaria  Avaria do produto durável
   */ 
  public void setAvaria(String avaria){ 
    this.avaria = avaria; 
  }
  
  /**
   * @brief   Imprime os atributos da classe abstrata ProdutoDuravel
   */ 
  public void print(){
    
    System.out.println( "\nID: "                    + getID() +
                        "\nNome: "                  + getNome() +
                        "\nPreco: "                 + getPreco() +
                        "\nMarca: "                 + getMarca() +
                        "\nDescricao: "             + getDescricao() + 
                        "\nData de fabricao: "      + getDataDeFabricacao() +
                        "\nMaterial predominante: " + getMaterialPredominante() +
                        "\nDurabilidade: "          + getDurabilidade() );
    
  }
  
  /**
   * @brief   Verifica se o produto está disponível para venda
   * @return  true se for senão false
   */ 
  public boolean disponivelParaVenda(){
    
  }

  
  /**
   * @brief   Verifica se o produto durável é eletro eletrônico
   * @return  true se for senão false
   */ 
  public abstract boolean ehEletroEletronico();
  
}