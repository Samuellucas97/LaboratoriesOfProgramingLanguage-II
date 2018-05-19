/**
 * 
 */

package tratamentoDeExcessao;

/**
 * Cont�m os dados de uma pessoa
 * @author 		Samuel Lucas de Moura Ferino
 * @since 		10.05.2018
 * @version 	0.0.2
 */
public class Pessoa {
	
	//// ATRIBUTOS
	
	/** 
	 * (VARI�VEL) Nome da pessoa 
	 */
	private	String nome;
	
	/**
	 * (VARI�VEL) Idade da pessoa
	 */
	private int idade;
	
	/**
	 * (VARI�VEL) Estado civil da pessoa
	 */
	private char estadoCivil;
	
	/**
	 * (VARI�VEL) Grau de aceita��o da pessoa
	 */
	private int aceitacao;
	
	//// M�TODOS P�BLICO
	
	/**
	 * Construtor padr�o 
	 */
	public Pessoa(){
		this.nome = new String("");
		this.idade = 0;
		this.estadoCivil = 'S';
		this.aceitacao = 10;
	}
	
	/**
	 * Construtor parametrizado
	 * @param nome	Nome da pessoa
	 * @param idade	Idade da pessoa
	 * @param estadoCivil	Estado civil da pessoa
	 * @param aceitacao	Grau de aceita��o da pessoa
	 */
	public Pessoa(String nome, int idade, char estadoCivil, int aceitacao){
		
		try {
			
			if( tamanhoDeNomeValido(nome) == false ) {
				throw new Exception("O nome deve conter de 5 a 50 caracteres");
			}
			if( haNumero(nome) == true ) {
				throw new Exception("O nome nao pode conter numeros");
			}
			if( idadeValida(idade) == false ) {
				throw new Exception("A idade deve ser um inteiro entre 0 a 127");
			}
			if( estadoCivilValido(estadoCivil) == false ) {
				throw new Exception("Opcao invalida no Estado Civil");
			}
			if( aceitacaoValida(aceitacao) == false ) {
				throw new Exception("O grau de aceitacao deve ser entre 0 a 10");
			}
			
			this.nome = nome;
			this.idade = idade;
			this.estadoCivil = estadoCivil;
			this.aceitacao = aceitacao;			
			
		}
		catch(Exception e) {
			System.err.println( e.getMessage() );
		}	
			
	}
	
	/// GETTERS E SETTERS
	
	/**
	 * M�todo get do atributo nome
	 * @return O nome da pessoa
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * M�todo set do atributo nome
	 * @param nome 	Novo nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * M�todo get do atributo idade
	 * @return Idade da pessoa
	 */
	public int getIdade() {
		return this.idade;
	}
	/**
	 * M�todo set do atributo idade
	 * @param idade Nova idade da pessoa
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * M�todo get do atributo estadoCivil
	 * @return Estado civil da pessoa
	 */
	public char getEstadoCivil() {
		return this.estadoCivil;
	}
	/**
	 * M�todo set do atributo estadoCivil
	 * @param estadoCivil Novo estado civil da pessoa
	 */
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	/**
	 * M�todo get do atributo aceitacao
	 * @return Grau de aceita��o
	 */
	public int getAceitacao() {
		return this.aceitacao;
	}
	/**
	 * M�todo set do atributo aceitacao
	 * @param aceitacao Novo grau de aceita��o
	 */
	public void setAceitacao(int aceitacao) {
		this.aceitacao = aceitacao;
	}
	
	/**
	 * @return Atributos da classe pessoa em forma de string  
	 */
	public String toString(){
		return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nEstado civil: " + this.estadoCivil + "\nAceitacao: " + this.aceitacao;
	}
	
	//// M�TODOS PRIVADOS
	
	/**
	 * Verifica se h� pelo menos um n�mero na string
	 * @param palavra	Palavra que ser� verificada se h� n�mero dentro dela
	 * @return True se tiver encontrado, sen�o false
	 */
	private static boolean haNumero(String palavra) {
		
		/**
		 * Vetor contendo os n�meros poss�veis
		 * Basta verificar as unidades 
		 */
		String numerosPossiveis[] = {"0","1","2","3","4","5","6","7","8","9"};
		/**
		 * Quantidade de n�meros na palavra
		 */
		int quantNumeros = 0;
		
		for( String i: numerosPossiveis) {
			if( palavra.contains(i)) {	/// ENCONTROU UM N�MERO
				++quantNumeros;
				break;
			}
		} 
		
		if(quantNumeros == 0 ){		/// A PALAVRA N�O POSSUI N�MERO 
			return false;
		}

		return true;

	}
	
	/**
	 * Verifica se o estado civil entrado est� entre os poss�veis estados civis
	 * @param estadoCivil	Estado civil entrado
	 * @return	True se for um estado civil v�lido, sen�o false
	 */
	private static boolean estadoCivilValido(char estadoCivil){
		
		if(estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {  /// ESTADO CIVIL INV�LIDO
			return false;
		}
		
		return true;
	}
	
	/**
	 * Verifica se o grau de aceita��o entrado est� dentro do intervalo v�lido
	 * @param 	aceitacao	Grau de aceita��o
	 * @return	True se for um grau de aceita��o v�lido, sen�o false
	 */
	private static boolean aceitacaoValida(int aceitacao){
		
		if( aceitacao < 0 || aceitacao > 10) { 	/// GRAU DE ACEITA��O INV�LIDO
			return false;
		}
		
		return true;
	}

	/**
	 * Verifica se o tamanho do nome entrado est� dentro do intervalo v�lido
	 * @param 	nome	String que ser� verificada seu tamanho
	 * @return	True se for um tamanho de string v�lido, sen�o false
	 */
	private static boolean tamanhoDeNomeValido(String nome){
		
		if( nome.length() < 5 || nome.length() > 50) { 	/// TAMANHO DE NOME INV�LIDO
			return false;
		}
		
		return true;
		
	}
	
	/**
	 * Verifica se a idade entrada est� dentro do intervalo v�lido
	 * @param 	idade		Idade que ser� verificado
	 * @return	True se for uma idade v�lida, sen�o false
	 */
	private static boolean idadeValida(int idade){
		
		if(idade < 0 || idade > 127) { 	/// IDADE INV�LIDA
			return false;
		}
		
		return true;
		
	}
	
	
			
}	