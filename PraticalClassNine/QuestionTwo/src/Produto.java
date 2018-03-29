/**
 * @file    Produto.java
 * @brief   Contém a classe Produto como a implementação de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
/**
 * @class Produto
 */ 
public class Produto{
  
  /// ATRIBUTOS 
  /**<  Nome do produto */
  private String nome; 
  /**< Preço do produto */
  private double preco; 
  /**< Marca do produto */
  private String marca; 
  /**< Descrição do produto */
  private String descricao; 
  /**< Data de fabricação do produto */
  private String dataDeFabricacao;
  
  /// MÉTODOS
  /**
   * @brief Construtor padrão
   */ 
  public Produto(){ 
    nome = new String();
    preco = 0.0;
    marca = new String();
    descricao = new String();
    dataDeFabricacao = new String();
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   nome                  Nome do modelo do celular
   * @param   preco                 Preço do celular
   * @param   marca                 Marca do Celular
   * @param   descricao             Descrição do celular
   * @param   dataDeFabricacao      Data de fabricação do Celular
   */ 
  public Produto(  String nome, double preco, String marca,
    String descricao, String dataDeFabricacao) {
      this.nome = new String(nome);
      this.preco = preco;
      this.marca = new String(marca);
      this.descricao = new String(descricao);
      this.dataDeFabricacao = new String(dataDeFabricacao);
  }
  
  /**
   * @brief   Método get do atributo nome
   * @return  Nome do produto
   */ 
  public String getNome(){ return nome; }
  
  /**
   * @brief   Método get do atributo preco
   * @return  Preço do produto
   */ 
  public double getPreco(){ return preco; }
  
  /**
   * @brief   Método get do atributo marca
   * @return  Marca do produto
   */ 
  public String getMarca(){ return marca; }
  
  /**
   * @brief   Método get do atributo descricao
   * @return  Descrição do produto
   */ 
  public String getDescricao(){ return descricao; }
  
  /**
   * @brief   Método get do atributo dataDeFabricao
   * @return  Data de fabricao do produto
   */ 
  public String getDataDeFabricacao(){ return dataDeFabricacao; }
  
  /**
   * @brief   Método set do atributo nome
   * @param   nome  Nome do produto
   */ 
  public void setNome(String nome){ 
    this.nome = nome; 
  }
  
  /**
   * @brief   Método set do atributo preco
   * @param   preco  Preço do produto
   */ 
  public void setPreco(double preco){ 
    this.preco = preco; 
  }
  
  /**
   * @brief   Método set do atributo marca
   * @param   marca  Marca do produto
   */ 
  public void setMarca(String marca){ 
    this.marca = marca; 
  }
  
  /**
   * @brief   Método set do atributo descricao
   * @param   descricao  Descrição do produto
   */ 
  public void setDescricao(String descricao){ 
    this.descricao = descricao; 
  }
  
  /**
   * @brief   Método set do atributo dataDeFabricao
   * @param   dataDeFabricao  Data de fabricação do produto
   */ 
  public void setDataDeFabricacao(String dataDeFabricacao){ 
    this.dataDeFabricacao = dataDeFabricacao; 
  }

}