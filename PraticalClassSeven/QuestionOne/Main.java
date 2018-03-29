/**
 * @file    Main.java
 * @brief   Contém a classe Main
 * @author  Samuel Lucas de Moura Ferino
 */ 

/// PACOTES(BIBLIOTECAS) USADOS
import java.util.Iterator;
import java.util.ArrayList;

/**
 * @class   Main
 */
class Main {
  public static void main(String[] args) {

    /// TESTES

    Turma turma = new Turma();  
    turma.add(new Aluno(new Prova(4.0, 2.5), new Prova(1.0, 7.0) ) );
    turma.add(new Aluno(new Prova(6.5 ,3.5), new Prova(0.0, 3.0) ) );
    turma.add(new Aluno(new Prova(5.0 ,4.0), new Prova(6.0, 1.5) ) );
    
    System.out.println( "Media da turma: " + turma.calcularMedia() );
    
    turma.listarMediasDosAlunosEDaTurma();
  }
}

