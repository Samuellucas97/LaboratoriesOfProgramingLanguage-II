/**
 * Cont�m a classe ProdutoNaoDuravel e a implementa��o de seus m�todos
 */
 
package produtos;

/** 
 * Representa um produto n�o dur�vel gen�rico
 * @author  Samuel Lucas de Moura Ferino
 * @see     Produto
 * @since   20.03.2018
 * @version 0.0.7 
 */
public abstract class ProdutoNaoDuravel extends Produto{
   
  /// -> ATRIBUTO
  
  private String dataDeValidade; // ->  Data de validade do produto n�o dur�vel */
  private String genero; // ->  G�nero do produto n�o dur�vel */

  // -> M�TODO
  
  /**
   * Construtor padr�o
   */ 
  public ProdutoNaoDuravel(){
    super();
    dataDeValidade = new String();
    genero = new String();
  }
  
  /**
   * Construtor parametrizado
   * @param   id                    ID do produto n�o dur�vel
   * @param   nome                  Nome do modelo do produto n�o dur�vel
   * @param   preco                 Pre�o do produto n�o dur�vel
   * @param   marca                 Marca do produto n�o dur�vel
   * @param   descricao             Descri��o do produto n�o dur�vel
   * @param   dataDeFabricacao      Data de fabrica��o do produto n�o dur�vel
   * @param   dataDeValidade        Data de validade do produto n�o dur�vel 
   * @param   genero                G�nero do produto n�o dur�vel
   */ 
  public ProdutoNaoDuravel(int id, 
            String nome, double preco, String marca,
            String descricao, String dataDeFabricacao, 
            String dataDeValidade, String genero ){
    
    super(id, nome, preco, marca, descricao, dataDeFabricacao); 
    
    try{
        
        if( dataDeValidade.equals("")){  // -> VERIFICANDO SE FOI PASSADO PELO USU�RIO UMA STRING VAZIA
            throw new Exception("Eh necessario inserir uma data de validade ao produto nao duravel...");
        }
        this.dataDeValidade = new String(dataDeValidade);
        
        if( genero.equals("") ){  // -> VERIFICANDO SE FOI PASSADO PELO USU�RIO UMA STRING VAZIA
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
   * M�todo get do atributo dataDeValidade
   * @return  Data de validade do produto n�o dur�vel
   */ 
  public String getDataDeValidade(){ return dataDeValidade; }
  
  /**
   * M�todo get do atributo genero
   * @return  G�nero do produto
   */ 
  public String getGenero(){ return genero; }
  
  /**
   * M�todo set do atributo dataDeValidade
   * @param   dataDeValidade  Data de validade do produto n�o dur�vel
   */ 
  public void setDataDeValidade(String dataDeValidade){ 
    this.dataDeValidade = dataDeValidade; 
  }
  
  /**
   * M�todo set do atributo genero
   * @param   genero  G�nero do produto n�o dur�vel
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
   * Verifica se o produto est� dispon�vel para venda
   * @return  true se for sen�o false
   */ 
  public boolean disponivelParaVenda(){
    
    if( super.getVendido() == false && estaNaValidade() == true)
        return true;
    else 
        return false;
  }

  /**
   * Verifica se o produto n�o dur�vel est� dentro da validade
   * @param   dataAtual   Data que ser� verificada se o produto est� dentro
   *          da validade
   * @return  true se for sen�o false
   */ 
  public boolean estaNaValidade(String dataAtual){
    if( Integer.parseInt( getDataDeValidade() ) > Integer.parseInt( dataAtual ) )
      return true;
    else  
      return false;
  }
  
}
