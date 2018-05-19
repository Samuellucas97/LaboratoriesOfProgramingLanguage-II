/**
 * 
 */

package tratamentoDeExcessao;

/**
 * Contém os dados de uma pessoa
 * @author 		Samuel Lucas de Moura Ferino
 * @since 		10.05.2018
 * @version 	0.0.2
 */
public class Pessoa {
	
	//// ATRIBUTOS
	
	/** 
	 * (VARIÁVEL) Nome da pessoa 
	 */
	private	String nome;
	
	/**
	 * (VARIÁVEL) Idade da pessoa
	 */
	private int idade;
	
	/**
	 * (VARIÁVEL) Estado civil da pessoa
	 */
	private char estadoCivil;
	
	/**
	 * (VARIÁVEL) Grau de aceitação da pessoa
	 */
	private int aceitacao;
	
	//// MÉTODOS PÚBLICO
	
	/**
	 * Construtor padrão 
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
	 * @param aceitacao	Grau de aceitação da pessoa
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
	 * Método get do atributo nome
	 * @return O nome da pessoa
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * Método set do atributo nome
	 * @param nome 	Novo nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Método get do atributo idade
	 * @return Idade da pessoa
	 */
	public int getIdade() {
		return this.idade;
	}
	/**
	 * Método set do atributo idade
	 * @param idade Nova idade da pessoa
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * Método get do atributo estadoCivil
	 * @return Estado civil da pessoa
	 */
	public char getEstadoCivil() {
		return this.estadoCivil;
	}
	/**
	 * Método set do atributo estadoCivil
	 * @param estadoCivil Novo estado civil da pessoa
	 */
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	/**
	 * Método get do atributo aceitacao
	 * @return Grau de aceitação
	 */
	public int getAceitacao() {
		return this.aceitacao;
	}
	/**
	 * Método set do atributo aceitacao
	 * @param aceitacao Novo grau de aceitação
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
	
	//// MÉTODOS PRIVADOS
	
	/**
	 * Verifica se há pelo menos um número na string
	 * @param palavra	Palavra que será verificada se há número dentro dela
	 * @return True se tiver encontrado, senão false
	 */
	private static boolean haNumero(String palavra) {
		
		/**
		 * Vetor contendo os números possíveis
		 * Basta verificar as unidades 
		 */
		String numerosPossiveis[] = {"0","1","2","3","4","5","6","7","8","9"};
		/**
		 * Quantidade de números na palavra
		 */
		int quantNumeros = 0;
		
		for( String i: numerosPossiveis) {
			if( palavra.contains(i)) {	/// ENCONTROU UM NÚMERO
				++quantNumeros;
				break;
			}
		} 
		
		if(quantNumeros == 0 ){		/// A PALAVRA NÃO POSSUI NÚMERO 
			return false;
		}

		return true;

	}
	
	/**
	 * Verifica se o estado civil entrado está entre os possíveis estados civis
	 * @param estadoCivil	Estado civil entrado
	 * @return	True se for um estado civil válido, senão false
	 */
	private static boolean estadoCivilValido(char estadoCivil){
		
		if(estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {  /// ESTADO CIVIL INVÁLIDO
			return false;
		}
		
		return true;
	}
	
	/**
	 * Verifica se o grau de aceitação entrado está dentro do intervalo válido
	 * @param 	aceitacao	Grau de aceitação
	 * @return	True se for um grau de aceitação válido, senão false
	 */
	private static boolean aceitacaoValida(int aceitacao){
		
		if( aceitacao < 0 || aceitacao > 10) { 	/// GRAU DE ACEITAÇÃO INVÁLIDO
			return false;
		}
		
		return true;
	}

	/**
	 * Verifica se o tamanho do nome entrado está dentro do intervalo válido
	 * @param 	nome	String que será verificada seu tamanho
	 * @return	True se for um tamanho de string válido, senão false
	 */
	private static boolean tamanhoDeNomeValido(String nome){
		
		if( nome.length() < 5 || nome.length() > 50) { 	/// TAMANHO DE NOME INVÁLIDO
			return false;
		}
		
		return true;
		
	}
	
	/**
	 * Verifica se a idade entrada está dentro do intervalo válido
	 * @param 	idade		Idade que será verificado
	 * @return	True se for uma idade válida, senão false
	 */
	private static boolean idadeValida(int idade){
		
		if(idade < 0 || idade > 127) { 	/// IDADE INVÁLIDA
			return false;
		}
		
		return true;
		
	}
	
	
			
}	