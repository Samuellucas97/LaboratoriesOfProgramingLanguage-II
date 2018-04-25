/**
 * @file      Calculavel.java
 * @brief     Contém a interface Calculavel
 * @author    Samuel Lucas de Moura Ferino
 * @since     24.04.2018
 * @version   0.0.3
 */ 
 
/**
 * @interface Calculavel
 */ 
public interface Calculavel{

  /// MÉTODOS

  /**
   * @brief   Soma o valor de "a" com o valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  +(a,b)
   */ 
  public abstract double soma(double a, double b);
  
  /**
   * @brief   Subtrai o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  -(a,b)
   */ 
  public abstract double subtracao(double a, double b);
  
  /**
   * @brief   Multiplica o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  *(a,b)
   */ 
  public abstract double multiplicacao(double a, double b);
 
  /**
   * @brief   Divide o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  /(a,b)
   */ 
  public abstract double divisao(double a, double b);
  
}