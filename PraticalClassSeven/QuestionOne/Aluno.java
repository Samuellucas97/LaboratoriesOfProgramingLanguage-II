/**
 * @file	Aluno.java
 * @brief	Contém a classe Aluno e a implementação de seus métodos 
 * @author	Samuel Lucas de Moura Ferino
 * @since	28.03.2018
 * @version	0.0.3
 */

/**
 * @class	Aluno
 */	 	
public class Aluno{

	/// ATRIBTUTOS	
	
	/**<	Primeira prova */
    private Prova prova1;
	/**< 	Segunda prova */	
    private Prova prova2;
	    
    /// MÉTODOS
    
	/**
 	 * @brief 	Construtor padrão
	 */	
    public Aluno(){ 
     prova1 = new Prova(); 
     prova2 = new Prova();
    }
    
	/**
 	 * @brief 	Construtor parametrizado
	 */
    public Aluno(Prova prova1, Prova prova2){
      this.prova1 = new Prova(prova1.getNotaParte1(), prova1.getNotaParte2());
      this.prova2 = new Prova(prova2.getNotaParte1(), prova2.getNotaParte2());
    }
        
   	/**
     * @brief   Método get do atributo prova1
     * @return  Prova 1
     */ 
  	public Prova getProva1(){
      return prova1;
    }
    
   	/**
     * @brief   Método get do atributo prova2
     * @return  Prova 2
     */ 
    public Prova getProva2(){
      return prova2;
    }
    
    /**
     * @brief   Calcula a nota final do aluno através de média aritmética
     * @return 	Nota final do aluno
     */ 
    public double calcularMedia(){
      return ( prova1.calcularNotaTotal() + prova2.calcularNotaTotal() ) /2 ;
    }
}
