/**
 * @file      ProfessorHorista.java
 * @brief     Contém a classe ProfessorHorista e a implementação de seus métodos    
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /**
 * @class   ProfessorHorista
 */
public class ProfessorHorista extends Professor{
  
  /// ATRIBUTOS
  
  /**<  Total de horas trabalhadas */
  private int totalHoras;
  /**<  Salário por hora */
  private String salarioHora;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public ProfessorHorista(){
    super();
    salarioHora = new String();  
  }
  
  /**
   * @class   Construtor parametrizado
   * @param   nome        Nome do professor
   * @param   matricula   Matrícula do professor
   * @param   idade       Idade do professor
   * @param   totalHoras  Total de horas trabalhadas
   */ 
  public ProfessorHorista(String nome, String matricula, int idade, String salarioHora, int totalHoras){
    super(nome, matricula, idade);  /// CONSTRUINDO A SUPER CLASSE, OU MELHOR, A CLASSE MÃE
    this.salarioHora = new String(salarioHora);
    this.totalHoras = totalHoras;
  }
  
  /**
   * @brief   Métodos get do atributo totalHoras
   * @return  Total de horas trabalhadas
   */ 
  public int getTotalHoras(){ return totalHoras; }
  
  /**
   * @brief   Métodos get do atributo salarioHora
   * @return  Salário por hora
   */ 
  public String getSalarioHora() { return salarioHora; }
 
  /**
   * @brief   Métodos set do atributo totalHoras
   * @param   totalHoras    Total de horas trabalhadas
   */ 
  public void setTotalHoras(int totalHoras) { this.totalHoras = totalHoras; }
  
  /**
   * @brief   Métodos set do atributo salarioHora
   * @param   salarioHora    Salário do professor
   */
  public void setSalarioHora(String salarioHora) { this.salarioHora = salarioHora; }
  
  /**
   * @brief   Calcula o salário de acordo com a quantidade de horas trabalhadas 
   * @return  Salário total do professor
   */
  public double salario(){
    return Double.valueOf(salarioHora)*totalHoras;
  }
}



