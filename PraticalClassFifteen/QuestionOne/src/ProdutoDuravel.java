/**
 * Cont�m a classe ProdutoDuravel e a implementa��o de seus m�todos
 */

package produtos;

/**
 * Representa um produto dur�vel gen�rico
 * @see     Produto
 * @author  Samuel Lucas de Moura Ferino
 * @since   20.03.2018
 * @version 0.0.5 
 */
public abstract class ProdutoDuravel extends Produto{
  
  // -> ATRIBUTOS
  
  private String materialPredominante; // ->  Material predominante no produto dur�vel
  private String durabilidade; // ->  Durabilidade do produto dur�vel 
  private boolean avaria; // -> H� avaria no produto dur�vel

  // -> M�TODOS
  
  /**
   * Construtor padr�o
   */ 
  public ProdutoDuravel(){
      
    super(); // -> CHAMANDO O CONSTRUTOR DA CLASSE PAI/M�E
    
    this.materialPredominante = new String("");
    this.durabilidade = new String("");
    this.avaria = false;
  
  }
  
  /**
   * Construtor parametrizado
   * @param   id                    ID do produto dur�vel
   * @param   nome                  Nome do modelo do produto dur�vel
   * @param   preco                 Pre�o do produto dur�vel
   * @param   marca                 Marca do produto dur�vel
   * @param   descricao             Descri��o do produto dur�vel
   * @param   dataDeFabricacao      Data de fabrica��o do produto dur�vel
   * @param   materialPredominante  Material predominante no produto dur�vel
   * @param   avaria                Avaria do produto dur�vel
   */ 
  public ProdutoDuravel( int id, String nome, double preco, String marca, 
          String descricao, String dataDeFabricacao, String materialPredominante, 
          String durabilidade, boolean  avaria){
      
    super( id, nome, preco, marca, descricao, dataDeFabricacao);
    
    try{
        
        if( materialPredominante.equals("") ){   // -> VERIFICANDO SE FOI PASSADO PELO USU�RIO UMA STRING VAZIA
            throw new Exception("Eh necessario escrever qual eh o material predominante no produto...");
        }
        
        this.materialPredominante = new String(materialPredominante);
        
        if( durabilidade.equals("") ){   // -> VERIFICANDO SE FOI PASSADO PELO USU�RIO UMA STRING VAZIA
            throw new Exception("Eh necessario escrever sobre a durabilidade do produto... ");
        }
        
        this.durabilidade = new String(durabilidade);
        this.avaria =  avaria;

    }
    catch( NullPointerException e ){
        System.err.println( e.getMessage() );
    }
    catch( Exception e){
        System.err.println( e.getMessage() );
    }
    
  }
  
  /**
   * M�todo get do atributo materialPredominante
   * @return  Material predominante que comp�em o produto dur�vel
   */ 
  public String getMaterialPredominante(){ return materialPredominante; }
  
  /**
   * M�todo set do atributo materialPredominante
   * @param   materialPredominante  Material predominante que comp�em o produto dur�vel
   */ 
  public void setMaterialPredominante(String materialPredominante){ 
    this.materialPredominante = materialPredominante; 
  }
  
  /**
   * M�todo get do atributo durabilidade
   * @return  Durabilidade do produto dur�vel
   */ 
  public String getDurabilidade(){ return durabilidade; }
  
  /**
   * M�todo set do atributo durabilidade
   * @return  durabilidade  Durabilidade do produto dur�vel
   */ 
  public void setDurabilidade(String durabilidade){ 
    this.durabilidade = durabilidade; 
  }
  
  /**
   * M�todo get do atributo avaria
   * @return  Avaria do produto dur�vel
   */ 
  public boolean getAvaria(){ return avaria; }
  
  /**
   * M�todo set do atributo avaria
   * @return  avaria  Avaria do produto dur�vel
   */ 
  public void setAvaria(boolean avaria){ 
    this.avaria = avaria; 
  }
  
  /**
   * @brief   Imprime os atributos da classe abstrata ProdutoDuravel
   */ 
  public void print(){
    
    super.print();  
      
    System.out.println(
                        "\nMaterial predominante: " + this.materialPredominante +
                        "\nDurabilidade: "          + this.durabilidade +
                        "\nAvaria: "                + this.avaria );
    
  }
  
  @Override
  public String toString(){
      return super().toString() + 
              "  Material predominante: " + this.materialPredominante +
              "  Durabilidade: " + this.durabilidade +
              "  Avaria: " + this.avaria;
  }
  
  
  /**
   * Verifica se o produto est� dispon�vel para venda
   * @return  true se for sen�o false
   */ 
  public boolean disponivelParaVenda(){
    
    if( super.getVendido() == false )
        return true;
    else 
        return false;
    
  }

  /**
   * @brief   Verifica se o produto durável é eletro eletrônico
   * @return  true se for senão false
   */ 
  public abstract boolean ehEletroEletronico();
  
}