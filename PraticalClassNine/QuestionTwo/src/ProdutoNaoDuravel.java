/**
 * @file    ProdutoNaoDuravel.java
 * @brief   Contém a classe ProdutoNaoDuravel como a implementação de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
/**
 * @class   ProdutoNaoDuravel
 */
public class ProdutoNaoDuravel extends Produto{
   
  /// ATRIBUTO
  
  /**<  Data de validade do produto não durável */
  private String dataDeValidade;
  /**<  Gênero do produto não durável */
  private String genero;
  
  /// MÉTODO
  
  /**
   * @brief Construtor padrão 
   */ 
  public ProdutoNaoDuravel(){
    super();
    dataDeValidade = new String();
    genero = new String();
  }
  
  /**
   * @brief Construtor parametrizado
   * @param   nome                  Nome do modelo do produto não durável
   * @param   preco                 Preço do produto não durável
   * @param   marca                 Marca do produto não durável
   * @param   descricao             Descrição do produto não durável
   * @param   dataDeFabricacao      Data de fabricação do produto não durável
   * @param   dataDeValidade        Data de validade do produto não durável 
   * @param   genero                Gênero do produto não durável
   */ 
  public ProdutoNaoDuravel( String nome, double preco, String marca,
    String descricao, String dataDeFabricacao, String dataDeValidade, String genero ){
    super(nome, preco, marca, descricao, dataDeFabricacao);
    this.dataDeValidade = new String(dataDeValidade);
    this.genero = new String(genero);
  }
  
  /**
   * @brief   Método get do atributo dataDeValidade
   * @return  Data de validade do produto não durável
   */ 
  public String getDataDeValidade(){ return dataDeValidade; }
  
  /**
   * @brief   Método get do atributo genero
   * @return  Gênero do produto
   */ 
  public String getGenero(){ return genero; }
  
  /**
   * @brief   Método set do atributo dataDeValidade
   * @param   dataDeValidade  Data de validade do produto não durável
   */ 
  public void setDataDeValidade(String dataDeValidade){ 
    this.dataDeValidade = dataDeValidade; 
  }
  
  /**
   * @brief   Método set do atributo genero
   * @param   genero  Gênero do produto não durável
   */ 
  public void setGenero(String genero){ 
    this.genero = genero;
  }
  
}
