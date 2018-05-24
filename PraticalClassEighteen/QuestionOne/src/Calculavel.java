
/**
 * Contém a abstração das operações 
 * @author    Samuel Lucas de Moura Ferino
 * @since     24.04.2018
 * @version   0.0.3
 */ 
public interface Calculavel{

  // -> MÉTODOS

  /**
   * Soma o valor de "a" com o valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  +(a,b)
   */ 
  public abstract double soma(double a, double b);
  
  /**
   * Subtrai o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  -(a,b)
   */ 
  public abstract double subtracao(double a, double b);
  
  /**
   * Multiplica o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  *(a,b)
   */ 
  public abstract double multiplicacao(double a, double b);
 
  /**
   * Divide o valor de "a" pelo valor de "b"
   * @param   a   Primeiro operando 
   * @param   b   Segundo operando
   * @return  /(a,b)
   */ 
  public abstract double divisao(double a, double b);
  
}
