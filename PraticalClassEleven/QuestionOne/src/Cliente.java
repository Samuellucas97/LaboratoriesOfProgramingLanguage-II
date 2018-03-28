/**
 * @file      Cliente.java
 * @brief     Contém a classe Cliente e a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1 
 */ 
 
/**
 * @class   Cliente
 */ 
public class Cliente{
  
  /// ATRIBUTOS
  
  /**<  Nome do cliente */
  protected String nome;
  /**<  Endereço do cliente */
  protected String endereco;
  /**<  Telefone do cliente */
  protected String telefone;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor da padrão
   */ 
  public Cliente(){
    this.nome =  new String( );
    this.endereco =  new String();
    this.telefone = new String();
  }
  
  /**
   * @brief   Construtor da parametrizado
   * @param   nome      Nome do cliente
   * @param   endereco  Endereço do cliente
   * @param   telefone  Telefone do cliente
   */ 
  public Cliente(String nome, String endereco, String telefone){
    this.nome =  new String( nome);
    this.endereco =  new String(endereco);
    this.telefone = new String(telefone);
  }
  
  /**
   * @brief   Método get do atributo nome
   * @return  Nome do Cliente
   */ 
  public String getNome(){  return nome; }
  
  /**
   * @brief   Método get do atributo endereco
   * @return  Endereço do cliente
   */ 
  public String getEndereco(){ return endereco; }
  
  /**
   * @brief   Método set do atributo endereco
   * @param  endereco  Endereço do cliente
   */ 
  public void setEndereco(String endereco){ this.endereco = endereco; }
  
   /**
   * @brief   Método get do atributo telefone
   * @return  Telefone do cliente
   */ 
   public String getTelefone(){ return telefone; }
  
  /**
   * @brief   Método get do atributo telefone
   * @return  Telefone do cliente
   */ 
  public void setTelefone(String telefone){ this.telefone = telefone; }

  /**
   * @brief   Imprime todos os atributos da classe cliente
   */ 
  public void imprimirDados(){
    System.out.println(
                        "\nNome: " + getNome() +
                        "\nEndereco: " + getEndereco() +
                        "\nTelefone: " + getTelefone() );    
  }
  
}
