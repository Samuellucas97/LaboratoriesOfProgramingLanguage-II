/**
 * @file      RepositorioFormas.java
 * @brief     Contém a classe RepositorioFormas
 * @author    Samuel Lucas de Moura Ferino
 * @since     17.04.2018
 * @version   0.0.1
 */ 

import java.util.ArrayList;
import java.util.Random;

/**
 * @class   RepositorioFormas
 */ 
public class RepositorioFormas{

  /**<  Array contendo as formas armazenadas  */
  private ArrayList<Forma> armazem;
  /**<  Semente que guarda o valor pseudo-aleatório  */
  private Random generate;
  
  private enum formasPossiveis{
    Circulo(0), 
    Quadrado(1),
    Retangulo(2);
    
    private int forma;
    
    formasPossiveis()
    
  }
  
  public RepositorioFormas(){
    
    armazem = new ArrayList<Forma>();
    generate = new Random();
    
    
    int formaEscolhida = generate.nextInt(3);
    
    armazem.add(new formasPossiveis.formaEscolhida() );
    
    
  }
  
  
  
  
}