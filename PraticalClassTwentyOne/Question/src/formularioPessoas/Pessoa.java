package formularioPessoas;

/**
 *				Contains the Pessoa class 
 * @author 		Samuel Lucas de Moura Ferino
 * @since 		08.05.2018
 * @version		0.0.2 	
 */

public class Pessoa{
  
  /// ATTRIBUTES
  
  /**	Person name   */
  private String nome;
  /**	Age of the person   */
  private int idade;
  
  /// METHODS
  
  /**
   *	Constructor class (default)
   */
  public Pessoa(){
    nome = new String("Desconhecido");
    idade = 30;
  }
  
  /**
   * 	Constructor class
   * @param nome	Person name
   * @param idade	Age of the person
   */
  public Pessoa(String nome, int idade){
    this.nome = new String(nome);
    this.idade = idade;
  }
  
  /**
   *	Modifier method of attribute nome
   * @param nome	New name of person 
   */
  public void setNome(String nome){ this.nome = nome; }

  /**
   *	Method to get attribute nome
   * @return 	Person name
   */
  public String getNome(){ return nome; }
  
  /**
   *	Modifier method of attribute idade
   * @param idade	Age of the person
   */
  public void setIdade(int idade){ this.idade = idade; }
  
  /**
   *	Method to get attribute idade
   * @return 	Age of the person
   */
  public int getIdade(){ return idade; }  
  
  @Override
  public String toString(){
	  return getNome() + " - " + getIdade() + " anos";
  }
  
}