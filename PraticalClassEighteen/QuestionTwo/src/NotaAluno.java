/**
 * @file      NotaAluno.java
 * @brief     Contém a classe NotaAluno
 * @author    Samuel Lucas de Moura Ferino
 * @since     24.04.2018
 * @version   0.0.1 
 */ 

/**
 * @class     NotaAluno
 */ 
public class NotaAluno implements Comparable<NotaAluno>{
  
  /// ATRIBUTOS
  
  /**<  Matrícula do aluno */
  private int matricula;
  /**<  Nome do aluno */
  private String nomeAluno;
  /**<  Nota 1 do aluno */
  private double nota1;
  /**<  Nota 2 do aluno */
  private double nota2;
  /**<  Nota 3 do aluno */
  private double nota3;
  
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public NotaAluno(){
    matricula = 709;
    nomeAluno = new String("Desconhecido");
    nota1 = 0;
    nota2 = 0;
    nota3 = 0;
  }
  
  /**
   * @brief   Construtor parametrizado
   * @param   matricula   Matrícula do aluno
   * @param   nomeAluno   Nome do aluno
   * @param   nota1       Nota 1 do aluno
   * @param   nota2       Nota 2 do aluno
   * @param   nota3       Nota 3 do aluno
   */ 
  public NotaAluno(int matricula, String nomeAluno, 
              double nota1, double nota2, double nota3){
    this.matricula = matricula;
    
    if(!nomeAluno.equals("") )
      this.nomeAluno = new String(nomeAluno);
    else     /// NOME INVÁLIDO: String vazia
      this.nomeAluno = new String("Desconhecido");
      
    if( nota3 > 10 )    /// NOTA INVÁLIDA: acima de 10 pontos      
      this.nota3 = 10;
    else if( nota3 < 0 ) /// NOTA INVÁLIDA: abaixo de 0 pontos
      this.nota3 = 0;
    else
      this.nota3 = nota3;
      
    if( nota2 > 10 )    /// NOTA INVÁLIDA: acima de 10 pontos  
      this.nota2 = 10;
    else if( nota2 < 0 )  /// NOTA INVÁLIDA: abaixo de 0 pontos
      this.nota2 = 0;
    else
      this.nota2 = nota2;
      
    if( nota1 > 10 )      /// NOTA INVÁLIDA: acima de 10 pontos
      this.nota1 = 10;
    else if( nota1 < 0 ) /// NOTA INVÁLIDA: abaixo de 0 pontos
      this.nota1 = 0;
    else
      this.nota1 = nota1;
  }
  
  /**
   * @brief   Método get do atributo matricula 
   * @return  Matrícula do aluno
   */
  public int getMatricula(){ return matricula; }
  
  /**
   * @brief   Método get do atributo nomeAluno 
   * @return  Nome do aluno
   */
  public String getNomeAluno(){ return nomeAluno; }
  
  /**
   * @brief   Método set do atributo nota1 
   * @param   nota1     Nota 1 do aluno
   */
  public void setNota1(double nota1){ 
  
    if( nota1 > 10 )      /// NOTA INVÁLIDA: acima de 10 pontos
      this.nota1 = 10;
    else if( nota1 < 0 ) /// NOTA INVÁLIDA: abaixo de 0 pontos
      this.nota1 = 0;
    else
      this.nota1 = nota1;
    
  }
  
  /**
   * @brief   Método get do atributo nota1 
   * @return  Nota 1 do aluno
   */
  public double getNota1(){ return nota1; }

  /**
   * @brief   Método set do atributo nota2 
   * @param   nota2   Nota 2 do aluno
   */
  public void setNota2(double nota2){
  
  if( nota2 > 10 )      /// NOTA INVÁLIDA: acima de 10 pontos
    this.nota2 = 10;
  else if( nota2 < 0 ) /// NOTA INVÁLIDA: abaixo de 0 pontos
    this.nota2 = 0;
  else
    this.nota2 = nota2;
    
  }
  
  /**
   * @brief   Método get do atributo nota2 
   * @return  Nota 2 do aluno
   */
  public double getNota2(){ return nota2; }
  
  /**
   * @brief   Método set do atributo nota3 
   * @param   nota3   Nota 3 do aluno
   */
  public void setNota3(double nota3){    
    
    if( nota3 > 10 )      /// NOTA INVÁLIDA: acima de 10 pontos
      this.nota3 = 10;
    else if( nota3 < 0 ) /// NOTA INVÁLIDA: abaixo de 0 pontos
      this.nota3 = 0;
    else
      this.nota3 = nota3;
  }
  
  /**
   * @brief   Método get do atributo nota3 
   * @return  Nota 3 do aluno
   */
  public double getNota3(){ return nota3; }
  
  /**
   * @brief   Imprime os atributos e a média das notas
   */ 
  public void print(){
    System.out.println(
      "\nMatricula: " + getMatricula() +
      "\nNome do aluno: " + getNomeAluno() +
      "\nMedia (aritmetica): " + (getNota3()+getNota2()+getNota1() )/3 +
      "\nNota 1: " + getNota1() +
      "\nNota 2: " + getNota2() +
      "\nNota 3: " + getNota3() );
  }
  
  /**
   * @brief   Compara dois objetos da classe NotaAluno
   * @param   pontuacao   Objeto da classe NotaAluno
   * @return  -1 indica que o objeto atual é menor que o objeto pontuacao
   *          0 indica que ambos objetos são iguais
   *          1 indica que o objeto atual é maior que o objeto pontuacao
   */ 
  public int compareTo( NotaAluno pontuacao){
    
    if( ((this.nota3+this.nota2+this.nota1)/3) <
         ((pontuacao.getNota3()+pontuacao.getNota2()+pontuacao.getNota1())/3)
    ){
      return -1;
    }
    else if(((this.nota3+this.nota2+this.nota1)/3) ==
         ((pontuacao.getNota3()+pontuacao.getNota2()+pontuacao.getNota1())/3)
  )
    {
      return 0;
    }
    else{
      return 1;
    }
    
  }
  
}