/**
 * @file      Main.java
 * @brief     Contém a classe Main e alguns testes com a classe NotaAluno
 * @author    Samuel Lucas de Moura Ferino
 * @since     24.04.2018
 * @version   0.0.1 
 */ 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/**
 * @class     Main
 */ 
class Main {
  public static void main(String[] args) {  
    System.out.println("**********************TESTANDO***************************\n");
    
    /// Objetos da classe NotaAluno
    NotaAluno a1 = new NotaAluno(100, "Abner", 7.2, 5, 30);
    NotaAluno a2 = new NotaAluno(7010, "Ferino", 9.4, 4.7, 2.4);
    NotaAluno a3 = new NotaAluno(20, "Fernanda", 7, 8, 6.5);
    NotaAluno a4 = new NotaAluno(9100, "Helena", 8.7, 8.3, 7);
    NotaAluno a5 = new NotaAluno(1160,"Lucas", 9, 9, 9);
    
    ArrayList<NotaAluno> notasDaClasse = new ArrayList<NotaAluno>();
    notasDaClasse.add(a1);
    notasDaClasse.add(a2);
    notasDaClasse.add(a3);
    notasDaClasse.add(a4);
    notasDaClasse.add(a5);
    
    /**<  Iterador apontando para o ArrayList notasDaClasse não ordenado */
    Iterator<NotaAluno> it =  notasDaClasse.iterator();
    
    System.out.println("\n\nANTES DA ORDENACAO");
    
    while(it.hasNext() ){
      it.next().print();
    }
    
    Collections.sort(notasDaClasse);
    
    /**<  Iterador apontando para o ArrayList notasDaClasse já ordenado */
    Iterator<NotaAluno> it2 =  notasDaClasse.iterator();
    
    System.out.println("\n\nDEPOIS DA ORDENACAO");
    
    while(it2.hasNext() ){
      it2.next().print();
    }
    
  }
}