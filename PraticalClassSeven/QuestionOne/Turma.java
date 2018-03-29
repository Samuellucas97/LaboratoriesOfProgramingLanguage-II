/**
 * @file      Turma.java
 * @brief     Contém a classe Turma e a implementação de seus métodos 
 * @author    Samuel Lucas de Moura Ferino
 * @since     28.03.2018
 * @version   0.0.1
 */
 
/// PACOTES(BIBLIOTECAS) USADOS 
import java.util.ArrayList;

/**
 * @class   Turma
 */ 
public class Turma{
   
  /// ATRIBUTOS
  
  /**<  Lista de alunos da turma */ 
  private ArrayList<Aluno> alunos;
    
  /// MÉTODOS
  
  /**
   * @brief   Construtor padrão
   */ 
  public Turma(){
    alunos = new ArrayList<Aluno>();
  }
  
  /**
   * @brief   Adiciona a lista de alunos um aluno novo 
   * @param   notaParte1Prova1  Nota da parte 1 da prova 1
   * @param   notaParte2Prova1  Nota da parte 2 da prova 2
   * @param   notaParte1Prova2  Nota da parte 1 da prova 2
   * @param   notaParte2Prova2  Nota da parte 2 da prova 2
   */ 
  public boolean add(double notaParte1Prova1, double notaParte2Prova1,
                     double notaParte1Prova2, double notaParte2Prova2){
    
    if(notaParte1Prova1 < 0 || notaParte1Prova1 > 10 ||
       notaParte2Prova1 < 0 || notaParte2Prova1 > 10 ||
       notaParte1Prova2 < 0 || notaParte1Prova2 > 10 ||
       notaParte2Prova2 < 0 || notaParte2Prova2 > 10){
      return false;
    }
    
    alunos.add(new Aluno(new Prova(notaParte1Prova1, notaParte2Prova1),
                         new Prova(notaParte1Prova2, notaParte2Prova2)
                         ) 
              );
    
    return true;
    
  }
  
  /**
   * @brief   Adiciona a lista de alunos um aluno novo 
   * @param   prova1  Prova 1
   * @param   prova2  Prova 2
   */ 
  public boolean add(Prova prova1, Prova prova2){
    
    if(prova1 == null || prova2 == null){
      return false;
    }
    
    alunos.add(new Aluno(prova1, prova2) );
    
    return true;
    
  }
  
  /**
   * @brief   Adiciona a lista de alunos um aluno novo 
   * @param   aluno  Aluno que será adicionado a turma
   */   
  public boolean add(Aluno aluno){
    
    if(aluno == null){
      return false;
    }
    
    alunos.add(aluno);
    
    return true;
    
  }
  
  /**
   * @brief   Calcula a média da turma
   * @return  Média da turma
   */ 
  public double calcularMedia(){
    
    double mediaDaTurma = 0;
    
    for(int i = 0; i < alunos.size(); ++i){
      mediaDaTurma = mediaDaTurma + alunos.get(i).calcularMedia();
    }
    
    mediaDaTurma = mediaDaTurma/ alunos.size();
    
    return mediaDaTurma;
    
  }
  
  /**
   * @brief   Lista as média dos alunos e da turma
   */ 
  public void listarMediasDosAlunosEDaTurma(){
    
    System.out.println("\nMedias dos alunos: ");
    
    for(Aluno a: alunos){
      System.out.println(a.calcularMedia());
    }
    
    System.out.println("\n");
  }
  
}
  
