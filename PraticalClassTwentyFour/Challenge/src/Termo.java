/**
 * 
 */

/**
 * Representa um termo de um polin�mio
 * @author	Samuel Lucas de Moura Ferino
 * @version	0.0.5
 * @since	17.05.2018
 */
public class Termo {
	
	//// ATRIBUTOS
	
	private double coeficiente; //! Coeficiente do Termo (Mon�mio)
	private int grauDoMonomio; //! Grau do mon�mio
	
	//// M�TODOS 
	
	/// CONSTRUTORES
	
	/**
	 * Construtor padr�o
	 */
	public Termo() {
		this.coeficiente = 0;
		this.grauDoMonomio = 0;
	}
	
	/**
	 * Construtor parametrizado 
	 * @param coeficiente	Coeficiente do mon�mio
	 * @param grauDoMonomio	Grau do mon�mio
	 */
	public Termo(double coeficiente, int grauDoMonomio) {
		this.coeficiente = coeficiente;
		this.grauDoMonomio = grauDoMonomio;
	}
	
	/// GETTERS E SETTERS
	
	/**
	 * M�todo get do atributo "coeficiente"
	 * @return	Coeficiente do termo
	 */
	public double getCoeficiente() { return this.coeficiente; }
	/**
	 * M�todo set do atributo "coeficiente"
	 * @param coeficiente	Novo coeficiente do termo
	 */
	public void setCoeficiente(double coeficiente) { this.coeficiente = coeficiente;}
	
	/**
	 * M�todo get do atributo "grauDoMonomio"
	 * @return	Grau do termo
	 */
	public int getGrauDoMonomio() { return this.grauDoMonomio; }
	/**
	 * M�todo set do atributo "grauDoMonomio"
	 * @param grauDoMonomio	Novo grau do termo
	 */
	public void setGrauDoMonomio(int grauDoMonomio) { this.grauDoMonomio = grauDoMonomio;}
	
	/**
	 * Copiar� o grau e o coeficiente do termo para este objeto
	 * @param outroTermo	Termo a ser copiado
	 */
	public boolean insere(Termo outroTermo){
		try {
			this.coeficiente = outroTermo.getCoeficiente();
			this.grauDoMonomio = outroTermo.getGrauDoMonomio();
			return true;
		}
		catch(NullPointerException e) {
			System.err.println( e.getMessage() );
			return false;
		}
	}
	
	/**
	 * Calcula o valor do termo
	 * @param valorDoX	Valor do x
	 * @return	Valor do termo
	 */
	public double calcula(double valorDoX) {
		return this.coeficiente*( Math.pow(valorDoX, this.grauDoMonomio) );
	}
	
	@Override
	public String toString() {
		return "Coeficiente: " + getCoeficiente() + "  Grau: " + getGrauDoMonomio();
	}
		
}
