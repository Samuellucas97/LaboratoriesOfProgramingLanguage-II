/**
 * @file      ProfessorRegime.java
 * @brief     Contém a classe ProfessorRegime e a implementação de seus métodos    
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /**
 * @class   ProfessorRegime
 */
public class ProfessorRegime extends Professor{
  
  /// ATRIBUTOS
  
  /**<  Salário do professor */
  private double salario;

  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ProfessorRegime(){ super(); /* Vazio */ }
  
  /**
   * @class   Construtor parametrizado
   * @param   nome        Nome do professor
   * @param   matricula   Matrícula do professor
   * @param   idade       Idade do professor
   * @param   salario     Salário do professor 
   */ 
  public ProfessorRegime(String nome, String matricula, int idade, double salario){ 
    super(nome, matricula, idade);
    this.salario = salario; 
    
  }
  
  public double getSalario(){ return salario; }
  
  /**
   * @brief   Métodos set do atributo salario
   * @param   salario    Salário do professor
   */ 
  public void setSalario(double salario){ this.salario = salario; }
  
}
