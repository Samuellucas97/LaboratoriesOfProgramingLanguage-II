/**
 * @file      PessoaFisica.java
 * @brief     Contém a classe PessoaFisica e a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1 
 */

/**
 * @class   PessoaFisica
 */ 
public class PessoaFisica extends Cliente{
  
  /// ATRIBUTOS
  
  /**<  CPF da pessoa física */
  private String cpf;
  
  /// MÉTODOS 
  
  /**
   * @brief   Construtor padrão
   */  
  public PessoaFisica(){
    super();
    cpf = new String();
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   nome      Nome da pessoa física
   * @param   endereco  Endereço da pessoa física
   * @param   telefone  Telefone da pessoa física
   * @param   cpf       CPF da pessoa física
   */ 
  public PessoaFisica(String nome, String endereco, String telefone, String cpf){
    super(nome, endereco, telefone);
    this.cpf = new String(cpf);
  }
  
  /**
   * @brief     Método get do atributo cpf
   * @return    CPF da pessoa física
   */
  public String getCpf(){ return cpf; }
  
  /**
   * @brief     Método set do atributo cpf
   * @return    cpf   CPF da pessoa física
   */
   public void setCpf(String cpf){ this.cpf = cpf; }
  
    /**
   * @brief   Imprime todos os atributos da classe PessoaFisica
   */ 
  public void imprimirDados(){
    
    super.imprimirDados(); 
    
    System.out.println(
                        "CPF: " + getCpf() );    
  }
  
  
  
}
