
  /**
  * 
  */

  import java.util.ArrayList;
  import java.util.Iterator;

  /**
  * Representa polinômio
  * @author	Samuel Lucas de Moura Ferino
  * @version	0.0.1
  * @since	17.05.2018
  */
  public class Polinomio {

    private ArrayList<Termo> monomios; //! Vetor/Lista de monômios (POLINÔMIO)
    
    /**
    * Construtor padrão
    */
    public Polinomio() {
      monomios = new ArrayList<Termo>();		
    }
    
    /**
    * Construtor parametrizado
    * @param monomio	Monômio adicionado à lista de termos vazia
    */
    public Polinomio(Termo monomio) {
      
      try {
        monomios = new ArrayList<Termo>();		
        monomios.add(monomio);
      }
      catch(NullPointerException e) {   /// ARGUMENTO DO MÉTODO É NULO
        System.err.println(e.getMessage());
      }
      
    }
    
    /**
     * Método get do atributo "monomios"
     */
    public ArrayList<Termo> getMonomios(){
      return monomios;
    }

    /**
     * Método set do atributo "monomios"
     */
    public void setMonomios(ArrayList<Termo> monomios ){
      this.monomios = monomios;
    }
    
    /**
     * Calcula a quantidade de monômios que compoêm o polinômio
     * @return	Quantidade de monômios
     */
    public int quantidadeDeMonomios(){
    	return this.monomios.size();
    }

    /**
    * Adiciona um termo ao polinômio recebido como parâmetro. Caso polinômio já tenha algum termo cujo grau seja  
    * igual, nesse caso o método unifica ambos em um único termo, somando os getCoeficiente
    * @param novoTermo Termo a ser adicionado ao polinômio
    */
    public boolean insere(Termo novoTermo) {
      try{
        Iterator<Termo> it = monomios.iterator(); //! Iterador que percorrerá a lista/vetor de monômios (POLINÔMIO)
        boolean grauDeTermoEncontrado = false; //!  Guarda se foi encontrado sim ou não algum termo com grau correspondete

        while(it.hasNext()){  /// PROCURANDO NO VETOR DE MONÔMIOS SE HÁ ALGUM MONÔMIO COM GRAU IGUAL AO TERMO "novoTermo"
        		
        	Termo termoDoPolinomio = it.next();
        	if( termoDoPolinomio.getGrauDoMonomio() == novoTermo.getGrauDoMonomio() ){   /// **ENCONTRADO** O TERMO COM GRAU CORRESPONDENTE
        		termoDoPolinomio.setCoeficiente( termoDoPolinomio.getCoeficiente() + novoTermo.getCoeficiente() );
        		grauDeTermoEncontrado = true;
        	}
        }
        
        if( grauDeTermoEncontrado == false){    /// CASO EM QUE NÃO FOI ENCONTRADO TERMO COM GRAU CORRESPONDENTE
          monomios.add(novoTermo);

        }

        return true; 
      }
      catch(NullPointerException e ){ /// ARGUMENTO DO MÉTODO NULO
    	 
    	  System.err.println( e.getMessage() );
    	  return false;
      
      }

    }

    /**
     * Realiazia a fusão do poliômio "p" com o polinômio atual
     * @param p	Polinomio a ser incorporado a esse polinômio
     */
    public void calcula(Polinomio p){

      ArrayList<Termo> listaDeMonomios = p.getMonomios();

      for(Termo i : listaDeMonomios){ /// ADICIONANDO OS MONÔMIOS DO POLINÔMIO "p"
        insere(i);
      }  

    }
    
    /**
     * Imprime em uma string o polinômio formado pela lista de monômios 
     */
    public String imprimePolinomio(){
      
      String polinomio = new String();

      for(Termo i: monomios){  /// PERCORRENDO A LISTA DE MONÔMIOS E FORMANDO O POLINÔMIO
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
