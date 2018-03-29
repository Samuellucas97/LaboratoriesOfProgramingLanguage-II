/**
 * @file    Livro.java
 * @brief   Contém a classe Livro além de seus métodos 
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.1 
 */

/**
 * @class   Livro
 */ 
public class Livro extends ProdutoDuravel{
  
  /// ATRIBUTO
  
  /**<  Crítica do livro */
  private String critica;
  /**<  Quantidade de páginas do livro */
  private int quantidadeDePaginas;
  /**<  Classificação literária do livro */
  private String classificacaoLiteraria;
  
  /// MÉTODO
  
  /**
   * @brief   Construtor padrão
   */ 
  public Livro(){
    super();
    critica = new String();
    quantidadeDePaginas = 0;
    classificacaoLiteraria = new String();
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   nome                    Nome do modelo do livro
   * @param   preco                   Preço do livro
   * @param   marca                   Marca do livro
   * @param   descricao               Descrição do livro
   * @param   dataDeFabricacao        Data de fabricação do Livro
   * @param   materialPredominante    Material predominante que compõem o Livro
   * @param   durabilidade            Durabilidade do Livro
   * @param   critica                 Critica do Livro
   * @param   quantidadeDePaginas     Quantidade de páginas do Livro
   * @param   classificacaoLiteraria  Classificação literária do livro
   */ 
  public Livro(String nome, double preco, String marca, 
    String descricao, String dataDeFabricao, String materialPredominante, 
    String durabilidade, String critica, 
    int quantidadeDePaginas, String classificacaoLiteraria){
      super(nome, preco, marca, 
      descricao, dataDeFabricao, materialPredominante, 
      durabilidade);
      this.critica = new String(critica);
      this.quantidadeDePaginas = quantidadeDePaginas;
      this.classificacaoLiteraria = new String(classificacaoLiteraria);
  }
  
  /**
   * @brief   Método get do atributo critica
   * @return  Crítica do livro
   */ 
  public String getCritica(){ return critica; }
  
  /**
   * @brief   Método get do atributo quantidadeDePaginas 
   * @return  Quantidade de páginas no livro
   */ 
  public int getQuantidadeDePaginas(){ return quantidadeDePaginas; }
  
  /**
   * @brief   Método get do atributo classificacaoLiteraria
   * @return  Classificação literária do livro  
   */ 
  public String getClassificacaoLiteraria(){ return classificacaoLiteraria; }
  
  /**
   * @brief   Método set do atributo critica
   * @return  Crítica do livro
   */ 
  public void setCritica(String critica){ this.critica = critica; }
  
  /**
   * @brief   Método set do atributo quantidadeDePaginas 
   * @param   quantidadeDePaginas   Quantidade de páginas do livro 
   */ 
  public void setQuantidadeDePaginas(int quantidadeDePaginas ){ 
    this.quantidadeDePaginas = quantidadeDePaginas;
  }
  
  /**
   * @brief   Método set do atributo classificacaoLiteraria
   * @param   classificacaoLiteraria  Classificação literária do livro
   */ 
  public void setClassificacaoLiteratura(String classificacaoLiteraria){ 
    this.classificacaoLiteraria = classificacaoLiteraria; 
  }
  
}