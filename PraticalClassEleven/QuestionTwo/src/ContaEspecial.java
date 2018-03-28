/**
 * @file      ContaEspecial.java
 * @brief     Contém a classe ContaEspecial e a implementação de mseus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1
 */

/**
 * @class   ContaEspecial
 */ 
public class ContaEspecial extends ContaBancaria{
  
  /// ATRIBUTO
  
  /**<  Limite da conta especial */
  private double limite;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ContaEspecial(){
    super();
    limite = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   cliente         Nome do cliente dono da conta especial
   * @param   numeroDaconta   Número da conta especial
   * @param   saldo           Saldo da conta especial
   * @param   limite          Limite da conta especial
   */ 
  public ContaEspecial(String cliente, int numeroDaconta, double saldo, double limite){
    super(cliente, numeroDaconta, saldo);
    this.limite= limite;
  }  
  
  /**
   * @brief     Método get do atributo limite
   * @return    Limite da conta especial
   */ 
  public double getLimite(){ return limite; }
  
  /**
   * @brief     Método set do atributo limite
   * @param     limite    Limite do atributo
   */ 
  public void setLimite(double limite){ this.limite = limite;} 
  
  /**
   * @brief   Retira do saldo o valor dado como entrada
   * @param   valor   Quantia a ser sacada da conta bancária
   * @return  true se a operação foi realizada com sucesso senão false
   */ 
  public boolean sacar(double valor){
    if( valor > limite + saldo){
      return false;
    }
    
    saldo = saldo - valor;
    
    return true;
    
  }
  
  /**
   * @brief     Transforma os atributos em uma string
   * @return    Atributos em formato de String
   */
  public String toString(){
    return  super.toString() + "\nLimite: " + this.limite; 
  }
  
}/**
 * @file      ContaEspecial.java
 * @brief     Contém a classe ContaEspecial e a implementação de mseus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1
 */

/**
 * @class   ContaEspecial
 */ 
public class ContaEspecial extends ContaBancaria{
  
  /// ATRIBUTO
  
  /**<  Limite da conta especial */
  private double limite;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ContaEspecial(){
    super();
    limite = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   cliente         Nome do cliente dono da conta especial
   * @param   numeroDaconta   Número da conta especial
   * @param   saldo           Saldo da conta especial
   * @param   limite          Limite da conta especial
   */ 
  public ContaEspecial(String cliente, int numeroDaconta, double saldo, double limite){
    super(cliente, numeroDaconta, saldo);
    this.limite= limite;
  }  
  
  /**
   * @brief     Método get do atributo limite
   * @return    Limite da conta especial
   */ 
  public double getLimite(){ return limite; }
  
  /**
   * @brief     Método set do atributo limite
   * @param     limite    Limite do atributo
   */ 
  public void setLimite(double limite){ this.limite = limite;} 
  
  /**
   * @brief   Retira do saldo o valor dado como entrada
   * @param   valor   Quantia a ser sacada da conta bancária
   * @return  true se a operação foi realizada com sucesso senão false
   */ 
  public boolean sacar(double valor){
    if( valor > limite + saldo){
      return false;
    }
    
    saldo = saldo - valor;
    
    return true;
    
  }
  
  /**
   * @brief     Transforma os atributos em uma string
   * @return    Atributos em formato de String
   */
  public String toString(){
    return  super.toString() + "\nLimite: " + this.limite; 
  }
  
}
