/**
 * @file      ContaPoupanca.java
 * @brief     Contém a classe ContaPoupanca e a implementação de mseus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1
 */

/**
 *@class  ContaPoupanca
 */ 
public class ContaPoupanca extends ContaBancaria{
  
  /// ATRIBUTO
  
  /**<  Dia de aplicar a taxa de redimento sobre o saldo */
  private int diaDeRendimento;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ContaPoupanca(){
    super();
    diaDeRendimento = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   cliente           Nome do cliente dono da conta poupança
   * @paran   numeroDaconta     Número da conta poupança
   * @param   saldo             Saldo da conta poupança
   * @param   diaDeRendimento   Dia de aplicar a taxa de rendimento sobre o saldo
   */ 
  public ContaPoupanca(String cliente, int numeroDaconta, double saldo, int diaDeRendimento){
    super(cliente, numeroDaconta, saldo);
  
    if(diaDeRendimento >= 1 && diaDeRendimento <= 30 ){
      this.diaDeRendimento = diaDeRendimento;
    }else{
      this.diaDeRendimento = 0;  
    }
    
  }  
  
  /**
   * @brief   Método get do atributo diaDeRendimento
   * @return  Dia de aplicar a taxa de rendimento sobre o saldo
   */ 
  public int getDiaDeRendimento(){ return diaDeRendimento; }
  
  /**
   * @brief   Método set do atributo diaDeRendimento
   * @param   diaDeRendimento   Dia de aplicar a taxa de rendimento sobre o saldo
   */
  public void setDiaDeRendimento(int diaDeRendimento){ this.diaDeRendimento = diaDeRendimento;} 
  
  /**
   * @brief   Calcula o novo saldo com base na taxa de rendimento
   * @param   taxaDeRendimento   Taxa de rendimento 
   * @return  true se a operação foi realizada com sucesso senão false
   */ 
  public boolean calculaNovoSaldo(double taxaDeRendimento){
    if(taxaDeRendimento <= 0){
      return false;
    }
    
    saldo = saldo*taxaDeRendimento;    
    return true;
    
  }
  
  /**
   * @brief     Transforma os atributos em uma string
   * @return    Atributos em formato de String
   */
  public String toString(){
    return  super.toString() + "\nDia de rendimento: " + this.diaDeRendimento; 
  }
  
}/**
 * @file      ContaPoupanca.java
 * @brief     Contém a classe ContaPoupanca e a implementação de mseus métodos
 * @author    Samuel Lucas de Moura Ferino
 * @since     27.03.2018
 * @version   0.0.1
 */

/**
 *@class  ContaPoupanca
 */ 
public class ContaPoupanca extends ContaBancaria{
  
  /// ATRIBUTO
  
  /**<  Dia de aplicar a taxa de redimento sobre o saldo */
  private int diaDeRendimento;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ContaPoupanca(){
    super();
    diaDeRendimento = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   cliente           Nome do cliente dono da conta poupança
   * @paran   numeroDaconta     Número da conta poupança
   * @param   saldo             Saldo da conta poupança
   * @param   diaDeRendimento   Dia de aplicar a taxa de rendimento sobre o saldo
   */ 
  public ContaPoupanca(String cliente, int numeroDaconta, double saldo, int diaDeRendimento){
    super(cliente, numeroDaconta, saldo);
  
    if(diaDeRendimento >= 1 && diaDeRendimento <= 30 ){
      this.diaDeRendimento = diaDeRendimento;
    }else{
      this.diaDeRendimento = 0;  
    }
    
  }  
  
  /**
   * @brief   Método get do atributo diaDeRendimento
   * @return  Dia de aplicar a taxa de rendimento sobre o saldo
   */ 
  public int getDiaDeRendimento(){ return diaDeRendimento; }
  
  /**
   * @brief   Método set do atributo diaDeRendimento
   * @param   diaDeRendimento   Dia de aplicar a taxa de rendimento sobre o saldo
   */
  public void setDiaDeRendimento(int diaDeRendimento){ this.diaDeRendimento = diaDeRendimento;} 
  
  /**
   * @brief   Calcula o novo saldo com base na taxa de rendimento
   * @param   taxaDeRendimento   Taxa de rendimento 
   * @return  true se a operação foi realizada com sucesso senão false
   */ 
  public boolean calculaNovoSaldo(double taxaDeRendimento){
    if(taxaDeRendimento <= 0){
      return false;
    }
    
    saldo = saldo*taxaDeRendimento;    
    return true;
    
  }
  
  /**
   * @brief     Transforma os atributos em uma string
   * @return    Atributos em formato de String
   */
  public String toString(){
    return  super.toString() + "\nDia de rendimento: " + this.diaDeRendimento; 
  }
  
}
