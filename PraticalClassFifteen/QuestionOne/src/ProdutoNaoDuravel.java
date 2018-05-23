/**
 * Contém a classe ProdutoNaoDuravel e a implementação de seus métodos
 */
 
package produtos;

/** 
 * Representa um produto não durável genérico
 * @author  Samuel Lucas de Moura Ferino
 * @see     Produto
 * @since   20.03.2018
 * @version 0.0.7 
 */
public abstract class ProdutoNaoDuravel extends Produto{
   
  /// -> ATRIBUTO
  
  private String dataDeValidade; // ->  Data de validade do produto não durável */
  private String genero; // ->  Gênero do produto não durável */

  // -> MÉTODO
  
  /**
   * Construtor padrão
   */ 
  public ProdutoNaoDuravel(){
    super();
    dataDeValidade = new String();
    genero = new String();
  }
  
  /**
   * Construtor parametrizado
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
            String descricao, String dataDeFabricacao, 
            String dataDeValidade, String genero ){
    
    super(id, nome, preco, marca, descricao, dataDeFabricacao); 
    
    try{
        
        if( dataDeValidade.equals("")){  // -> VERIFICANDO SE FOI PASSADO PELO USUÁRIO UMA STRING VAZIA
            throw new Exception("Eh necessario inserir uma data de validade ao produto nao duravel...");
        }
        this.dataDeValidade = new String(dataDeValidade);
        
        if( genero.equals("") ){  // -> VERIFICANDO SE FOI PASSADO PELO USUÁRIO UMA STRING VAZIA
            throw new Exception("Eh necessario inserir um genero ao produto nao duravel...");
        }
        this.genero = new String(genero);
    }
    catch( NullPointerException e ){
        System.err.println( e.getMessage() );
    }
    catch( Exception e ){
        System.err.println( e.getMessage() );
    }
  
  }
  
  /**
   * Método get do atributo dataDeValidade
   * @return  Data de validade do produto não durável
   */ 
  public String getDataDeValidade(){ return dataDeValidade; }
  
  /**
   * Método get do atributo genero
   * @return  Gênero do produto
   */ 
  public String getGenero(){ return genero; }
  
  /**
   * Método set do atributo dataDeValidade
   * @param   dataDeValidade  Data de validade do produto não durável
   */ 
  public void setDataDeValidade(String dataDeValidade){ 
    this.dataDeValidade = dataDeValidade; 
  }
  
  /**
   * Método set do atributo genero
   * @param   genero  Gênero do produto não durável
   */ 
  public void setGenero(String genero){ 
    this.genero = genero;
  }
  
  /**
   * Imprime os atributos da classe abstrata ProdutoDuravel
   */ 
  public void print(){
    
    super.print();  
      
    System.out.println( "\nData de validade: "      + this.dataDeValidade +
                        "\nGenero: "                + this.genero );
    
  }
  
  @Override
  public String toString(){
      return super.toString() + 
              "  Data de validade: " + this.dataDeValidade +
              "  Genero: "  + this.genero; 
  }
  
  /**
   * Verifica se o produto está disponível para venda
   * @return  true se for senão false
   */ 
  public boolean disponivelParaVenda(){
    
    if( super.getVendido() == false && estaNaValidade() == true)
        return true;
    else 
        return false;
  }

  /**
   * Verifica se o produto não durável está dentro da validade
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
