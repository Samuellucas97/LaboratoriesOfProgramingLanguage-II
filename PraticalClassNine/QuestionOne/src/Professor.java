/**
 * @file      Professor.java
 * @brief     Contém a classe Professor e a implementação de seus métodos    
 * @author    Samuel Lucas de Moura Ferino
 * @since     22.03.2018
 * @version   0.0.1
 */ 
 
 /**
 * @class   Professor
 */ 
public class Professor
{
  /// ATRIBUTOS
  
  /**<  Nome do professor */  
  private String nome;
  /**<  Matrícula do professor */
  private String matricula;
  /**<  Idade do professor */
  private int idade;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Professor(){
    nome = new String();
    matricula = new String();
    idade = 0;
  }
  
  /**
   * @class   Construtor parametrizado
   * @param   nome        Nome do professor
   * @param   matricula   Matrícula do professor
   * @param   idade       Idade do professor
   */ 
  public Professor(String nome, String matricula, int idade){
    this.nome = new String(nome);
    this.matricula = new String (matricula);
    this.idade = idade;
  }
  
  /**
   * @brief   Métodos get do atributo nome
   * @return  Nome do professor
   */ 
  public String getNome(){ return nome; }
  
  /**
   * @brief   Métodos get do atributo matricula
   * @return  Matrícula do professor
   */ 
  public String getMatricula(){ return matricula; }
  
  /**
   * @brief   Métodos get do atributo idade
   * @return  Idade do professor
   */ 
  public int getIdade(){  return idade; }
  
  /**
   * @brief   Métodos set do atributo nome
   * @param   nome    Nome do professor
   */ 
  public void setNome(String nome){ this.nome = nome; }
  
  /**
   * @brief   Métodos set do atributo matricula
   * @param   matricula    Matrícula do professor
   */ 
  public void setMatricula(String matricula){ this.matricula = matricula;}
  
  /**
   * @brief   Métodos set do atributo idade
   * @param   idade    Idade do professor
   */ 
  public void setIdade(int idade){ this.idade = idade; }
}
