/**
 * Cont�m a classe Produto e a implementa��o de seus m�todos
 */
 
package produtos;
/**
 * Representa um produto gen�rico
 * @see     java.lang.Object
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.1.0 
 */ 
public abstract class Produto{
  
  /// -> ATRIBUTOS 
  
  private int id; // ->  Id do produto
  private boolean vendido; // ->  Situa��o do produto 
  private String nome; // ->  Nome do produto 
  private double preco; // ->  Pre�o do produto
  private String marca; // -> Marca do produto 
  private String descricao;  // -> Descri��o do produto 
  private String dataDeFabricacao; // ->  Data de fabrica��o do produto 
  
  /// -> M�TODOS
  
  /**
   * Construtor padr�o
   */ 
  public Produto(){ 
      
    id = 0;
    vendido = false;
    nome = new String();
    preco = 0.0;
    marca = new String();
    descricao = new String();
    dataDeFabricacao = new String();
    
  }
  
  /**
   * Construtor parametrizado
   * @param   id                    ID do produto
   * @param   nome                  Nome do produto
   * @param   preco                 Pre�o do produto
   * @param   marca                 Marca do produto
   * @param   descricao             Descri��o do produto
   * @param   dataDeFabricacao      Data de fabrica��o do produto
   */ 
  public Produto( int id, String nome, double preco, String marca,
    String descricao, String dataDeFabricacao) {
        
        try{
            this.id = id;
            this.vendido = false;
            this.nome = new String(nome);
            
            if( preco <= 0){
                throw new Exception("O preco precisa ser maior que 0...");
            }
            
            this.preco = preco;
            this.marca = new String(marca);
            this.descricao = new String(descricao);
            this.dataDeFabricacao = new String(dataDeFabricacao);
        }
        catch( NullPointerException e ){ 
            System.err.println( e.getMessage() );
        }
        catch( Exception e ){
            System.err.println( e.getMessage() );
        }
        
  }
  
  /**
   * M�todo get do atributo id
   * @return  ID do produto
   */ 
  public int getId(){ return id; }
  
  /**
   * M�todo set do atributo id
   * @param   id  ID do produto
   */ 
  public void setID(int id){ 
    this.id = id; 
  }
  
  /**
   * M�todo get do atributo vendido
   * @return  Situa��o do produto
   */ 
  public boolean getVendido(){ return this.vendido; }
  
  /**
   * M�todo set do atributo vendido
   * @param  vendido  Nova situa��o do produto
   */ 
  public void setVendido( boolean vendido){ this.vendido = vendido; }
  
  /**
   * M�todo get do atributo nome
   * @return  Nome do produto
   */ 
  public String getNome(){ return nome; }
  
  /**
   * M�todo set do atributo nome
   * @param   nome  Nome do produto
   */ 
  public void setNome(String nome){ 
    this.nome = nome; 
  }
  
  /**
   * M�todo get do atributo preco
   * @return  Pre�o do produto
   */ 
  public double getPreco(){ return preco; }
  
  /**
   * M�todo set do atributo preco
   * @param   preco  Pre�o do produto
   */ 
  public void setPreco(double preco){ 
    this.preco = preco; 
  }
  
  /**
   * M�todo get do atributo marca
   * @return  Marca do produto
   */ 
  public String getMarca(){ return marca; }
  
  /**
   * M�todo set do atributo marca
   * @param   marca  Marca do produto
   */ 
  public void setMarca(String marca){ 
    this.marca = marca; 
  }
  /**
   * M�todo get do atributo descricao
   * @return  Descri��o do produto
   */ 
  public String getDescricao(){ return descricao; }
  
  /**
   * M�todo set do atributo descricao
   * @param   descricao  Descri��o do produto
   */ 
  public void setDescricao(String descricao){ 
    this.descricao = descricao; 
  }
  
  /**
   * M�todo get do atributo dataDeFabricao
   * @return  Data de fabrica��o do produto
   */ 
  public String getDataDeFabricacao(){ return dataDeFabricacao; }
    
  /**
   * M�todo set do atributo dataDeFabricao
   * @param   dataDeFabricao  Data de fabrica��o do produto
   */ 
  public void setDataDeFabricacao(String dataDeFabricacao){ 
    this.dataDeFabricacao = dataDeFabricacao; 
  }
  
  /**
   * Imprime os atributos da classe abstrata Produto
   */ 
  public void print(){
    
    System.out.println( "\nID: "                + getId() +
                        "\nNome: "              + getNome() +
                        "\nPreco: "             + getPreco() +
                        "\nMarca: "             + getMarca() +
                        "\nDescricao: "         + getDescricao() + 
                        "\nData de fabricao: "  + getDataDeFabricacao() );
    
  }
  
  /**
   * Transforma em string os atributos, retornando-os
   * @return String contendo os atributos da classe 
   */
  @Override
  public String toString(){
    return  "\nID: " + getId() +
            "  Nome: "  + getNome() +
            "  Preco: "  + getPreco() +
            "  Marca: " + getMarca() +
            "  Descricao: " + getDescricao() + 
            "  Data de fabricao: " + getDataDeFabricacao(); 
  }
  
  /**
   * Verifica se o produto est� dispon�vel para venda
   * @return  true se for, sen�o false
   */ 
  public abstract boolean disponivelParaVenda();
  
}