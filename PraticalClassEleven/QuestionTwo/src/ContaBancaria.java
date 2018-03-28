/**
 * @file      ContaBancaria.java
 * @brief     Contém a classe ContaBancaria e a implementação de seus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1
 */ 


/**
 * @class   ContaBancaria
 */ 
public class ContaBancaria{
  
  /// ATRIBUTOS 
  
  /**<  Nome do cliente dono da conta bancária */
  protected String cliente;
  /**<  Número da conta bancária */
  protected int numeroDaconta;
  /**<  Saldo da conta bancária */
  protected double saldo;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ContaBancaria(){
    cliente = new String();
    numeroDaconta = 0;
    saldo = 0;
  }

  /**
   * @brief   Construtor parametrizado
   * @param   cliente         Nome do cliente 
   * @param   numeroDaconta   Número da conta bancária
   * @param   saldo           Saldo da conta bancária
   */
  public ContaBancaria(String cliente, int numeroDaconta, double saldo){
    this.cliente = new String(cliente);
    this.numeroDaconta = numeroDaconta;
    this.saldo = saldo;
  }
  
  /**
   * @brief   Metodo get do atributo cliente
   * @return  Nome do cliente dono da conta bancária
   */ 
  public String getCliente(){ return cliente; }
  
  /**
   * @brief   Método get do atributo numeroDaconta
   * @return  Número da conta bancária
   */ 
  public int getNumeroDaConta(){ return numeroDaconta; }
  
  /**
   * @brief   Método get do atributo saldo
   * @return  Saldo da conta bancária
   */ 
  public double getSaldo(){ return saldo; }
  
  
  /**
   * @brief   Retira do saldo o valor dado como entrada
   * @param   valor   Quantia a ser sacada da conta bancária
   * @return  true se a operação foi realizada com sucesso senão false
   */ 
  public boolean sacar(double valor){
    
    if( valor <= 0){
      return false;
    }
    
    saldo = saldo - valor;
    return true;
    
  }
  
  /**
   * @brief   Adiciona ao saldo o valor dado como entrada
   * @param   valor   Quantia a ser adicionada a conta bancária
   * @return  true se a operação foi realizada com sucesso senão false
   */ 
  public boolean depositar(double valor){
  
    if( valor <= 0){
      return false;
    }
    
    saldo = saldo + valor;
    return true;
    
  }
  
  /**
   * @brief     Transforma os atributos em uma string
   * @return    Atributos em formato de String
   */
  public String toString(){
    return "Cliente: " + this.cliente + "\nNumero da conta: " + this.numeroDaconta + "\nSaldo: " + this.saldo; 
  }
  
}
