
  /**
  * 
  */

  import java.util.ArrayList;
  import java.util.Iterator;

  /**
  * Representa polin�mio
  * @author	Samuel Lucas de Moura Ferino
  * @version	0.0.1
  * @since	17.05.2018
  */
  public class Polinomio {

    private ArrayList<Termo> monomios; //! Vetor/Lista de mon�mios (POLIN�MIO)
    
    /**
    * Construtor padr�o
    */
    public Polinomio() {
      monomios = new ArrayList<Termo>();		
    }
    
    /**
    * Construtor parametrizado
    * @param monomio	Mon�mio adicionado � lista de termos vazia
    */
    public Polinomio(Termo monomio) {
      
      try {
        monomios = new ArrayList<Termo>();		
        monomios.add(monomio);
      }
      catch(NullPointerException e) {   /// ARGUMENTO DO M�TODO � NULO
        System.err.println(e.getMessage());
      }
      
    }
    
    /**
     * M�todo get do atributo "monomios"
     */
    public ArrayList<Termo> getMonomios(){
      return monomios;
    }

    /**
     * M�todo set do atributo "monomios"
     */
    public void setMonomios(ArrayList<Termo> monomios ){
      this.monomios = monomios;
    }
    
    /**
     * Calcula a quantidade de mon�mios que compo�m o polin�mio
     * @return	Quantidade de mon�mios
     */
    public int quantidadeDeMonomios(){
    	return this.monomios.size();
    }

    /**
    * Adiciona um termo ao polin�mio recebido como par�metro. Caso polin�mio j� tenha algum termo cujo grau seja  
    * igual, nesse caso o m�todo unifica ambos em um �nico termo, somando os getCoeficiente
    * @param novoTermo Termo a ser adicionado ao polin�mio
    */
    public boolean insere(Termo novoTermo) {
      try{
        Iterator<Termo> it = monomios.iterator(); //! Iterador que percorrer� a lista/vetor de mon�mios (POLIN�MIO)
        boolean grauDeTermoEncontrado = false; //!  Guarda se foi encontrado sim ou n�o algum termo com grau correspondete

        while(it.hasNext()){  /// PROCURANDO NO VETOR DE MON�MIOS SE H� ALGUM MON�MIO COM GRAU IGUAL AO TERMO "novoTermo"
        		
        	Termo termoDoPolinomio = it.next();
        	if( termoDoPolinomio.getGrauDoMonomio() == novoTermo.getGrauDoMonomio() ){   /// **ENCONTRADO** O TERMO COM GRAU CORRESPONDENTE
        		termoDoPolinomio.setCoeficiente( termoDoPolinomio.getCoeficiente() + novoTermo.getCoeficiente() );
        		grauDeTermoEncontrado = true;
        	}
        }
        
        if( grauDeTermoEncontrado == false){    /// CASO EM QUE N�O FOI ENCONTRADO TERMO COM GRAU CORRESPONDENTE
          monomios.add(novoTermo);

        }

        return true; 
      }
      catch(NullPointerException e ){ /// ARGUMENTO DO M�TODO NULO
    	 
    	  System.err.println( e.getMessage() );
    	  return false;
      
      }

    }

    /**
     * Realiazia a fus�o do poli�mio "p" com o polin�mio atual
     * @param p	Polinomio a ser incorporado a esse polin�mio
     */
    public void calcula(Polinomio p){

      ArrayList<Termo> listaDeMonomios = p.getMonomios();

      for(Termo i : listaDeMonomios){ /// ADICIONANDO OS MON�MIOS DO POLIN�MIO "p"
        insere(i);
      }  

    }
    
    /**
     * Imprime em uma string o polin�mio formado pela lista de mon�mios 
     */
    public String imprimePolinomio(){
      
      String polinomio = new String();

      for(Termo i: monomios){  /// PERCORRENDO A LISTA DE MON�MIOS E FORMANDO O POLIN�MIO
         polinomio=polinomio+" ("+i.getCoeficiente()+")"+"x^"+"("+i.getGrauDoMonomio()+")" + " +";
      }

      polinomio = polinomio.substring(0, polinomio.length()-2);  /// RETIRANDO O OPERADOR '+' QUE SOBROU

      return polinomio;

    }
    
    /**
     * 
     * @param args	Argumento via linha de comando 
     */
    public static void main(String[] args) {
    	System.out.println("Hello world!"+ Math.pow(2,3) );
    }
  }
