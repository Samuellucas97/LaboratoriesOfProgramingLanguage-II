/**
 * @file    Refrigerante.java
 * @brief   Contém a classe Refrigerante como a implementação de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */
 
 /**
  * @class  Refrigerante
  */ 
public class Refrigerante extends ProdutoNaoDuravel{
  
  /// ATRIBUTO
  
  /**<  Quantidade da porção em MLs do refrigerante */
  private int porcaoEmML;
  
  /// MÉTODOS
  
  /**
   * @brief Construtor padrão
   */ 
  public Refrigerante(){
    super();
    porcaoEmML = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   nome                  Nome do modelo do refrigerante
   * @param   preco                 Preço do refrigerante
   * @param   marca                 Marca do refrigerante
   * @param   descricao             Descrição do refrigerante
   * @param   dataDeFabricacao      Data de fabricação do refrigerante
   * @param   dataDeValidade        Data de validade do refrigerante
   * @param   genero                Gênero do refrigerante
   * @param   porcaoEmML            Porção em MLs do refrigerante
   */ 
  public Refrigerante( String nome, double preco, String marca,
    String descricao, String dataDeFabricacao, String dataDeValidade, 
    String genero, int porcaoEmML){
    super(nome, preco, marca, descricao, dataDeValidade, dataDeFabricacao, genero);
    this.porcaoEmML = porcaoEmML;
  }
  
  /**
   * @brief   Método get do atributo porcaoEmML
   * @return  Porção em MLs do refrigerante
   */ 
  public int getPorcaoEmML(){ return porcaoEmML; };
  
  /**
   * @brief   Método set do atributo porcaoEmML
   * @param   porcaoEmML  Porcao em MLs do refrigerante
   */ 
  public void setPorcaoEmML(int porcaoEmML){ this.porcaoEmML = porcaoEmML; }
  
}