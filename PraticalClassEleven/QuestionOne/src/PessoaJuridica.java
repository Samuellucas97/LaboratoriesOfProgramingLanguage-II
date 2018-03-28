/**
 * @file      PessoaJuridica.java
 * @brief     Contém a classe PessoaJuridica e a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1 
 */

/**
 * @class   PessoaJuridica
 */ 
public class PessoaJuridica extends Cliente{
  
  /// ATRIBUTOS
  
  /**<  CNPJ da pessoa jurídica*/
  private String cnpj;
  /**<  Nome de fantasia da pessoa jurídica*/
  private String nomeDeFantasia;
  
  /// MÉTODOS 
  
  /**
   * @brief   Construtor padrão
   */ 
  public PessoaJuridica(){
    super();
    cnpj = new String();
    nomeDeFantasia = new String();
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   nome            Nome da pessoa jurídica
   * @param   endereco        Endereço da pessoa jurídica
   * @param   telefone        Telefone da pessoa jurídica
   * @param   cnpj            CNPJ da pessoa jurídica
   * @param   nomeDeFantasia  Nome de fantasia da pessoa jurídica
   */ 
  public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeDeFantasia){
    super(nome, endereco, telefone);
    this.cnpj = new String(cnpj);
    this.nomeDeFantasia = new String(nomeDeFantasia);
  }
  
  /**
   * @brief   Método get do atributo cnpj
   * @return  CNPJ da pessoa jurídica
   */ 
  public String getCnpj(){ return cnpj; }
  
  /**
   * @brief   Método set do atributo cnpj
   * @param   cnpj  CNPJ da pessoa jurídica
   */ 
  public void setCnpj(String cnpj){ this.cnpj = cnpj; }
  
  /**
   * @brief   Método get do atributo nomeDeFantasia
   * @return  Nome de fantasia da pessoa jurídica
   */
  public String getNomeDeFantasia(){ return nomeDeFantasia; }
  
  /**
   * @brief   Método set do atributo nomeDeFantasia
   * @param   nomeDeFantasia    Nome de fantasia da pessoa jurídica
   */
  public void setNomeDeFantasia(String nomeDeFantasia){ this.nomeDeFantasia = nomeDeFantasia; }
  
    /**
   * @brief   Imprime todos os atributos da classe PessoaJuridica
   */ 
  public void imprimirDados(){
    
    super.imprimirDados(); 
    
    System.out.println(
                        "CNPJ: " + getCnpj() +
                        "\nNome de fantasia: " + getNomeDeFantasia() );    
  } 
  
}
