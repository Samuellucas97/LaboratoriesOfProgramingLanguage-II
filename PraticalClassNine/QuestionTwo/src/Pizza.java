/**
 * @file    Pizza.java
 * @brief   Contém a classe Pizza como a implementação de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
/**
 * @class Pizza
 */ 
public class Pizza extends ProdutoNaoDuravel{
  
  /// ATRIBUTO
 
  /**<  Ingredientes que compõem a pizza */
  private String ingredientes;
 
 /// MÉTODOS
 
 /**
  * @brief  Construtor padrão
  */ 
 public Pizza(){
   super();
   ingredientes = new String();
 }
 
 /**
  * @brief   Construtor parametrizado  
  * @param   nome                  Nome do tipo da pizza
  * @param   preco                 Preço da pizza
  * @param   marca                 Marca da pizza
  * @param   descricao             Descrição da pizza
  * @param   dataDeFabricacao      Data de fabricação da pizza
  * @param   dataDeValidade        Data de validade da pizza 
  * @param   genero                Gênero da pizza
  * @param   ingredientes          Ingredientes da pizza
  */ 
  public Pizza( String nome, double preco, String marca,
    String descricao, String dataDeFabricacao, String dataDeValidade, 
    String genero, String ingredientes){
    super(nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
    this.ingredientes = new String(ingredientes);
  }
  
  /**
   * @brief   Método get do atributo ingredientes
   * @return  Ingredientes da pizza
   */ 
  public String getIngredientes(){ return ingredientes; }

  /**
   * @brief   Método set do atributo ingredientes
   * @param   ingredientes  Ingredientes da pizza
   */ 
  public void setIngredientes(String ingredientes){ this.ingredientes = ingredientes; }  
}
  