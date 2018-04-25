/**
 * @file    ProdutoNaoDuravel.java
 * @brief   Contém a classe abstrata ProdutoNaoDuravel
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
/**
 * @class   ProdutoNaoDuravel
 */
public abstract class ProdutoNaoDuravel extends Produto{
   
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
   * @param   id                    ID do produto não durável
   * @param   nome                  Nome do modelo do produto não durável
   * @param   preco                 Preço do produto não durável
   * @param   marca                 Marca do produto não durável
   * @param   descricao             Descrição do produto não durável
   * @param   dataDeFabricacao      Data de fabricação do produto não durável
   * @param   dataDeValidade        Data de validade do produto não durável 
   * @param   genero                Gênero do produto não durável
   */ 
  public ProdutoNaoDuravel(int id, 
    String nome, double preco, String marca,
    String descricao, String dataDeFabricacao, String dataDeValidade, String genero ){
    super(id, nome, preco, marca, descricao, dataDeFabricacao);
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
                        "\nData de validade: "      + getDataDeValidade() +
                        "\nGenero: "                + getGenero() );
    
  }
  
  /**
   * @brief   Verifica se o produto está disponível para venda
   * @return  true se for senão false
   */ 
  public boolean disponivelParaVenda(){
    
  }

  /**
   * @brief   Verifica se o produto não durável está dentro da validade
   * @param   dataAtual   Data que será verificada se o produto está dentro
   *          da validade
   * @return  true se for senão false
   */ 
  public boolean estaNaValidade(String dataAtual){
    if( Integer.parseInt( getDataDeValidade() ) > Integer.parseInt( dataAtual ) )
      return true;
    else  
      return false;
  }
  
}
