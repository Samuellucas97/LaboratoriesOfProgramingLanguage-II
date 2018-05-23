/**
 * Cont�m a classe Pizza como a implementa��o de seus m�todos 
 */

package produtos;

/**
 * Representa uma Pizza
 * @author  Samuel Lucas de Moura Ferino
 * @see Produto
 * @see ProdutoNaoDuravel
 * @since   20.03.2018
 * @version 0.0.3 
*/ 
public class Pizza extends ProdutoNaoDuravel{
  
  // -> ATRIBUTO
 
  private String ingredientes; // -> Ingredientes que comp�em a pizza 
 
 // -> M�TODOS
 
 /**
  * Construtor padr�o
  */ 
 public Pizza(){
   super();
   ingredientes = new String();
 }
 
 /**
  * Construtor parametrizado  
  * @param   id                    ID da pizza
  * @param   nome                  Nome do tipo da pizza
  * @param   preco                 Pre�o da pizza
  * @param   marca                 Marca da pizza
  * @param   descricao             Descri��o da pizza
  * @param   dataDeFabricacao      Data de fabrica��o da pizza
  * @param   dataDeValidade        Data de validade da pizza 
  * @param   genero                G�nero da pizza
  * @param   ingredientes          Ingredientes da pizza
  */ 
  public Pizza( int id, String nome, double preco, String marca,
    String descricao, String dataDeFabricacao, String dataDeValidade, 
    String genero, String ingredientes){
    
    super(id, nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
    
    try{
        if(ingredientes.equals("")){  // -> VERIFICANDO SE FOI PASSADO PELO USU�RIO UMA STRING VAZIA
            throw new Exception("Eh necessario inserir os ingredientes da pizza no construtor...");
        }
        this.ingredientes = new String(ingredientes);
    }
    catch( NullPointerException e){
        System.err.println( e.getMessage() );
    }
    catch( Exception e){
        System.err.println( e.getMessage() );
    }
  }
  
  /**
   * M�todo get do atributo ingredientes
   * @return  Ingredientes da pizza
   */ 
  public String getIngredientes(){ return ingredientes; }

  /**
   * M�todo set do atributo ingredientes
   * @param   ingredientes  Novos ingredientes da pizza
   */ 
  public void setIngredientes(String ingredientes){ this.ingredientes = ingredientes; }  
  
  public boolean vender( double preco){
      
      if( super.disponivelParaVenda() == true && preco >= super.getPreco() )
          return true;
      else
          return false;
      
  }
  
}
  